import java.util.Arrays;

public class MaxinArray {
    public static void main(String[] args) {
        int[] arr=new int[5];
        System.out.println(Arrays.toString(arr));
        System.out.println(arr.length);
        System.out.println(Maximum(arr,0,arr.length-1));
    }
    static int Maximum(int[] arr,int start,int end){
        if (arr==null||start>end||arr.length==0) {
            return -1;
        }
        int max=arr[start];
        for (int i = start; i <=end ; i++) {
            if (max<=arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
}
