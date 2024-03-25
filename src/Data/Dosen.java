package Data;

public class Hero {
    public string nama;
    public int hp;
    public int attack;
    public string role;
    
    public Hero(string nama,
                int hp,
                int attack,
                string role) {
        this.nama   = nama;
        this.hp     = hp;
        this.attack = attack;
        this.role   = role;
    }
    
    public String toString() {
        return
        "Nama Pahlawan  : " + this.nama +
        "HP Pahlawan    : " + this.hp +
        "Attack Pahlawan: " + this.attack +
        "Role Pahlawan: " + this.role;
    }
}