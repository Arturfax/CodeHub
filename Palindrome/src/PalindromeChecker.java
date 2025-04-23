import java.util.Scanner;

    public class PalindromeChecker {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Input
            System.out.print("Enter a word: ");
            String word = scanner.nextLine();

            // Check
            if (isPalindrome(word)) {
                System.out.println("Yes, word is palindrome!");
            } else {
                System.out.println("No, word isn't palindrome.");
            }

            scanner.close();
        }

        // Method to check
        public static boolean isPalindrome(String word) {
            String reversed = "";

            // Reverse the word manually
            for (int i = word.length() - 1; i >= 0; i--) {
                reversed += word.charAt(i);
            }

            return word.equalsIgnoreCase(reversed);
        }
    }




