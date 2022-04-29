public class TestStackArray {
public static void main(String[] args) {
StackArray<String> sa = new StackArray<String>(10);
sa.push("Pink");
sa.push("Purple");
sa.push("Red");
sa.printStack();
System.out.println("Ukuran stack : " + sa.size());
String popped = sa.pop();
System.out.println("Item yang dikeluarkan : " + popped);
System.out.println("Item puncak : " + sa.peek());
sa.printStack();
System.out.println("Ukuran stack : " + sa.size());
}
}
