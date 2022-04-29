import java.util.*;
public class FindDups2 {
public static void main(String[] args) {
Set<String> uniques = new HashSet<String>();
Set<String> dups = new HashSet<String>();
for (String a : args)
if (!uniques.add(a))
dups.add(a);
// Hapus data-data pada set unique yang ditemukan
// juga pada set dups
uniques.removeAll(dups);
System.out.println("Kata-kata unik: " + uniques);
System.out.println("Kata-kata duplikat: " + dups);
}
}
