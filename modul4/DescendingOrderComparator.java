import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

    public class DescendingOrderComparator {
        public static void main(String[] args) {
            // create an ArrayList object
            ArrayList<String> arrayList = new ArrayList<String>();
            // Add elements to Arraylist
            arrayList.add("A");
            arrayList.add("B");
            arrayList.add("C");
            arrayList.add("D");
            arrayList.add("E");
    System.out.println("Before sorting ArrayList in descending order :" +arrayList);
        Comparator<String> comparator = Collections.reverseOrder();
            Collections.sort(arrayList, comparator);
            System.out.println("After sorting ArrayList in descending order : " +arrayList);
    }
}