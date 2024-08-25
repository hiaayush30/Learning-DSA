public class PrimeOrNot {
    public static void main(String[] args) {
        System.out.println(checkPrime(53));
    }
    static boolean checkPrime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
