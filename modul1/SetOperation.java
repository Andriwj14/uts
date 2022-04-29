import java.util.*;
public class SetOperation {
public static void main(String[] args) {
Set<String> s1 = new HashSet<String>();
s1.add("Australia");
s1.add("Sweden");
s1.add("Germany");
Set<String> s2 = new HashSet<String>();
s2.add("Sweden");
s2.add("France");
Set<String> union = new TreeSet<String>(s1);
union.addAll(s2); // gabungan dari s1 dan s2
printSet("Gabungan", union);
Set<String> intersect = new TreeSet<String>(s1);
intersect.retainAll(s2); // irisan dari s1 dan s2
printSet("Irisan", intersect);
}
protected static void printSet(String label, Collection<String> c) {
System.out.println("---------------- " + label + " --------------");
Iterator<String> it = c.iterator();
while (it.hasNext()) {
System.out.println(it.next());
}
}
}
