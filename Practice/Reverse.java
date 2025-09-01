public class Reverse {
    public static void main(String[] args){
        String a="hello";
        String b="";
        for(int i=a.length()-1;i>=0;i--){
            b+=a.charAt(i);
        }
        System.out.print(b);
    }
    
    
}
