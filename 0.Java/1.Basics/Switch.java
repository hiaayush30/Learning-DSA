
public class Switch {

    public static void main(String[] args) {
        int n = 2;
        switch (n) {
            case 1:
                System.out.println("you selected 1!");
                break;
            case 2:
                System.out.println("you selected 2!");
                break;

            default:
                System.out.println("invalid input!");
                break;
        }
    }
}
