public class DecimaltoBinary {
    public static void calculateBinary(int decimal){
       int result=0;
       int power=0;
        while(decimal!=0){
          result=result+((decimal%2)*(int)Math.pow(10, power));
          power++;
          decimal/=2;
        }
        System.out.println(result);
    }
    public static void main(String[] args) {
        calculateBinary(7);
    }   
}
