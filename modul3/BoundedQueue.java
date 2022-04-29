public class BoundedQueue<T> implements Queue<T> {
private T queue[];
private int front = -1, rear = -1;
public BoundedQueue(int size) {
queue = (T[]) new Object[size];
}
public boolean isEmpty() {
return rear == -1;
}
public boolean isFull() {
return rear == queue.length - 1;
}
public void enqueue(T item) {
if (isFull()) {
System.out.println("Queue penuh, tidak dapat memasukkan item baru");
} else {
if (isEmpty()) {
front = 0;
rear = 0;
} else {
rear++;
}
queue[rear] = item;
System.out.println("Item baru disimpan pada posisi " + rear);
}
}
public T dequeue() {
if (isEmpty()) {
System.out.println("Queue kosong, tidak ada item yang dapat diambil");
return null;
} else {
T data = queue[front];
if (front == rear) {
front = -1;
rear = -1;
} else {
front++;
}
return data;
}
}
public T head() {
return isEmpty() ? null : queue[front];
}
public int size() {
return isEmpty() ? 0 : rear - front + 1;
}
public String printQueue() {
String queueStr = "";
if (isEmpty())
queueStr = "[Antrian kosong]";
else {
for (int i = front; i <= rear; i++) {
queueStr += queue[i];
if (i < rear)
queueStr += " | ";
}
}
return queueStr;
}
}