import java.util.Arrays;
import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        int[][] arr1={{2,3},    //arr1[0] //1st row
                      {5,6},    //arr1[1]
                      {8,9}};   //arr1[2]
        //or
        int[][] arr2=new int[3][];  //specifying number of cols is not mandatory

        int[][] arr=new int[3][2];
        Scanner sc=new Scanner(System.in);
        for (int row = 0; row < arr.length; row++) {   //looping through no. of array within the array ie rows
            for (int col = 0; col <arr[row].length ; col++) { //looping through  no. elements(columns) within each array(row)
                System.out.println("Enter value for ["+row+"],["+col+"]");
                arr[row][col]=sc.nextInt();
            }
        }
        for (int[] array:arr) {
            System.out.println(Arrays.toString(array));
        }
        System.out.println(Arrays.deepToString(arr));
    }
}
