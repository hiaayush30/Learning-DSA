public class String1 {
    public static void main(String[] args) {
          String name="Aayush";
          String name1="Aayush";
          //name and nam1 points to the same object
        System.out.println(name==name1);   //true
        String name2=new String("Aayush");
        System.out.println(name==name2);   //false
        System.out.println(name.equals(name2));   //true
        String name3=new String("Aayush");
        System.out.println(name2==name3);  //false
    }
}
