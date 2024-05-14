// class Item
public interface Item {
    void use(Character character);
}

class Potion implements Item {

    @Override
    public void use(Character character) {
        if (character.isHero()) {
            character.setHP(character.getHP() + 100);
            System.out.println("Potion digunakan. HP " + character.getRace() + " naik sebesar 100.");
        } else {
            System.out.println("Potion hanya dapat digunakan oleh karakter Hero.");
        }
    }
}

class Ether implements Item {
    @Override
    public void use(Character character) {
        if (character.isHero()) {
            character.setMP(character.getMP() + 100);
            System.out.println("Ether digunakan. MP " + character.getRace() + " naik sebesar 100.");
        } else {
            System.out.println("Ether hanya dapat digunakan oleh karakter Hero.");
        }
    }
}

class Elixir implements Item {

    @Override
    public void use(Character character) {
        if (character.isHero()) {
            character.setHP(character.getHP() + 150);
            character.setMP(character.getMP() + 100);
            System.out.println("Elixir digunakan. HP " + character.getRace() + " naik sebesar 150 dan MP naik sebesar 100.");
        } else {
            System.out.println("Elixir hanya dapat digunakan oleh karakter Hero.");
        }
    }
}

class Remedy implements Item {

    @Override
    public void use(Character character) {
        character.getStatus().clearAllStatus();
        System.out.println("Remedy digunakan. Semua status efek dihilangkan dari " + character.getRace() + ".");
    }
}

class Antidote implements Item {

    @Override
    public void use(Character character) {
        character.getStatus().clearPoison();
        System.out.println("Antidote digunakan. Status Poison dihilangkan dari " + character.getRace() + ".");
    }
}