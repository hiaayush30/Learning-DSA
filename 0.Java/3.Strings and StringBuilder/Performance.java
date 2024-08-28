public class Performance {
    public static void main(String[] args) {
        String series="";
        for (int i = 0; i < 26; i++) {   //loop runs n times
            char ch = (char) ('a' + i);
            series += ch;   //everytime a new string object is created to which the old object is copied and appended to
            //ie this also happens n times
            //O(N^2) time complexity
            //so for adding n characters in a string ,the time complexity is N^2 ie very bad
            //StringBuilder class helps us by preventing creation of additional objects but just adds the new object like arrays
        }
        System.out.println(series);
    }
}
