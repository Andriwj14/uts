import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Mahasiswa dataMhs[] = {new Mahasiswa("01","John F Kenedy","3.1"),
        new Mahasiswa("02","Putin","3.4"), new Mahasiswa("03","HiroHito","3.8"),
        new Mahasiswa("04","Obama","2.9"), new Mahasiswa("05","Hitler","3.0")
        };
        System.out.println("SEBELUM DISORTING");
        System.out.println(Arrays.toString(dataMhs));
        Arrays.sort(dataMhs, new IPKComparator());
        System.out.println("\nSESUDAH DISORTING");
        System.out.println(Arrays.toString(dataMhs));
    }
}