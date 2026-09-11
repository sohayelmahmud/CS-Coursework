import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class PSLSystemSimple {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("Teams:\n1. Isb\n2. lhr\n3. mlt\n4. qut\n5. psh\n6. kch");
        System.out.println("point condition:\n0 for lost\n1 for nr\n2 for won.");
        System.out.println("1. Submit Result\n2. Display Status\n3. Display Qualifiers");
        System.out.print("Choice: ");
        int choice = input.nextInt();
        input.nextLine();
        if (choice == 1) {
            System.out.print("team num 1: ");
            int team1 = input.nextInt();
            System.out.print("team num 2: ");
            int team2 = input.nextInt();
            System.out.print("enter point based on 1st team: ");
            int point = input.nextInt();
            submitResult(team1, team2, point);
        } else if (choice == 2) {
            displayStatus();
        } else if (choice == 3) {
            displayQualifiers();
        }
        input.close();
    }

    public static void submitResult(int team1, int team2, int point) throws Exception {
        File origFile = new File("PSL.txt");
        File tempFile = new File("temp.txt");

        if (!origFile.exists()) {
            PrintWriter writer = new PrintWriter(origFile);
            for (int i = 1; i <= 6; i++) {
                writer.println(i + " 0 0 0 0 0");
            }
            writer.close();
        }

        Scanner reader = new Scanner(origFile);
        PrintWriter writer = new PrintWriter(tempFile);

        while (reader.hasNextInt()) {
            int tNum = reader.nextInt();
            int played = reader.nextInt();
            int won = reader.nextInt();
            int lost = reader.nextInt();
            int nr = reader.nextInt();
            int points = reader.nextInt();

            if (tNum == team1) {
                played++;
                if (point == 2) {
                    won++;
                    points += 2;
                } else if (point == 0) {
                    lost++;
                } else if (point == 1) {
                    nr++;
                    points += 1;
                }
            } else if (tNum == team2) {
                played++;
                if (point == 2) {
                    lost++;
                } else if (point == 0) {
                    won++;
                    points += 2;
                } else if (point == 1) {
                    nr++;
                    points += 1;
                }
            }

            writer.println(tNum + " " + played + " " + won + " " + lost + " " + nr + " " + points);
        }

        reader.close();
        writer.close();

        origFile.delete();
        tempFile.renameTo(origFile);

        System.out.println("Result updated successfully!");
    }

    public static void displayStatus() throws Exception {
        File file = new File("PSL.txt");

        if (!file.exists()) {
            System.out.println("No records found! Please submit results first.");
            return;
        }

        Scanner reader = new Scanner(file);

        System.out.println("Teams Played Won Lost NR Points");

        while (reader.hasNextInt()) {
            int tNum = reader.nextInt();
            int played = reader.nextInt();
            int won = reader.nextInt();
            int lost = reader.nextInt();
            int nr = reader.nextInt();
            int points = reader.nextInt();

            String teamName = getTeamName(tNum);

            System.out.println(teamName + " " + played + " " + won + " " + lost + " " + nr + " " + points);
        }

        reader.close();
    }

    public static String getTeamName(int teamNum) {
        switch (teamNum) {
            case 1:
                return "Islamabad United";
            case 2:
                return "Lahore Qalandars";
            case 3:
                return "Multan Sultans";
            case 4:
                return "Quetta Gladiators";
            case 5:
                return "Peshawar Zalmi";
            case 6:
                return "Karachi Kings";
            default:
                return "Unknown";
        }
    }

    public static void displayQualifiers() throws Exception {
        File file = new File("PSL.txt");

        if (!file.exists()) {
            System.out.println("No records found!");
            return;
        }

        Scanner reader = new Scanner(file);

        int firstTeam = 0, firstPoints = -1;
        int secondTeam = 0, secondPoints = -1;

        while (reader.hasNextInt()) {
            int tNum = reader.nextInt();
            int played = reader.nextInt();
            int won = reader.nextInt();
            int lost = reader.nextInt();
            int nr = reader.nextInt();
            int points = reader.nextInt();

            if (points > firstPoints) {
                secondTeam = firstTeam;
                secondPoints = firstPoints;

                firstTeam = tNum;
                firstPoints = points;
            } else if (points > secondPoints) {
                secondTeam = tNum;
                secondPoints = points;
            }
        }
        reader.close();

        System.out.println("\n--- Qualified Teams for Final ---");
        System.out.println("1. " + getTeamName(firstTeam) + " (Points: " + firstPoints + ")");
        System.out.println("2. " + getTeamName(secondTeam) + " (Points: " + secondPoints + ")");
    }
}