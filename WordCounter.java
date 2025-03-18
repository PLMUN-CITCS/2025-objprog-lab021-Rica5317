import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.print("Enter a sentence: ");
                String sentence = scanner.nextLine();
                
                if (sentence.isBlank()) {
                    System.out.println("Please enter a valid sentence.\n");
                    continue;
                }
                
                String[] words = sentence.trim().split("\\s+");
                System.out.println("The sentence has " + words.length + " words.\n");
            }
        }
    }
}