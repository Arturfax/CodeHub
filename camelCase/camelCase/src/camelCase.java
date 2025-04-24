import java.util.Scanner;

public class camelCase {

    public int wordsCounter(String words) {
        if(words.contains(" ")) {
            System.out.println("Error: Given word is not written in camelCase(no spaces)");
            return -1;
        }
        int counter=1;
        for(int index=0;index<words.length();index++) {
            if(Character.isUpperCase(words.charAt(index))) {
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a word in camelCase structure(no spaces)");
        String words= scanner.nextLine();
        camelCase checker=new camelCase();
        int count= checker.wordsCounter(words);
        System.out.println("There are "+ count);


        scanner.close();
    }

}
