public class Butterfly {
 public static void printButterfly(int n){
    for (int i = 1; i <=n/2; i++) {
        for (int j = 1; j <=n; j++) {
            if(j<=i || j>=n-i+1){
                System.out.print('*');
            }else{
                System.out.print(' ');
            }
        }
        System.out.println();
    }
    for (int i = n/2; i >=1; i--) {
        for (int j = 1; j <=n; j++) {
            if(j<=i || j>=n-i+1){
                System.out.print('*');
            }else{
                System.out.print(' ');
            }
        }
        System.out.println();
    }
 }
 public static void main(String[] args) {
    printButterfly(8);
 }   
}
