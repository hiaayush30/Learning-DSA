public class HollowInvertedHalfPyramid {
    public static void main(String[] args) {
        // *****
        // *  *
        // * *
        // **
        // *

        int num=5;
        // for (int i = 1; i <=num; i++) {
        //     if(i==1){
        //         for (int j = 1; j <=num; j++) {
        //             System.out.print('*');
        //         }
        //     }else{
        //         System.out.print('*');
        //         for (int j = 2; j <=num-i+1; j++) {
        //             if(j==num-i+1){
        //                 System.out.print('*');
        //             }else{
        //                 System.out.print(' ');
        //             }
        //         }
        //     }
        //     System.out.println();
        // } 
        for (int i = 1; i <=num; i++) {
            for (int j = 1; j <=num; j++) {
                if(i==1||j==1||j==num-i+1){
                    System.out.print('*');
                }else{
                    System.out.print(' ');
                }
            }
            System.out.println();
        }
        int num1=5;
        System.out.println((num1==5) ? 5:"false");
    }
}
