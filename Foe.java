// Class Foe
abstract class Foe extends Character {
    private String race;
    private Weapon weapon;

    // Constructor
    public Foe(int HP, int MP, int level, String race, Weapon weapon) {
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
    public void attack(Character opponent) {
        if (this.getStatus().isSleeping()) {
            System.out.println(this.getRace() + " sedang tidur dan tidak dapat menyerang.");
            return;
        }

        int damage = this.weapon.getAttackPoint();
        opponent.takeDamage(damage);
        System.out.println(this.getRace() + " menyerang dengan " + this.weapon.getName() + " dan memberikan " + damage
                + " damage.");
    }

    public void skill(Character opponent) {
        if (this.getStatus().isSleeping()) {
            System.out.println(this.getRace() + " sedang tidur dan tidak dapat menggunakan skill.");
            return;
        }
        int skillMP = 10;
        if (this.getMP() < skillMP) {
            System.out.println(this.getRace() + " tidak memiliki cukup MP untuk menggunakan skill.");
            return;
        }

        this.setMP(this.getMP() - skillMP);

        int skillDamage = 30;
        opponent.takeDamage(skillDamage);
        System.out.println(this.getRace() + " menggunakan skill dan memberikan " + skillDamage + " damage.");
    }

    public abstract void specialSkill(Character opponent);

    public boolean isHero() {
        return false;
    }

    public void info() {
        super.info();
        System.out.println("Weapon: " + weapon.getName() + " (Attack: " + weapon.getAttackPoint() + ")");
    }
}

class Elf extends Foe {
    public Elf(int HP, int MP, int level, String race, Weapon weapon) {
        super(HP, MP, level, "Elf", weapon);
    }

    @Override
    public void specialSkill(Character opponent) {
        opponent.getStatus().setSleeping(true);
        System.out.println("Elf menggunakan skill lullaby dan membuat " + opponent.getRace() + " tertidur.");
    }

    public void heal(Character target) {
        int healAmount = 20;
        target.heal(healAmount);
        System.out.println("Elf memberikan heal ke " + target.getRace() + " dengan jumlah " + healAmount + " HP.");
    }

    public void recoverMP(Character target) {
        int recoverAmount = 15;
        target.recover(recoverAmount);
    }
}

class Dwarf extends Foe {
    public Dwarf(int HP, int MP, int level, String race, Weapon weapon) {
        super(HP, MP, level, "Dwarf", weapon);
    }

    @Override
    public void specialSkill(Character opponent) {
        System.out.println(getRace() + " menggunakan serangan khusus!");
    }
}

class Skeleton extends Foe {
    public Skeleton(int HP, int MP, int level, String race, Weapon weapon) {
        super(HP, MP, level, "Skeleton", weapon);
    }

    @Override
    public void specialSkill(Character opponent) {
        System.out.println(getRace() + " menggunakan serangan khusus!");
    }
}

class Goblin extends Foe {
    public Goblin(int HP, int MP, int level, String race, Weapon weapon) {
        super(HP, MP, level, "Goblin", weapon);
    }

    @Override
    public void specialSkill(Character opponent) {
        opponent.getStatus().setPoisoned(true, 5, 3);
        System.out.println("Goblin menggunakan skill gigit dan meracuni " + opponent.getRace() + ".");
    }
}

class Dragon extends Foe {
    public Dragon(int HP, int MP, int level, String race, Weapon weapon) {
        super(HP, MP, level, "Dragon", weapon);
    }

    @Override
    public void specialSkill(Character opponent) {
        opponent.getStatus().setWeak(true);
        System.out.println("Dragon menggunakan serangan api dan membuat " + opponent.getRace() + " lemah.");
    }
}
