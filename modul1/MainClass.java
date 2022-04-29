import java.util.Arrays;
public class MainClass {
public static void main(String[] args) throws Exception {
int array[] = { 23, 6, 47,35, 2, 14 };
Arrays.sort(array);
printArray("Sorted array", array);
int searchedData = 1;
int index = Arrays.binarySearch(array, searchedData);
System.out.println("Didn't find " + searchedData + " at index " +
index);
int newIndex = -index - 1;
array = insertElement(array, searchedData, newIndex);
printArray("With " + searchedData + " added", array);
}
private static void printArray(String message, int array[]) {
System.out.println(message + ": [length: " + array.length + "]");
for (int i = 0; i < array.length; i++) {
if (i != 0) {
System.out.print(", ");
}
System.out.print(array[i]);
}
System.out.println();
}
private static int[] insertElement(int original[], int element, int index)
{
int length = original.length;
int destination[] = new int[length + 1];
System.arraycopy(original, 0, destination, 0, index);
destination[index] = element;
System.arraycopy(original, index, destination, index + 1, length -
index);
return destination;
}
}
