import java.util.Scanner;

    public class PalindromeChecker {

        public boolean palindromeCheck(String word) {
            String reversed="";

            for(int index=word.length()-1;index>=0;index--) {
                reversed+=word.charAt(index);
            }
            return word.equalsIgnoreCase(reversed);


        }
        public static void main(String[] args) {

            //Input
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a word");
            String word = scanner.nextLine();
            PalindromeChecker cheker = new PalindromeChecker();

            if (cheker.palindromeCheck(word)) {
                System.out.println("The word is a Palindrome");
            } else {
                System.out.println("The word is not a Palindrome");
            }

            scanner.close();
        }


    }



