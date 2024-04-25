public class Main {
    public static void main(String[] args) {
        // Membuat karakter hero dan musuh
        Hero hero = new Hero(100, 50, 1, "Haris", "Archer", null, null);
        Foe foe = new Foe(80, 30, 1, "Bajul", "rc", null);

        hero.attack(foe);
        foe.attack(hero);

    }
}
