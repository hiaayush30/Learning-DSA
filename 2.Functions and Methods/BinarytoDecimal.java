
public class BinarytoDecimal {

    public static int calculateDecimal(int bin) {
        int decimal = 0;
        int power = 0;
        while (bin != 0) {
            int lastDigit=bin%10;   
            decimal += lastDigit*(int)Math.pow(2, power);
            power++;
            bin /= 10;
        }
        return decimal;
    }

    public static void main(String[] args) {
        int binary = 101;
        int result=calculateDecimal(binary);
        System.out.println(result);
    }
}
