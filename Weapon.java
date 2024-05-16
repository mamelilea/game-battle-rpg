// Class Weapon  
abstract class Weapon {
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

class Sword extends Weapon {
    public Sword(String name, int attackPoint) {
        super(name, attackPoint);
    }
}

class Arrow extends Weapon {
    public Arrow(String name, int attackPoint) {
        super(name, attackPoint);
    }
}

class Glove extends Weapon {
    public Glove(String name, int attackPoint) {
        super(name, attackPoint);
    }
}

class MagicWand extends Weapon {
    public MagicWand(String name, int attackPoint) {
        super(name, attackPoint);
    }
}
