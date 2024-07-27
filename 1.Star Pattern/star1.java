
import java.util.Scanner;

public class star1 {

    public static void main(String[] args) {
        int num;
        System.out.println("Enter length");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
        System.out.println("New Pattern");
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num+1-i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
