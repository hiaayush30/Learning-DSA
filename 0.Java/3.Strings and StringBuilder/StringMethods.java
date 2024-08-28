import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String name="Aayush";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.charAt(2));
        System.out.println("    Doraemon   ".strip());
        String name1="Bruce Wayne";
        System.out.println(Arrays.toString(name1.split(" ")));
        System.out.println(Arrays.toString(name1.split(" ")));
    }
}
