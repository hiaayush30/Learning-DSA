

public class Factorial{
    public static int calculateFactorial(int num){
        if(num==1 || num==0){
            return 1;
        } else{
            return num* calculateFactorial(num-1);
        }      
      }
    public static void main(String[] args) {
        // int num=5; 
        // int factorial=1;
        // for(int i=1;i<=num;i++){
        //    factorial*=i;
        // }

        System.out.println(calculateFactorial(5));
    }
}