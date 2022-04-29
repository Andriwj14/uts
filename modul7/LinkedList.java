public interface LinkedList<T> {
    public void addFirst(T value);
    public void addLast(T value);
    public T removeFirst();
    public T removeLast();
    public boolean contains(T data);
    public String toString();
}