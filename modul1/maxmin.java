import java.util.*;

public class maxmin{
    public static void main(String[] args) {
        int[] a = {
                23,
                6,
                47,
                35,
                2,
                14
        };
        System.out.println("mencari nilai  max  dan min");
        int max=a[0];
        int min=a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i]>max){
                max = a[i];
            }else if(a[i]<min){
                min = a[i];
            }
        }
        System.out.println("nilai max = "+max);
        System.out.println("nilai min = "+min);
       
    }
}