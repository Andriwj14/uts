public class TestStackArrayList {
public static void main(String[] args) {
StackArrayList<String> sal = new StackArrayList<String>();
sal.push("Pink");
sal.push("Purple");
sal.push("Red");
sal.printStack();
System.out.println("Ukuran stack : " + sal.size());
String popped = sal.pop();
System.out.println("Item yang dikeluarkan : " + popped);
System.out.println("Item puncak : " + sal.peek());
sal.printStack();
System.out.println("Ukuran stack : " + sal.size());
}
}
