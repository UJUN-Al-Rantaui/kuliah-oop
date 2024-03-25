package Data;

public class Mahasiswa {
    public String npm; 
    public String nama;
    public String kampus;
    public String jurusan;
    
    public Mahasiswa(String npm,
                     String nama,
                     String kampus,
                     String jurusan) {
        this.npm = npm;
        this.nama = nama;               
        this.kampus = kampus;
        this.jurusan = jurusan;
    }
    
    public static void printBio(Mahasiswa mahasiswa) {
        System.out.printf("""
        NPM     : %s
        Nama    : %s
        Kampus  : %s
        Jurusan : %s
        """, mahasiswa.npm, mahasiswa.nama,
        mahasiswa.kampus, mahasiswa.jurusan);
    }
}