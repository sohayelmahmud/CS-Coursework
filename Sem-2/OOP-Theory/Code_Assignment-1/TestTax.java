class Tax {
    public static final int SINGLE_FILER = 0;
    public static final int MARRIED_JOINTLY_OR_QUALIFYING_WIDOWER = 1;
    public static final int MARRIED_SEPARATELY = 2;
    public static final int HEAD_OF_HOUSEHOLD = 3;

    private int filingStatus;
    private int[][] brackets;
    private double[] rates;
    private double taxableIncome;

    public Tax() {
    }

    public Tax(int filingStatus, int[][] brackets, double[] rates,
            double taxableIncome) {
        this.filingStatus = filingStatus;
        this.brackets = brackets;
        this.rates = rates;
        this.taxableIncome = taxableIncome;
    }

    public int getFilingStatus() {
        return filingStatus;
    }

    public void setFilingStatus(int filingStatus) {
        this.filingStatus = filingStatus;
    }

    public int[][] getBrackets() {
        return brackets;
    }

    public void setBrackets(int[][] brackets) {
        this.brackets = brackets;
    }

    public double[] getRates() {
        return rates;
    }

    public void setRates(double[] rates) {
        this.rates = rates;
    }

    public double getTaxableIncome() {
        return taxableIncome;
    }

    public void setTaxableIncome(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

    public double getTax() {
        int[] limits = brackets[filingStatus];
        double tax = 0;
        double lower = 0;

        for (int i = 0; i < limits.length; i++) {
            if (taxableIncome > limits[i]) {
                tax += (limits[i] - lower) * rates[i];
                lower = limits[i];
            } else {
                tax += (taxableIncome - lower) * rates[i];
                return tax;
            }
        }

        tax += (taxableIncome - lower) * rates[rates.length - 1];
        return tax;
    }
}

public class TestTax {
    public static void main(String[] args) {
        int[][] brackets2001 = {
                { 27050, 65550, 136750, 297350 },
                { 45200, 109250, 166500, 297350 },
                { 22600, 54625, 83250, 148675 },
                { 36250, 93650, 151650, 297350 }
        };
        double[] rates2001 = { 0.15, 0.275, 0.305, 0.355, 0.391 };

        int[][] brackets2009 = {
                { 8350, 33950, 82250, 171550, 372950 },
                { 16700, 67900, 137050, 208850, 372950 },
                { 8350, 33950, 68525, 104425, 186475 },
                { 11950, 45500, 117450, 190200, 372950 }
        };
        double[] rates2009 = { 0.10, 0.15, 0.25, 0.28, 0.33, 0.35 };

        printTable("2001", brackets2001, rates2001);
        System.out.println();
        printTable("2009", brackets2009, rates2009);
    }

    public static void printTable(String year, int[][] brackets,
            double[] rates) {
        System.out.println(year + " tax table");
        System.out.printf("%-10s%12s%12s%12s%12s%n", "Income",
                "Single", "Joint", "Separate", "Head");

        Tax tax = new Tax(Tax.SINGLE_FILER, brackets, rates, 0);
        for (int income = 50000; income <= 60000; income += 1000) {
            tax.setTaxableIncome(income);
            System.out.printf("%-10d", income);
            for (int status = 0; status < 4; status++) {
                tax.setFilingStatus(status);
                System.out.printf("%12.2f", tax.getTax());
            }
            System.out.println();
        }
    }
}
