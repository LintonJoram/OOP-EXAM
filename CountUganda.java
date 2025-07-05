package countuganda;

import java.util.Scanner;

public class CountUganda {
    public static void main(String[] args) {
        // Create Scanner for user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt librarian for book description
        System.out.println("Enter the book description:");
        String description = scanner.nextLine();
        
        // Count occurrences of "Uganda" (case-insensitive)
        int count = countUgandaOccurrences(description);
        
        // Display result
        System.out.println("The word 'Uganda' appears " + count + " times in the description.");
        
        // Close scanner
        scanner.close();
    }
    
    public static int countUgandaOccurrences(String description) {
        if (description == null) {
            return 0;
        }
        
        // Convert description to lowercase for case-insensitive counting
        String lowerCaseDescription = description.toLowerCase();
        String target = "uganda";
        int count = 0;
        int index = 0;
        
        // Find all occurrences of "uganda"
        while ((index = lowerCaseDescription.indexOf(target, index)) != -1) {
            count++;
            index += target.length(); // Move past the current occurrence
        }
        
        return count;
    }
}