import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class BlogAnalyzer {
    public static void main(String[] args) {
        File inputFile = new File("BlogDraft.txt");
        File outputFile = new File("DraftSummary.txt");

        int charCount = 0;
        int wordCount = 0;
        int lineCount = 0;

        try {

            Scanner reader = new Scanner(inputFile);


            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                lineCount++;

                if (!line.trim().isEmpty()) {
                    String[] words = line.split("\\s+");
                    wordCount += words.length;
                    for (String word : words) {
                        charCount += word.length();
                    }
                }
            }
            reader.close();


            if (charCount > 0) {
                charCount--;
            }

            PrintWriter writer = new PrintWriter(outputFile);
            writer.println("Content Analysis Summary:");
            writer.println("Total Characters: " + charCount);
            writer.println("Total Words: " + wordCount);
            writer.println("Total Lines: " + lineCount);
            writer.close();

            System.out.println("Summary report generated successfully!");

        } catch (Exception e) {
            System.out.println("Error: Input file 'BlogDraft.txt' not found!");
        }
    }
}
