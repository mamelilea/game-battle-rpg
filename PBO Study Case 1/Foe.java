// Class Foe
public class Foe extends Character {
    private String race;
    private Weapon weapon;

    // Constructor
    public Foe(int HP, int MP, int level, String name, String race, Weapon weapon) {
        super(HP, MP, level);
        this.race = race;
        this.weapon = weapon;
    }

    // Getters and Setters
    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    // Method
    public void attack(Hero hero) {
    }
}

