public class DoubleLinkedListCircular<T> implements LinkedList<T> {
private DNode<T> head = null;
private DNode<T> tail = null;
public void addFirst(T value) {
DNode<T> node = new DNode<T>(value);
if (head == null) {
node.setNext(node);
node.setPrev(node);
head = node;
tail = node;
} else {
node.setNext(head);
node.setPrev(tail);
head.setPrev(node);
tail.setNext(node);
head = node;
}
}
public void addLast(T value) {
DNode<T> node = new DNode<T>(value);
if (tail == null) {
node.setNext(node);
node.setPrev(node);
head = node;
tail = node;
} else {
node.setNext(head);
node.setPrev(tail);
tail.setNext(node);
head.setPrev(node);
tail = node;
}
}
public T removeFirst() {
if (head == null)
return null;
else {
DNode<T> removed = head;
if (head == tail) {
head = null;
tail = null;
} else {
head = head.getNext();
head.setPrev(tail);
tail.setNext(head);
}
removed.setNext(removed);
removed.setPrev(removed);
return removed.getValue();
}
}
public T removeLast() {
if (tail == null)
return null;
else {
DNode<T> removed = tail;
if (head == tail) {
head = null;
tail = null;
} else {
tail = tail.getPrev();
tail.setNext(head);
head.setPrev(tail);
}
removed.setNext(removed);
removed.setPrev(removed);
return removed.getValue();
}
}
public boolean contains(T data) {
boolean found = false;
DNode<T> search = head;
if (search != null) {
do {
found = search.getValue().equals(data);
search = search.getNext();
} while (search != head && !found);
}
return found;
}
public String toString() {
String str = "";
DNode<T> reader = head;
if (reader != null) {
do {
str += reader.getValue();
if (reader.hasNext())
str += ", ";
reader = reader.getNext();
} while (reader != tail);
}
return str;
}
public T get(int position) {
return null;
}
public void add(int position, T value) {
}
public T remove(int position) {
return null;
}
}