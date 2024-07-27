public class BinomialCoefficient{
    public static int calculateFactorial(int num){
        if(num==1 || num==0){
            return 1;
        } else{
            return num* calculateFactorial(num-1);
        }      
      }
    public static void main(String[] args) {
           int n=5;
           int r=2;
           int binomialCoefficient=calculateFactorial(n)/(calculateFactorial(r)*(calculateFactorial(n-r)));
           System.out.println(binomialCoefficient);
    }
}