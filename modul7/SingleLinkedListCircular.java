public class SingleLinkedListCircular<T> implements LinkedList<T> {
    private SNode<T> head = null;
    private SNode<T> tail = null;
    public void addFirst(T value) {
    SNode<T> node = new SNode<T>(value);
    if (head == null) {
    head = node;
    tail = node;
    } else {
    node.setNext(head);
    head = node;
    }
    tail.setNext(head);
    }
    public void addLast(T value) {
    SNode<T> node = new SNode<T>(value);
    if (tail == null) {
    head = node;
    tail = node;
    } else {
    tail.setNext(node);
    tail = node;
    }
    tail.setNext(head);
    }
    public T removeFirst() {
    if (head == null)
    return null;
    else {
    SNode<T> removed = head;
    if (head == tail) {
    head = null;
    tail = null;
    } else {
    head = head.getNext();
    tail.setNext(head);
}
removed.setNext(removed);
return removed.getValue();
}
}
public T removeLast() {
if (tail == null)
return null;
else {
SNode<T> removed = tail;
if (head == tail) {
head = null;
tail = null;
} else {
SNode<T> temp = head;
while (temp.getNext() != tail)
temp = temp.getNext();
tail = temp;
tail.setNext(head);
}
removed.setNext(removed);
return removed.getValue();
}
}
public boolean contains(T data) {
boolean found = false;
SNode<T> search = head;
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
SNode<T> reader = head;
if (reader != null) {
do {
str += (reader.getValue() + "->");
reader = reader.getNext();
} while (reader != head);
}
return str;
}
}