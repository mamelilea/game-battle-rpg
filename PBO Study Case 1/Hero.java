// Class Hero
public class Hero extends Character {
    private String name;
    private String race;
    private Weapon weapon;
    private Armor armor;

    // Constructor
    public Hero(int HP, int MP, int level, String name, String race, Weapon weapon, Armor armor) {
        super(HP, MP, level);
        this.name = name;
        this.race = race;
        this.weapon = weapon;
        this.armor = armor;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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

    public Armor getArmor() {
        return armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    // Method
    public void attack(Foe foe) {
    }
}
