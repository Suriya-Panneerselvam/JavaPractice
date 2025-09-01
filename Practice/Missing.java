public class Missing {
    public static void main(String[] args) {
    int arr[]={1,2,4,5};
    int a=0;
    int b=0;
    for(int i=0;i<=arr.length+1;i++){
        a+=i;
    }
    for(int j=0;j<arr.length;j++){
        b+=arr[j];
    }
    System.out.print(a-b);
 }     
}