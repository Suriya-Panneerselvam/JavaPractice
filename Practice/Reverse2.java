public class Reverse2 {
     public static void main(String[] args){
        String a="hello";
        String b="";
        for(int i=0;i<a.length();i++){
            b=a.charAt(i)+b;
        }
        System.out.print(b);
    }
}
