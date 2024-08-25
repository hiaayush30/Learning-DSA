import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>(10);  //10 is the initial size
        //in <> we can't pass primitive,have to pass wrapper classes
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list); //we can print arraylist directly like this
        System.out.println(list.contains(3));
        list.set(0,99);
        list.remove(1);
        System.out.println(list);
        Scanner sc=new Scanner(System.in);
//        for (int i = 0; i <10 ; i++) {
//            list.add(sc.nextInt());
//        }
        System.out.println(list.get(2));
        list.addFirst(98); //when adding at 0th index
//        list.add(1,98);
        System.out.println(list);


        //Arraylists of Arraylists
        ArrayList<ArrayList<Integer>> list1=new ArrayList<>();  //you can leave the <> empty but its bad practice
        //initialisation of the elements inside the arraylist which here are arraylists themselves
        //otherwise we will not be able to get them using list.get
        for (int i = 0; i < 3; i++) {
            list1.add(new ArrayList<>());
        }
        
        //add elements (all 3 arraylists will have 3 elements each)
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list1.get(i).add(sc.nextInt());   //gets the arraylist at index i and adds to it
            }
        }
        System.out.println(list1);
    }
}
