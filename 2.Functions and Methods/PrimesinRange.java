public  class PrimesinRange{
    public static void main(String[] args) {
        int n=100;
         for(int i=2;i<=n;i++){
            boolean isPrime=true;
            for(int j=2;j<=Math.sqrt(i);j++){
                  if(i%j==0){
                    isPrime=false;
                  }
            }
            if(isPrime==true){
                System.out.println(i);
            }
         }
    }
}