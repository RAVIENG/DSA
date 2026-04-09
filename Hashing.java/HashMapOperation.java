import java.util.*;
public class HashMapOperation {
    public static void main(String[] args) {
        HashMap<String ,Integer> hm = new HashMap<>();

        hm.put("India", 102);
        hm.put("china", 150);
        hm.put("russia", 205);
        hm.put("Nepal", 100);

        System.out.println(hm);

      System.out.println(hm.get("India"));

      System.out.println(hm.containsKey("india"));

      System.out.println(hm.remove("china"));
      System.out.println(hm.get("china"));

      System.out.println(hm.size());

      System.out.println(hm.isEmpty());

      Set<String> Keys = hm.keySet();

      for (String k : Keys) {
        System.out.println("key "+k+" "+ hm.get(k));
      }

      hm.clear();

      LinkedHashMap<String , Integer> lhm = new LinkedHashMap<>();
       lhm.put("India", 102);
        lhm.put("china", 150);
        lhm.put("russia", 205);
        lhm.put("Nepal", 100);
        System.out.println(lhm);

        TreeMap<String, Integer> thm = new TreeMap<>();
        thm.put("india", 102);
        thm.put("china", 150);
        thm.put("russia", 205);
        thm.put("nepal", 100);
        System.out.println(thm);
    }
}
