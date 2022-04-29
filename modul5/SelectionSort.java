import java.lang.Comparable;
public class SelectionSort {
    public static <T extends Comparable<? super T>> void sort(T[] arr) {
    T temp;
    for (int i = 0; i < arr.length; i++) {
    int minPos = i;
    System.out.println("Iterasi " + i + " | Minpos = " + minPos);
    for (int j = i + 1; j < arr.length; j++) {
    if (arr[j].compareTo(arr[minPos]) < 0) {
    minPos = j;
    }
    System.out.println("> Cek j=" + j + " : Minpos = " + minPos);
    }
    temp = arr[i];
    arr[i] = arr[minPos];
    arr[minPos] = temp;
    System.out.print("Swap posisi " + i + "-" + minPos + " : ");
    tampil(arr);
    }
    }
    public static <T> void tampil(T data[]) {
    for (T objek : data) {
    System.out.print(objek + " ");
    }
    System.out.println();
    }
    public static void main(String[] args) {
    Integer data[] = { 3, 10, 4, 6, 8, 9, 7, 2, 1, 5 };
    System.out.print("Data awal: ");
    tampil(data);
    long awal = System.currentTimeMillis();
    sort(data);
    long selisihWaktu = System.currentTimeMillis() - awal;
    System.out.print("Data setelah diurutkan: ");
    tampil(data);
    System.out.println("Waktu pengurutan: " + selisihWaktu);
    }
}