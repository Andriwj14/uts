import java.util.LinkedList;
public class JavaLinkedList {
public static void main(String[] args) {
LinkedList<Character> list = new LinkedList<Character>();
System.out.println("Add first : A");
list.addFirst('A');
System.out.println("Add last : B");
list.addLast('B');
System.out.println("Current linked-list : " + list.toString());
System.out.println("Add first : C");
list.addFirst('C');
System.out.println("Add first : D");
list.addFirst('D');
System.out.println("Add last : E");
list.addLast('E');
System.out.println("Current linked-list : " + list.toString());
System.out.println("Remove first : " + list.removeFirst() + "removed");
System.out.println("Remove last : " + list.removeLast() + " removed");
System.out.println("Current linked-list : " + list.toString());
System.out.println("Object value on 0 : " + list.get(0));
System.out.println("Object value on 1 : " + list.get(1));
System.out.println("Object value on 2 : " + list.get(2));
System.out.println("Remove object on 1 : " + list.remove(1) + "removed");
System.out.println("Current linked-list : " + list.toString());
System.out.println("Add object on 1 : Z");
list.add(1, 'Z');
System.out.println("Add object on 3 : X");
list.add(3, 'X');
System.out.println("Current linked-list : " + list.toString());
System.out.println("Linked-list contains Y : " + list.contains('Y'));
System.out.println("Linked-list contains Z : " + list.contains('Z'));
}
}