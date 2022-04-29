import java.util.HashMap;
public class HashMapExample {
public static void main(String[] args) {
// buat objek HashMap
HashMap<String, String> ibukota = new HashMap<String, String>();
// tambahkan pasangan key-value ke dalam objek HashMap
ibukota.put("Indonesia", "Jakarta");
ibukota.put("Malaysia", "Kuala Lumpur");
ibukota.put("Inggris", "London");
cekHashMap(ibukota);
// hapus salah satu elemen HashMap
String dihapus = ibukota.remove("Malaysia");
System.out.println(dihapus + " dihapus dari HashMap");
cekHashMap(ibukota);
// bersihkan HashMap
ibukota.clear();
cekHashMap(ibukota);
}
public static void cekHashMap(HashMap<String, String> obj) {
System.out.println("Total pasangan key-value di dalam objek HashMap =" + obj.size());
System.out.println("Isi objek HashMap : " + obj);
}
}
