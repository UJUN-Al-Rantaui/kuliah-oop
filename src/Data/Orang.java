package Data;

public class Orang {

    private String nama;
    private int umur;
    private String alamat;

    public Orang(String nama, int umur, String alamat) {
        this.nama = nama;
        this.umur = umur;
        this.alamat = alamat;
    }

    public void perkenalan() {
        System.out.printf("""
                Nama    : %s
                Umur    : %d
                Alamat  : %s
                """,this.nama, this.umur, this.alamat);
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String toString() {
        return this.nama;
    }

}
