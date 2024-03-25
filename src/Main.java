
import Data.Orang;
import Data.Mahasiswa;

public class Main {
    public static void main(String[] args) {

        Orang ujun = new Orang(
                "Muhammad Junaidi",
                19,
                "Tanah Laut"
        );

        ujun.perkenalan();
        
        Mahasiswa junaidi = new Mahasiswa(
            "2210010097",
            "Muhammad Junaidi",
            "Universitas Islam Muhammad Arsyad Al Banjari",
            "Teknik Informatika");
        
        Mahasiswa.printBio(junaidi);
    }
    
}
