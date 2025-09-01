import java.util.*;
public class Negative {
       public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int[]num={a,b,c,d};
        int sum=0;
        for(int nums:num){
            if(nums<0){
                sum+=nums;
            }
        }
        System.out.print(num);
        sc.close();
       }
    
}
