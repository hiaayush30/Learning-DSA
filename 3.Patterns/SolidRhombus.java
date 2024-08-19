
public class SolidRhombus {

    public static void main(String[] args) {
        int n = 6;
        int l = 2 * n - 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= l; j++) {
                if (j > l - n - i + 1 && j <= l - i + 1) {
                    System.out.print('*');
                } else {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }
    }
}
