import java.util.Arrays;
import java.util.Scanner;

public class Array {
    static void changeArray(int[] arr){
        arr[0]=50;
    }
    public static void main(String[] args) {
        //Array is of fixed length
         int[] roll={1,2,3,4,5};   //roll is an object created in heap
         int[] roll1=new int[5];  //roll1 is an object created in heap
//        int[] arr  this declaration happens at compile time
//        new int[5]  the object creation and memory allocation happens at runtime ie dynamic memory allocation
        //arr is the reference variable in stack pointing to the object created in heap
        //heap objects are not continuous (depends on JVM) so array objects in java may not be continuous
         changeArray(roll);
         System.out.println(roll[0]);
         System.out.println(roll[2]);  //0

        String[] strArray=new String[5];
        System.out.println(strArray[2]); //null  which is a special literal can only be assigned and typecasted to non primitive reference type
        //null is the default value of any reference variable

        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < roll.length; i++) {
            System.out.println("Enter value of element "+(i+1));
            roll[i]=sc.nextInt();
        }
//        for(int num:roll){
//            System.out.println(num);
//        }
        System.out.println(Arrays.toString(roll));

        String[] str=new String[5];
        str[0]="Aayush";
        changeElement(str);   //strings are immutable in java ;mutable means you can change the object
        System.out.println(Arrays.toString(str));
    }
    static void changeElement(String[] string){
        string[0]="yo";
    }
}
