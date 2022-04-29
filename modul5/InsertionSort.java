import java.lang.Comparable;
public class InsertionSort {
public static <T extends Comparable<? super T>> void sort(T[] arr) {
int i, j;
T hold;
for (i = 1; i < arr.length; i++) {
hold = arr[i];
j = i;
System.out.println("Iterasi " + i + " | Hold = " + hold);
while (j > 0 && hold.compareTo(arr[j - 1]) < 0) {
arr[j] = arr[j - 1];
// log tahapan sorting
System.out.print("> j=" + j + " : ");
tampil(arr);
j--;
}
arr[j] = hold;
// log tahapan sorting
System.out.print("> j=" + j + " : ");
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
