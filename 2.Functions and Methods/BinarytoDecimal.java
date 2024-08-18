
public class BinarytoDecimal {

    public static int calculateDecimal(String binary) {
        int decimal = 0;
        int power = 0;
        int bin=Integer.parseInt(binary);   //111
        while (bin != 0) {
            int lastDigit=bin%10;    
            decimal += lastDigit*(int)Math.pow(2, power);
            power++;
            bin /= 10;
        }
        return decimal;
    }

    public static void main(String[] args) {
        String binary = "00111";
        int result=calculateDecimal(binary);
        System.out.println(result);
    }
}
