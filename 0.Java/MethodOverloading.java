public class MethodOverloading {
    //function signature =name+params combo should be unique
    public static void main(String[] args) {
        // array(); //will throw error due to ambiguity
    }
    static void fun(){}
    // static int fun(){}   //can't do
    static void fun(int a){}
    static void fun(char a){}
    static void array(int ...v){}
    static void array(String ...v){}
}
