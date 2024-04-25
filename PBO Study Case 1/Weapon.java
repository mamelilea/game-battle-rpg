// Class Weapon
public class Weapon {
    private String name;
    private int attackPoint;

    // Constructor
    public Weapon(String name, int attackPoint) {
        this.name = name;
        this.attackPoint = attackPoint;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAttackPoint() {
        return attackPoint;
    }

    public void setAttackPoint(int attackPoint) {
        this.attackPoint = attackPoint;
    }
}
