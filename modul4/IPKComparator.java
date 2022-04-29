import java.util.Comparator;
public class IPKComparator implements Comparator<Mahasiswa> {
    public int compare(Mahasiswa m1, Mahasiswa m2) {
        return m1.getIPK().compareTo(m2.getIPK());
    }
}