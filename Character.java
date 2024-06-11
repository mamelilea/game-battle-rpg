// Class Character
public abstract class Character {
    public static int numberOfCharacters = 0;
    private int HP;
    private int MP;
    private int level;
    private Status status;

    // Constructor
    public Character(int HP, int MP, int level) {
        this.HP = HP;
        this.MP = MP;
        this.level = level;
        this.status = new Status();
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

    public Status getStatus() {
        return status;
    }

    public abstract void attack(Character opponent);
    public abstract void skill(Character opponent);

    public abstract String getRace();

    public abstract boolean isHero();

    // Method to take damage
    public void takeDamage(int damage) {
        if (status.isWeak()) {
            damage *= 1.5;
        }
        HP -= damage;
    }

    public void useItem(Item item) {
        item.use(this);
    }

    public void heal(int amount) {
        HP += amount;
    }

    public void recover(int amount) {
        MP += amount;
    }


    public void info() {
        System.out.println("Race: " + getRace());
        System.out.println("HP: " + getHP());
        System.out.println("MP: " + getMP());
        System.out.println("Level: " + getLevel());
        System.out.println("Status: " + getStatus().toString());
    }

    public void heal(int amount, boolean fullHeal) {
        if (fullHeal) {
            HP = 100;
        } else {
            HP += amount;
        }
    }


}
