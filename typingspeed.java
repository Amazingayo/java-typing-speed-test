package typingspeed;

import java.util.Random;
import java.util.Scanner;

public class typingspeed {
    private static final String[] SENTENCES = {
            "The quick brown fox jumps over the lazy dog.",
            "Java is a high-level, class-based, object-oriented programming language.",
            "Practice makes perfect when learning to type fast and accurately.",
            "Clean code always looks like it was written by someone who cares.",
            "Debugging is twice as hard as writing the code in the first place."
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("=========================================");
        System.out.println("      CONSOLE TYPING SPEED TEST          ");
        System.out.println("=========================================");
        System.out.println("Press ENTER when you are ready to start...");
        scanner.nextLine();

        // Pick a random sentence
        String targetSentence = SENTENCES[random.nextInt(SENTENCES.length)];

        System.out.println("\nType the following sentence and press ENTER:\n");
        System.out.println(">> " + targetSentence);
        System.out.print("\n> ");

        // Record start time
        long startTime = System.nanoTime();

        // Read user input
        String userInput = scanner.nextLine();

        // Record end time
        long endTime = System.nanoTime();

        // Calculate elapsed time in seconds and minutes
        double elapsedTimeSeconds = (endTime - startTime) / 1_000_000_000.0;
        double elapsedTimeMinutes = elapsedTimeSeconds / 60.0;

        // Calculate Accuracy
        int correctChars = 0;
        int minLength = Math.min(targetSentence.length(), userInput.length());
        for (int i = 0; i < minLength; i++) {
            if (targetSentence.charAt(i) == userInput.charAt(i)) {
                correctChars++;
            }
        }
        int maxLength = Math.max(targetSentence.length(), userInput.length());
        double accuracy = (maxLength == 0) ? 0 : ((double) correctChars / maxLength) * 100;

        // Standard WPM calculation: 1 word = 5 characters
        double grossWPM = (userInput.length() / 5.0) / elapsedTimeMinutes;
        double netWPM = (correctChars / 5.0) / elapsedTimeMinutes;

        // Display results
        System.out.println("\n-----------------------------------------");
        System.out.println("                 RESULTS                 ");
        System.out.println("-----------------------------------------");
        System.out.printf("Time Elapsed : %.2f seconds%n", elapsedTimeSeconds);
        System.out.printf("Gross WPM    : %.2f WPM%n", grossWPM);
        System.out.printf("Net WPM      : %.2f WPM (adjusted for accuracy)%n", netWPM);
        System.out.printf("Accuracy     : %.2f%%%n", accuracy);
        System.out.println("-----------------------------------------");

        scanner.close();
    }
}