// Class Hero  
abstract class Hero extends Character {
    public static int numberOfHeroes = 0;
    private String name;
    private String race;
    private Weapon weapon;
    private Armor armor;

    // Constructor
    public Hero(int HP, int MP, int level, String name, String race, Weapon weapon, Armor armor) {
        super(HP, MP, level);
        this.name = name;
        this.race = race;
        this.setWeapon(weapon);
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
        if (validWeapon(weapon)) {
            this.weapon = weapon;
        } else {
            System.out.println("Invalid weapon!");
        }
    }

    public abstract boolean validWeapon(Weapon weapon);

    public Armor getArmor() {
        return armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    @Override
    public void attack(Character opponent) {
        if (this.getStatus().isSleeping()) {
            System.out.println(this.getName() + " sedang tidur dan tidak dapat menyerang.");
            return;
        }

        int damage = this.weapon.getAttackPoint();
        opponent.setHP(opponent.getHP() - damage);
        System.out.println(this.getName() + " (" + this.getRace() + ") menyerang dengan " + this.weapon.getName() + " dan memberikan " + damage + " damage.");
    };

    @Override
    public void skill(Character opponent) {
        if (this.getStatus().isSleeping()) {
            System.out.println(this.getName() + " sedang tidur dan tidak dapat menggunakan skill.");
            return;
        }

        int skillMP = 10;
        if (this.getMP() < skillMP) {
            System.out.println(this.getName() + " tidak memiliki cukup MP untuk menggunakan skill.");
            return;
        }
        this.setMP(this.getMP() - skillMP);

        int skillDamage = 30;
        opponent.takeDamage(skillDamage);
        System.out.println(this.getName() + " (" + this.getRace() + ") menggunakan skill dan memberikan " + skillDamage + " damage.");
    }

    public abstract void specialSkill(Character opponent);

    public boolean isHero() {
        return true;
    }

    public void info() {
        super.info();
        System.out.println("Name: " + getName());
        System.out.println("Weapon: " + weapon.getName() + " (Attack: " + weapon.getAttackPoint() + ")");
        System.out.println("Armor: Defense " + armor.getDefensePoint());
    }
}

class Knight extends Hero {

    public Knight(int HP, int MP, int level, String name, String race, Weapon weapon, Armor armor) {
        super(HP, MP, level, name, "Knight", weapon, armor);
    }

    public boolean validWeapon(Weapon weapon) {
        return weapon instanceof Sword;
    }

    public void specialSkill(Character opponent) {
        System.out.println(getName() + " menggunakan serangan khusus!");
    }


}

class Archer extends Hero {
    public Archer(int HP, int MP, int level, String name, String race, Weapon weapon, Armor armor) {
        super(HP, MP, level, name, "Archer", weapon, armor);
    }

    public boolean validWeapon(Weapon weapon) {
        return weapon instanceof Arrow;
    }

    @Override
    public void specialSkill(Character opponent) {
        System.out.println(getName() + " menggunakan serangan khusus!");
    }
}

class Fighter extends Hero {
    public Fighter(int HP, int MP, int level, String name, String race, Weapon weapon, Armor armor) {
        super(HP, MP, level, name, "Fighter", weapon, armor);
    }

    public boolean validWeapon(Weapon weapon) {
        return weapon instanceof Glove;
    }

    @Override
    public void specialSkill(Character opponent) {
        System.out.println(getName() + " menggunakan serangan khusus!");
    }
}

class Fairy extends Hero {
    public Fairy(int HP, int MP, int level, String name, Weapon weapon, Armor armor) {
        super(HP, MP, level, name, "Fairy", weapon, armor);
    }

    public boolean validWeapon(Weapon weapon) {
        return weapon instanceof MagicWand;
    }

    @Override
    public void specialSkill(Character opponent) {
        System.out.println(getName() + " menggunakan serangan khusus!");
    }

    public void heal (Character target) {
        int healAmount = 20;
        target.heal(healAmount);
    }
}
