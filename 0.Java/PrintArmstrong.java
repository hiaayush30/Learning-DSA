public class PrintArmstrong {
    public static void main(String[] args) {
        //num=abcd  
        //a^4 +b^4+c^4+d^4=num then it's an armstrong number

        //all 3 digit armstrong numbers
        for (int i = 100; i <=999; i++) {
            int num=i;
            int total=0;
            while(num!=0){
                total+=Math.pow((num%10), 3);
                num=num/10;
            }
            if(total==i){
                System.out.println(i);
            }
        }
        //custom fn to check if armstrong
        System.out.println(checkIfArmstrong(371));
    }
    static boolean  checkIfArmstrong(int n){
        int num=n;
        //get the no. of digits
        int count=0;
        while (num!=0) {
            count++;
            num/=10;
        }

        //calculate armstrong
        int total=0;
        num=n;
        while(num!=0){
            int digit=num%10;
            total+=Math.pow(digit, count);
            num/=10;
        }
        //check
        return (total==n);
    }
}
