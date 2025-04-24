import java.util.Scanner;

public class Main {

public String inputandCalculate(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter five numbers that are seperated by space:");

    long[] numbers = new long[5];////
    for (int i = 0; i < numbers.length; i++) {
        numbers[i] = sc.nextLong();
    }

    long total=0;
    long min=numbers[0];
    long max=numbers[0];

    for(long num : numbers){
        total+=num;
        if(num>max) max=num;
        if(num<min) min=num;
    }
    long maxSum=total-min;
    long minSum=total-max;
    return "Maximum sum is "+maxSum+ "\nMin sum is "+minSum;

}


    public static void main(String[] args) {
    String result=new Main().inputandCalculate();
    System.out.println(result);

    }
}