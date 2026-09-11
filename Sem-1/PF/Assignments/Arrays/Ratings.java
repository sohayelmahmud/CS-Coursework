public class Ratings {
    public static void main(String[] args) {
        // 40 responses array
        System.out.println("\t --- Food Rating ---");
        int[] reponses = new int[40];

        // 10 people ratings; randomly
        for (int i = 0; i < reponses.length; i++) {
            reponses[i] = (int) (Math.random() * 11);
        }

        // scale
        int[] scale = new int[10];
        for (int i = 1; i <= scale.length; i++) {
            scale[i - 1] = i;
        }

        // frequency of responses
        int[] frequency = new int[10];

        System.out.println("Rating Responses are: ");
        int sum = 0;
        for (int i = 0; i < reponses.length; i++) {
            if ((i + 11) % 10 == 0) {
                System.out.print(reponses[i] + ", ");
                System.out.println();
                sum += reponses[i];
                increaseOccurance(reponses[i], scale, frequency);
            } else {
                System.out.print(reponses[i] + ", ");
                sum += reponses[i];
                increaseOccurance(reponses[i], scale, frequency);
            }
        }
        System.out.println();

        int[] minMax = minMax(scale, frequency);
        int summary = (int) (Math.round(sum / 40.0));
        System.out.printf("Maximum no. of rating: %d\nMinimum no. of rating: %d\n",
                minMax[0], minMax[1]);
        System.out.println("Overall Rating is: " + summary);
    }
    
    private static void increaseOccurance(int scaleNum, int[] scale, int[] frequency) {
        for (int i = 0; i < scale.length; i++) {
            if (scale[i] == scaleNum) {
                frequency[i]++;
            }
        }
    }


    private static int[] minMax(int[] scale, int[] frequency) {
        int lowestFreq = Integer.MAX_VALUE, highestFreq = Integer.MIN_VALUE;
        for (int i = 0; i < scale.length; i++) {
            if (frequency[i] > highestFreq) {
                highestFreq = i;
            } else if (frequency[i] < lowestFreq) {
                lowestFreq = i;
            }
        }
        return new int[] { highestFreq, lowestFreq };
    }
}