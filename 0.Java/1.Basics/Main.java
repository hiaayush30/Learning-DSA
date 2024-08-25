
import java.util.Scanner;

public class Main {
//public means this class is available from anywhere
//class is a named group of properties and functions  1 public class Main{

    public static void main(String[] args) {  //args store the command line arguments
        System.out.println("Hello World!");
        Scanner sc = new Scanner(System.in);
        long num = 1234455066L;
        float marks = 1.23f;   //marks is identifier while 1.23 is the literal
        double number = 1232.232434;
        Integer roll = 64; //wrapper class 
        int myNum = 234_000_000;

        int yo = (int) (1.23f); //typecasting/narrowing
		int a = 257;
        byte b = (byte) a;  //257%256=1
        System.out.println(b);  //1

        //automatic type promotion in expressions
		//all the byte,short,char are promoted to int
		//if any one operand is long,double or float the whole expression will be promoted to it
        byte x=40;
		byte y=50;
		byte z=100;
		int result=(x*y)/z;   //x*y=2000  java automatically promotes each byte to int to store value during calculation
		//ie the expression itself is calculated using int and not bytes
		//BUT only works when result is of type int
		System.out.println(result);

		byte j=50;
		// j=j*2;  //gives error as int result being assigned to byte

		int n='A';
		System.out.println(n);  //65 ie unicode value
    }
}
