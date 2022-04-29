import java.util.*;
public class FindDups {
public static void main(String[] args) {
Set<String> s = new HashSet<String>();
for (String a : args)
if (!s.add(a))
System.out.println("Data duplikat terdeteksi: " + a);
System.out.println(s.size() + " entri kata berbeda: " + s);
}
}