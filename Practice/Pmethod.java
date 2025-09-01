import java.util.*;
public class Pmethod {
    static boolean palindrome(int s2){
        int ori=s2;
        int rev=0;
        int tem=s2;
        while(tem>0){
            rev=rev*10+(tem%10);
            tem/=10;
        }
        return ori==rev;
    }
    public static void main (String[]args){
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();

        if (palindrome(n)) {
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
        s.close();
    }
}