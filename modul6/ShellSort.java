import java.lang.Comparable;

public class ShellSort {
    public static <T extends Comparable<? super T>> void sort(T[] arr) {
        int i, jarak;
        boolean didSwap;
        T temp;

        jarak = arr.length;

        while (jarak > 1) {
            jarak = jarak / 2;
            didSwap = true;

            while (didSwap) {
                didSwap = false;

                i = 0;
                while (i < arr.length - jarak) {
                    if (arr[i].compareTo(arr[i + jarak]) < 0) {
                        temp = arr[i];
                        arr[i] = arr[i + jarak];
                        arr[i + jarak] = temp; 

                        didSwap = true;
                    }

                    i++;

                }
            }

            System.out.print("Jarak " + jarak + " : ");
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

