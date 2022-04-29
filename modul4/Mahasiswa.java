


import java.lang.Comparable;

public class Mahasiswa implements Comparable<Mahasiswa>{
    private String nrp;
    private String nama;
    private String IPK;
    public Mahasiswa(String nrp, String nama, String IPK) {
        this.nrp = nrp;
        this.nama = nama;
        this.IPK = IPK;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getNrp() {
        return nrp;
    }
    public void setNrp(String nrp) {
        this.nrp = nrp;
    }
    public String getIPK() {
        return IPK;
    }
    public void setIPK(String IPK) {
        this.IPK = IPK;
    }
    @Override
    public String toString() {
        return "Mahasiswa {nrp=" + nrp + " nama=" + nama + " IPK=" + IPK +"}";
    }

    @Override
    public int compareTo(Mahasiswa m) {
        return this.nrp.compareTo(m.nrp);
    }

}