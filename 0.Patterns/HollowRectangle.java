//Hollow Rectangle
public class HollowRectangle {
    public static void main(String[] args) {
       int num=4;
    // for (int i = 1; i <=num; i++) {
    //     for (int j = 1; j<=num; j++) {
    //         if(i!=1 && i!=num && j!=1 && j!=num){
    //             System.out.print(' ');
    //         }else{
    //             System.out.print('*');
    //         }
    //     }
    //     System.out.println();
    // }

    for (int i = 1; i <=num; i++) {
        for (int j = 1; j <=num; j++) {
            if(i==1 || i==num || j==1 || j==num){
                System.out.print('*');
            }else{
                System.out.print(' ');
            }
        }
        System.out.println();
    }
    }
}
