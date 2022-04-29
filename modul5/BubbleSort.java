import java.lang.Comparable;
public class BubbleSort {
    public static <T extends Comparable<? super T>> void sort(T[] arr) {
        int i = 0, j;
        T temp;
        Boolean didSwap = true; // flag
    while (i < arr.length - 1 && didSwap) {
    didSwap = false;

        for (i = 0; i < arr.length - 1; i++) {
    for (j = 0; j < arr.length - i - 1; j++) {
        if (arr[j].compareTo(arr[j + 1]) > 0) {
            temp = arr[j + 1];
            arr[j + 1] = arr[j];
            arr[j] = temp;
            didSwap = true;
            }
        // log tahapan sorting
    System.out.print("Iterasi " + i + "." + j + " : ");
    tampil(arr);
    }
    i++;
    }
    }
    }
    public static <T> void tampil(T data[]) {
    for (T objek : data) {
        System.out.print(objek + " ");
    }
        System.out.println();
    }
    public static void main(String[] args) {
    Integer data[] = {10, 1, 2, 3, 4, 5, 6, 7, 8, 9  };
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
