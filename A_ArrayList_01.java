import java.util.ArrayList;

public class A_ArrayList_01 {
    public static void main(String[] args){
        // Create an ArrayList of Strings
        ArrayList<String> fruits = new ArrayList<>();

        // Add elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Grapes");

        // Access elements in the ArrayList
        System.out.println("Fruits in the list:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Get the size of the ArrayList
        int size = fruits.size();
        System.out.println("Number of fruits in the list: " + size);

        // Remove an element from the ArrayList
        fruits.remove("Banana");

        // Check if an element exists in the ArrayList
        boolean containsGrapes = fruits.contains("Grapes");
        System.out.println("Does the list contain grapes? " + containsGrapes);

        // Clear all elements from the ArrayList
        fruits.clear();

        // Check if the ArrayList is empty
        boolean isEmpty = fruits.isEmpty();
        System.out.println("Is the list empty? " + isEmpty);
    }
}
