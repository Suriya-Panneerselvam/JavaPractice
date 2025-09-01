
public class  StringPalindrome {
    public static void main(String[]args){
        String a="madam";
        String c = new StringBuilder(a).reverse().toString();
        System.out.println(c);
        if(a.equals(c)){
            System.out.print("palindrome");
        }
        else{
            System.out.print("not palindrome");
        }
    }
}