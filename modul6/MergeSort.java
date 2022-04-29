import java.lang.Comparable;
public class MergeSort {
public static <T extends Comparable<? super T>> void merge(T[] arr, int
left, int median, int right) {
Object[] temp = new Object[arr.length];
int kiri1, kanan1, kiri2, kanan2, i, j;
kiri1 = left;
kanan1 = median;
kiri2 = median + 1;
kanan2 = right;
i = left;
while ((kiri1 <= kanan1) && (kiri2 <= kanan2)) {
if (arr[kiri1].compareTo(arr[kiri2]) <= 0) {
temp[i] = arr[kiri1];
kiri1++;
} else {
temp[i] = arr[kiri2];
kiri2++;
}
i++;
}
while (kiri1 <= kanan1) {
temp[i] = arr[kiri1];
kiri1++;
i++;
}
while (kiri2 <= kanan2) {
temp[i] = arr[kiri2];
kiri2++;
i++;
}
j = left;
while (j <= right) {
arr[j] = (T) temp[j];
j++;
}
}
public static <T extends Comparable<? super T>> void sort(T[] arr, int l,
int r) {
int med;
if (l < r) {
med = (l + r) / 2;
sort(arr, l, med);
sort(arr, med + 1, r);
merge(arr, l, med, r);
// log tahapan sorting
System.out.print("l = " + l + ", r = " + r + ", med = " + med + " : ");
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
sort(data, 0, data.length - 1);
long selisihWaktu = System.currentTimeMillis() - awal;
System.out.print("Data setelah diurutkan: ");
tampil(data);
System.out.println("Waktu pengurutan: " + selisihWaktu);
}
}