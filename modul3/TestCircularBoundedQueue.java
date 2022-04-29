public class TestCircularBoundedQueue {
public static void main(String[] args) {
CircularBoundedQueue<String> q = new CircularBoundedQueue<String>(5);
System.out.println("Jumlah antrian saat ini : " + q.size());
q.enqueue("Sinta");
q.enqueue("Agus");
q.enqueue("Ali");
System.out.println("Jumlah antrian saat ini : " + q.size());
System.out.println("Antrian : " + q.printQueue());
System.out.println("Item yang diambil : " + q.dequeue());
System.out.println("Jumlah antrian saat ini : " + q.size());
System.out.println("Antrian : " + q.printQueue());
q.enqueue("Yuli");
q.enqueue("Rahman");
q.enqueue("Nia");
System.out.println("Jumlah antrian saat ini : " + q.size());
System.out.println("Antrian : " + q.printQueue());
}
}