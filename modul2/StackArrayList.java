import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.ListIterator;
public class StackArrayList<T> implements Stack<T> {
    private ArrayList<T> stackList = null;
    public StackArrayList() {
    stackList = new ArrayList<T>();
    }
    @Override
    public boolean isEmpty() {
    return stackList.size() == 0;
    }
    @Override
    public T pop() {
    if (isEmpty()) {
    throw new EmptyStackException();
    }
    return stackList.remove(stackList.size() - 1);
    }
    @Override
    public void push(T item) {
    stackList.add(item);
    }
    @Override
    public T peek() {
    if (isEmpty()) {
    throw new EmptyStackException();
    }
    return stackList.get(stackList.size() - 1);
    }
    @Override
    public int size() {
    return stackList.size();
    }
    public void printStack() {
    System.out.println("---------");
    System.out.println("Isi stack");
    System.out.println("---------");
    ListIterator<T> li = stackList.listIterator(size());
    while (li.hasPrevious()) {
    System.out.println(li.previous());
}
}
}