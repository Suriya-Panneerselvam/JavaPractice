
import java.util.*;
public class Letternd {
    public static void main(String[] args) {
         Scanner s=new Scanner(System.in);
        String str=s.next();
        char [] str1=str.toCharArray();
        Arrays.sort(str1);
        for(int i=0;i<str1.length;i++){
            if (i!=str.length()-1 && str1[i]==str1[i+1]){
                i++;
            }
            else{
                System.out.print(str1[i]);
            }
        }
    }
}
