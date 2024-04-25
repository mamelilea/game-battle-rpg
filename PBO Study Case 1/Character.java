// Class Character
public class Character {
    private int HP;
    private int MP;
    private int level;

    // Constructor
    public Character(int HP, int MP, int level) {
        this.HP = HP;
        this.MP = MP;
        this.level = level;
    }

    // Getters and Setters
    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getMP() {
        return MP;
    }

    public void setMP(int MP) {
        this.MP = MP;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    // Method to take damage
    public void takeDamage(int damage) {
    }
}
