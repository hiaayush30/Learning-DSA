
import java.util.Arrays;

public class ShadowingVarArgs {
    static int x=10;
    public static void main(String[] args) {
        System.out.println(x);  //10
// shadowing is the practice of using 2 variables with the same name within the scope wich overlaps
// shadowing primarily applies to class-level variables when a local variable or
// a parameter in a method has the same name as a class-level(or instance-level) 
// variable.
        int x;  //shadowing begins from declaration
        x=40;
        System.out.println(x); //40
        fun();
        fun2(1,2,3);
    }
    static void fun(){
        System.out.println(x); //10
    }

    static void fun2(int a,int ...v){
       //v is an array of inegers
       System.out.println(Arrays.toString(v));
    }
}
