import java.util.EmptyStackException;
public class StackArray<T> implements Stack<T> {
T value[]; // array yang digunakan sebagai stack
int topOfStack; // penanda posisi ruang kosong stack
// constructor
public StackArray(int size) {
value = (T[]) new Object[size]; // inisialisasi ukuran stack
}
@Override
public boolean isEmpty() {
    // Stack kosong jika penanda ruang kosongnya ada di indeks 0
    return topOfStack == 0;
    }
    @Override
    public T pop() {
    if (isEmpty())
    throw new EmptyStackException();
    // Turunkan penanda ruang kosong satu tingkat lalu
    // ambil item pada posisi penanda tersebut
    topOfStack--;
    return value[topOfStack];
    }
    @Override
    public void push(T item) {
    // Simpan item yang dimasukkan ke ruang dimana penanda berada
    // lalu naikkan penanda satu tingkat
    value[topOfStack] = item;
    topOfStack++;
    }
    @Override
    public T peek() {
    if (isEmpty())
    throw new EmptyStackException();
    // Item puncak (peek) merupakan item yang persis berada
    // di bawah penanda
    topOfStack--;
    T temp = value[topOfStack];
    topOfStack++;
    return temp;
    }
    @Override
    public int size() {
    // Ukuran stack sama dengan indeks penanda berada
    return topOfStack;
    }
    public void printStack() {
    System.out.println("---------");
    System.out.println("Isi stack");
    System.out.println("---------");
    for (int i = topOfStack - 1; i >= 0; i--) {
        System.out.println(i + ": " + value[i]);
        }
        }
        }