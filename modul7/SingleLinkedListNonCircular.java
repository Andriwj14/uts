public class SingleLinkedListNonCircular<T> implements LinkedList<T> {
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
    }
    public void addLast(T value) {
        SNode<T> node = new SNode<T>(value);

        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.setNext(node);
            tail = node;
        }
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
            removed.setNext(null);
        }
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
            tail.setNext(null);
        }
        return removed.getValue();
    }
}
public boolean contains(T data) {
    boolean found = false;
    SNode<T> search = head;

    while (search != null && !found) {
        found = search.getValue().equals(data);
        search = search.getNext();
    }

    return found;
}

public String toString() {
    String str = "";
    SNode<T> reader = head;

    while (reader != null) {
        str += (reader.getValue() + "->");
        reader = reader.getNext();
    }
    return str;
    }
}