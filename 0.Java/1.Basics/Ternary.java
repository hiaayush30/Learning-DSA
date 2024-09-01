import java.util.Scanner;

public class Ternary {
    public static void main(String[] args) {
        int income=120_000;
        String className;
        className=income>100_0000 ? "First": "Economy";

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        int num =sc.nextInt();
        String ans=Integer.toString(num);
        if (num%5==0 && num%3==0)
            ans="FizzBuzz";
        else if (num%5==0)
            ans="Fizz";
        else if (num%3==0)
            ans="buzz";
        System.out.println(ans);
    }
}
