import java.util.*;

public class Lettercount {
  public static void main(String[] args) {
    Scanner s= new Scanner(System.in);
    String str=s.nextLine();

    HashMap<Character, Integer> map = new HashMap<>();
    for (char c : str.toCharArray()) {
      if (map.containsKey(c)){
        map.put(c, map.get(c) + 1);
      } else {
        map.put(c, 1);
      }
    }
    for (Map.Entry<Character, Integer> entry : map.entrySet()) {
      System.out.print(entry.getKey() +""+entry.getValue() );
      }
    s.close();
    }
  }