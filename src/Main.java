
import Data.Orang;
import Data.Mahasiswa;
import Data.Hero;

public class Main {
    public static void main(String[] args) {

        title("Orang Class");
        Orang ujun = new Orang(
                "Muhammad Junaidi",
                19,
                "Tanah Laut");

        ujun.perkenalan();
        
        title("Mahasiswa Class");
        Mahasiswa junaidi = new Mahasiswa(
            "2210010097",
            "Muhammad Junaidi",
            "Universitas Islam Muhammad Arsyad Al Banjari",
            "Teknik Informatika");
        
        Mahasiswa.printBio(junaidi);
        
        title("Hero Class");
        Hero balmond = new Hero(
            "Balmond",
            6_000_000,
            400,
            "Fighter");
        
        System.out.println(balmond);
    }
    
    private static void title(String teks) {
        System.out.println("\n<============ " + teks + " ============>");
    }
    
}
