import java.util.Arrays;
public class TestMahasiswa {
public static void main(String[] args) {
        Mahasiswa dataMhs[] = {  
        new Mahasiswa("05", "Cahya"),
        new Mahasiswa("04", "Rudi"),
        new Mahasiswa("01", "Endah"),
        new Mahasiswa("03", "Rita"),
        new Mahasiswa("02", "Tika")
        };
        System.out.println("SEBELUM SORTING");
        System.out.println(Arrays.toString(dataMhs));
        Arrays.sort(dataMhs, new NamaComparator()); 
        System.out.println();
        System.out.println("SESUDAH SORTING");
        System.out.println(Arrays.toString(dataMhs));
        }
}
