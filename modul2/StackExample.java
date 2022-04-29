import java.util.Stack;
import java.util.ListIterator;
public class StackExample {
public static void main(String[] args) {
Stack<String> s = new Stack<String>();
s.push("Pink");
s.push("Purple");
s.push("Red");
printStack(s);
System.out.println("Item puncak : " + s.peek());
System.out.println("Ukuran stack : " + s.size());
System.out.println("Ambil item : " + s.pop());
System.out.println("Ukuran stack : " + s.size());
printStack(s);
System.out.println("Cari item Red : " + s.search("Red"));
System.out.println("Cari item Purple : " + s.search("Purple"));
System.out.println("Cari item Pink : " + s.search("Pink"));
System.out.println("Apakah stack kosong? : " + s.empty());
}
public static void printStack(Stack<?> s) {
System.out.println("---------");
System.out.println("Isi stack");
System.out.println("---------");
ListIterator<?> li = s.listIterator(s.size());
while (li.hasPrevious()) {
System.out.println(li.previous());
}
} 
}