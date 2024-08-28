import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a'+'b');    //adding unicode/ascii value of both =195
        System.out.println("a"+"b");  //ab ie another string object created
        //but as after this the use of "ab" is done the garbage collector will eventually take it away
        System.out.println("a"+3);   //a3
        System.out.println('a'+3);   //100
        System.out.println((char)('a'+3)); //d

        //when an integer is added with a string, it is converted to Integer that will call toString method
        //then concatenated   ie "A"+3="A"+"3"=A3

        System.out.println("Aayush"+new ArrayList<>());  //toString getting called on the ArrayList object
        System.out.println("Aayush"+new Integer(1));
//        System.out.println(new ArrayList<>()+new Integer(1));  error in this expression
        //operator + is only defined for primitives or when one of them is a string
        //in string object the + operator is being overloaded
        //in java manual operator overloading is not supported unlike in C++/Python where you can modify what an operator does
        //but this can result in poor code so Java does not allow it
    }
}
