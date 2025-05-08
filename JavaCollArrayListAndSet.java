import java.util.ArrayList;
import java.util.HashSet;

public class JavaCollArrayListAndSet {
    public static void main(String[] args) {
        // Example 1: ArrayList
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Apple");  // Allows duplicates
        System.out.println("ArrayList: " + arrayList);

        // Example 2: HashSet
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Apple");  // Duplicate will not be added
        System.out.println("HashSet: " + hashSet);
    }
}
