import java.util.HashMap;
public class KeyValueChecker {
public static void main(String[] args) {
HashMap<String, String> ibukota = new HashMap<String, String>();
ibukota.put("Indonesia", "Jakarta");
ibukota.put("Malaysia", "Kuala Lumpur");
ibukota.put("Inggris", "London");
System.out.println("Ibukota Jakarta tercatat di dalam objek HashMap : " + ibukota.containsValue("Jakarta"));
System.out.println("Negara Jepang tercatat di dalam objek HashMap : "
+ ibukota.containsKey("Jepang"));
}
}
