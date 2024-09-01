import java.text.NumberFormat;

public class MathClass {
    public static void main(String[] args) {
        //Math class defined in java.lang package which is automatically imported
        //System.out.println(Math.round(1.1f));  //returns int
        //System.out.println(Math.ceil(1.1f)); //returns a double
        //System.out.println(Math.max(3,5)); //returns a double
        //System.out.println(Math.random()); //returns a double between 0 and 1
        //System.out.println((int)Math.ceil(Math.random()*100)); //between 1 and 100

        //Formatting
        //NumberFormat is an abstract class sio cant be instantiated directly
        NumberFormat currency= NumberFormat.getCurrencyInstance();
        String result=currency.format(1234567.891);
        System.out.println(result);

        NumberFormat percent= NumberFormat.getPercentInstance();
        //returns an instance of NumberFormat class specialized for formatting num as percent
        String response=percent.format(0.1);
        System.out.println(response);
    }
}
