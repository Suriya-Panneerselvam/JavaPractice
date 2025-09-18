import java.util.*;

public class Wordcount {
  public static void main(String[] args) {
    Scanner s= new Scanner(System.in);
    String str=s.nextLine().toLowerCase();


    String[] strArr = str.split(" ");
    HashMap<String, Integer> map = new HashMap<String, Integer>();
    for (int i = 0; i < strArr.length; i++){
      if (map.containsKey(strArr[i])){
        map.put(strArr[i], map.get(strArr[i]) + 1);
      } else {
        map.put(strArr[i], 1);
      }
    }
    System.out.println(map);
    s.close();
  }
}