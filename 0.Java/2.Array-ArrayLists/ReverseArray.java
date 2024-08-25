import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void reverse(int[] arr){
        int start=0;
        int end=arr.length-1;
        System.out.println(end/2);
//        for (int i = start; i <=end/2 ; i++) {
//            int temp=arr[i];
//            arr[i]=arr[end-i];
//            arr[end-i]=temp;
//        }
        while (start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}
