public class DoubleLinkedListNonCircular<T> implements LinkedList<T> {
private DNode<T> head = null;
private DNode<T> tail = null;
public void addFirst(T value) {
DNode<T> node = new DNode<T>(value);
if (head == null) {
head = node;
tail = node;
} else {
node.setNext(head);
head.setPrev(node);
head = node;
}
}
public void addLast(T value) {
DNode<T> node = new DNode<T>(value);
if (tail == null) {
head = node;
tail = node;
} else {
tail.setNext(node);
node.setPrev(tail);
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
head.setPrev(null);
removed.setNext(null);
}
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
tail.setNext(null);
removed.setPrev(null);
}
return removed.getValue();
}
}
public boolean contains(T data) {
boolean found = false;
DNode<T> search = head;
while (search != null && !found) {
found = search.getValue().equals(data);
search = search.getNext();
}
return found;
}
public String toString() {
String str = "";
DNode<T> reader = head;
while (reader != null) {
str += reader.getValue();
if (reader.hasNext())
str += ", ";
reader = reader.getNext();
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