public class DNode<T> {
private T value;
private DNode<T> next;
private DNode<T> prev;
public DNode(T value) {
this.value = value;
}
public T getValue() {
return value;
}
public void setNext(DNode<T> nextNode) {
next = nextNode;
}
public DNode<T> getNext() {
return next;
}
public boolean hasNext() {
return next != null;
}
public void setPrev(DNode<T> prevNode) {
prev = prevNode;
}
public DNode<T> getPrev() {
return prev;
}
public boolean hasPrev() {
return prev != null;
}
}