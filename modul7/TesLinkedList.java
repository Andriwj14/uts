public class TesLinkedList {
    public static void main(String[] args) {
        LinkedList<Character> list = new
        DoubleLinkedListCircular<Character>();
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
    System.out.println("Linked-list contains A : " + list.contains('A'));
    System.out.println("Linked-list contains Z : " + list.contains('Z'));
    }
}