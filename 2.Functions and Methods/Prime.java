public class Prime {
    public static void main(String[] args) {
        int n=21;
        boolean isPrime=true;
        for(int i=2;i<=Math.sqrt(n);i++){    //or i<n or i*i<=n
           if(n%i==0){
            isPrime=false;
            break;
           }
        }
        System.out.println(isPrime);
    }
}
