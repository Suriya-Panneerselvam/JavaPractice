import java.util.*;
public class Anagram {
    public static void main(String[]args){
        String d="listen";
        String p="silent";
        char[] a = d.toCharArray();
        char[] b = p.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        boolean isAnagram=Arrays.equals(a,b);
        System.out.println("b:"+isAnagram);
    }
}