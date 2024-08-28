import java.util.Arrays;

public class PalindromeOrNot {
    public static void main(String[] args) {
        String str="abcdcba";
        System.out.println(checkPalindrome(null));
    }
    public static boolean checkPalindrome(String str){
        if(str==null||str.length()==0) return true;
        //if str was null then putting .length() first would give error
        char[] src=str.toLowerCase().toCharArray();
        int start=0;
        int end=src.length-1;
        while(start<end){
            if(src[start]!=src[end]){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
