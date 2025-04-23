import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter a sentence: ");
            String s = scanner.nextLine();

            int count = 1; 
            for (int index = 0; index < s.length(); index++) {
                if (Character.isUpperCase(s.charAt(index))) {
                    count++;
                }
            }

            System.out.println(count);
            scanner.close();
        }
    }
