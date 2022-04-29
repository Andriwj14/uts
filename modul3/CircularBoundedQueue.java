public class CircularBoundedQueue<T> implements Queue<T> {
    private T queue[];
    private int front = -1, rear = -1;
    public CircularBoundedQueue(int size) {
    queue = (T[]) new Object[size];
    }
    public boolean isEmpty() {
    return rear == -1;
    }
    public boolean isFull() {
    return size() == queue.length;
    }
    public void enqueue(T item) {
    if (isFull()) {
    System.out.println("Queue penuh, tidak dapat memasukkan item baru");
    } else {
    if (isEmpty()) {
    front = 0;
    rear = 0;
    } else {
    rear = (rear + 1) % queue.length;
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
            front = (front + 1) % queue.length;
            }
            return data;
            }
            }
            public T head() {
            return isEmpty() ? null : queue[front];
            }
            public int size() {
            if (isEmpty())
            return 0;
            else if (front <= rear)
            return rear - front + 1;
            else
            return rear + 1 + queue.length - front;
            }
            public String printQueue() {
            String queueStr = "";
            if (isEmpty())
            queueStr = "[Antrian kosong]";
            else if (front <= rear) {
            for (int i = front; i <= rear; i++) {
            queueStr += queue[i];
            if (i < rear)
            queueStr += " | ";
            }
            } else {
            for (int i = front; i < queue.length; i++)
            queueStr += queue[i] + " | ";
            for (int i = 0; i <= rear; i++) {
                queueStr += queue[i];
             if (i < rear)
             queueStr += " | ";
            }  
        }
      return queueStr;
    }
}