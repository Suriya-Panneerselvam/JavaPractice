import java.util.*;
public class VandC {
    public static void main(String[]args){
        Scanner s= new Scanner(System.in);
        String str = s.nextLine();
        char [] vowels = {'a','e','i','o','u'};
        int vcount=0;
        int ccount=0;
        char [] str1=str.toCharArray();
        for (int i=0;i<str.length();i++){
            for (int j=0;j<5;j++){
                if (str1[i]==vowels[j]){
                    vcount++;
                }
            }
            ccount++;
        }
        System.out.println(vcount);
        System.out.println(ccount);
        if ((vcount & 1)== 0){
            System.out.println("vowels is Even");
        }
        else{
            System.out.println("vowels is odd");
        }
        if ((ccount & 1) == 0){
            System.out.println("vowels is Even");
        }
        else{
            System.out.println("vowels is odd");
        }
    }
}
