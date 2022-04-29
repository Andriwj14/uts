public class ModifiedBoundedQueue<T> implements Queue<T> {
    private T queue[];
    private int rear = -1;
    public ModifiedBoundedQueue(int size) {
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
    queue[++rear] = item;
    System.out.println("Item baru disimpan pada posisi " + rear);
    }
    }
    public T dequeue() {
    if (isEmpty()) {
    System.out.println("Queue kosong, tidak ada item yang dapat diambil");
    return null;
    } else {
    T data = queue[0];
    // Majukan antrian ke depan
    for (int i = 0; i < rear; i++)
    queue[i] = queue[i + 1];
    rear--;
    return data;
    }
    }
    public T head() {
    return isEmpty() ? null : queue[0];
    }
    public int size() {
        return isEmpty() ? 0 : rear + 1;
    }
        public String printQueue() {
        String queueStr = "";
        if (isEmpty())
        queueStr = "[Antrian kosong]";
        else {
        for (int i = 0; i <= rear; i++) {
        queueStr += queue[i];
        if (i < rear)
        queueStr += " | ";
        }
        }
        return queueStr;
    }
     
}