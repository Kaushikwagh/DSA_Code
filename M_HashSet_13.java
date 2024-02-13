import java.util.HashSet;
import java.util.Iterator;
public class M_HashSet_13 {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        // Insert - Add function
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);

        // size
        System.out.println("size " + set.size());

        // print
        System.out.println(set);

        // Iterator
        Iterator it = set.iterator();
        // 1. it.next() -> start from null give next element
        // 2. it.hasNext() -> give true or false
        System.out.println("Iterator : ");
        while(it.hasNext()){
            System.out.println(it.next());
        }

        // Search - Contain function
        if(set.contains(1)){
            System.out.println("present");
        }
        if(!set.contains(5)){
            System.out.println("Not present");
        }

        //Delete - Remove function
        set.remove(1);
        if(!set.contains(1)){
            System.out.println("Deleted");
        }
    }
}
