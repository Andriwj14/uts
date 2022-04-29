import java.lang.Comparable;

public class QuickSort {
    public static <T extends Comparable<? super T>> int partition(T[] arr, int p, int r) {
        int i, j;
        T pivot, temp;

        pivot = arr[p]; 
        System.out.println("Index " + p + "-" + r + " | Pivot = " + pivot);

        i = p;
        j = r;
        while (i <= j) {
            while (pivot.compareTo(arr[j]) > 0)
                j--;
            while (pivot.compareTo(arr[i]) < 0)
                i++;
            if (i < j) {
                temp = arr[i];

                arr[i] = arr[j];
                arr[j] = temp;

                System.out.print("> Swap indeks " + i + " & " + j + ": ");
                tampil(arr);

                j--;
                i++;
            } else {
                return j;
        }
    }
    return j;
}

public static <T extends Comparable<? super T>> void sort(T[] arr, int p, int r) {
    int q;

    if (p < r) {
        q = partition(arr, p, r);
        System.out.println("=> Partisi: " + q);

        sort(arr, p, q);
        sort(arr, q + 1, r);
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
    sort(data, 0, data.length - 1);
    long selisihWaktu = System.currentTimeMillis() - awal;

    System.out.print("Data setelah diurutkan: ");
    tampil(data);

    System.out.println("Waktu pengurutan: " + selisihWaktu);
    }
}
