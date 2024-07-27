
public class BinarytoDecimal {

    public static int calculateDecimal(int bin) {
        int decimal = 0;
        int power = 0;
        while (bin != 0) {
            decimal += (bin % 10) * Math.pow(2, power);
            power++;
            bin /= 10;
        }
        return decimal;
    }

    public static void main(String[] args) {
        int binary = 101111;
        int result=calculateDecimal(binary);
        System.out.println(result);
    }
}
