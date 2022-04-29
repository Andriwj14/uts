public class SNode<T> {
private T value;
private SNode<T> next;
public SNode(T value) {
this.value = value;
}
public T getValue() {
return value;
}
public void setNext(SNode<T> nextNode) {
next = nextNode;
}
public SNode<T> getNext() {
return next;
}
public boolean hasNext() {
return next != null;
}
}
