public interface Queue<T> {
abstract boolean isEmpty();
abstract T head();
abstract T dequeue();
abstract void enqueue(T item);
abstract int size();
}