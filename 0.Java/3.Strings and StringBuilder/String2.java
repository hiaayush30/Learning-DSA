import java.util.Arrays;

public class String2 {
    public static void main(String[] args) {
        int[] arr=new int[]{1,2,3,4,5};
        String yo = null;
        System.out.println(yo);
        //anything you call in println,it calls the valueOf method which calls toString method

        System.out.println(new int[]{10,11,12});
        System.out.println(Arrays.toString(new int[]{10,11,12}));
        // you made jav to use my toString method instead of its own in  println (fn overriding)

        Integer num=new Integer(56);  //created an object instead of primitive
        System.out.println(num); //will automatically apply  valueOf and then toString to the 'object'
    }
}
