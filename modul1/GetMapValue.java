import java.util.*;
public class GetMapValue {
public static void main(String[] args) {
HashMap<String, String> ibukota = new HashMap<String, String>();
ibukota.put("Indonesia", "Jakarta");
ibukota.put("Malaysia", "Kuala Lumpur");
ibukota.put("Inggris", "London");
Set<String> daftarNegara = ibukota.keySet();
Iterator<String> negara = daftarNegara.iterator();
while (negara.hasNext()) {
String namaNegara = negara.next();
System.out.println("Ibukota negara " + namaNegara + " adalah " +
ibukota.get(namaNegara));
}
}
}