import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class N_HashMap_14 {
    public static void main(String[] args){
        HashMap<String, Integer> map = new HashMap<>();
        // Insertion Operation
        map.put("India", 120);
        map.put("USA", 20);
        map.put("China", 325);
        System.out.println(map);

        // update value
        map.put("China", 110);
        System.out.println(map);

        // Search operation
        //1. Check key is exist or not
        if(map.containsKey("China")){
            System.out.println("Present");
        } else {
            System.out.println("Not Preset");
        }
        // 2. Check key with value
        System.out.println(map.get("India"));
        System.out.println(map.get("pok")); // print null if not

        // Iteration in HashMap
        System.out.println("Iteration in HashMap");
        for(Map.Entry<String, Integer> e : map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        // Using set
        System.out.println("Print using sets ");
        Set<String> keys = map.keySet();
        for(String key : keys){
            System.out.println(key+" "+map.get(key));
        }

        // Remove pairs
        map.remove("china");
        System.out.println(map);
    }
}
