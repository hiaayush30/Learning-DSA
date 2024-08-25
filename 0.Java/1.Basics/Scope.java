public class Scope {
    public static void main(String[] args) {
        int a=10;
        { //block scope - values initialised here remain here
            // int a=78;  //can't do it
            a=78;
            int c=50;
        }
        // System.out.println(c);  //can't do it
        for (int i = 0; i < 1; i++) {   //for loop has its own scope
            System.out.println(a);
        }
    }
    static void randomFn(){  //arguments aree function scoped
        // System.out.println(a); //can't do it
    }
}
