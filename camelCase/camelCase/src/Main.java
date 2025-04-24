import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a CamelCase string (no spaces): ");
        String s = scanner.nextLine();

        // Check for spaces
        if (s.contains(" ")) {
            System.out.println("Error: The input should not contain spaces. Please use CamelCase format.");
        } else {
            int count = 1; 

            for (int index = 0; index < s.length(); index++) {
                if (Character.isUpperCase(s.charAt(index))) {
                    count++;
                }
            }

            System.out.println("Number of words: " + count);
        }

        scanner.close();
    }
}
