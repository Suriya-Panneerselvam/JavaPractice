public class count {
    public static void main(String[]args){
        String str="hello";
        int count=0;
        for (char c : str.toCharArray()){
            count++;
        }
        System.out.print(count);
    }
    
}
