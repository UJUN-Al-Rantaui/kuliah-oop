package Data;

public class Hero {
    public String nama;
    public int hp;
    public int attack;
    public String role;
    
    public Hero(String nama,
                int hp,
                int attack,
                String role) {
        this.nama   = nama;
        this.hp     = hp;
        this.attack = attack;
        this.role   = role;
    }
    
    public String toString() {
        return
        "Nama Pahlawan  : " + this.nama + "\n" +
        "HP Pahlawan    : " + this.hp + "\n" +
        "Attack Pahlawan: " + this.attack + "\n" +
        "Role Pahlawan: " + this.role;
    }
}