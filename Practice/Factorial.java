import java.util.*;
public class Factorial {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int product=1;
        for(int i=1;i<=n;i++){
            product *=i;
        }
        System.out.print(product);
        sc.close();
    }
}