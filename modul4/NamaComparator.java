import java.util.Comparator;
public class NamaComparator implements Comparator<Mahasiswa> {
    public int compare(Mahasiswa m1, Mahasiswa m2) {
        return m1.getNama().compareTo(m2.getNama());
    }
}
