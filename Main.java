// main class

public class Main {
    public static void main(String[] args) {
        // Upcasting
        Character hero1 = new Knight(100, 50, 1, "Arthur", "Knight", new Sword("Excalibur", 25), new Armor(30));
        Character foe1 = new Elf(70, 50, 1, "Elf", new Sword("Rusty Sword", 15));

        System.out.println("=== Informasi Sebelum Pertarungan ===");
        hero1.info();
        System.out.println();
        foe1.info();
        System.out.println();
        System.out.println("====================================\n");

        // menjalankan method dari abstract class
        hero1.attack(foe1);
        foe1.attack(hero1);

        System.out.println("\n=== Informasi Setelah Pertarungan ===");
        hero1.info();
        System.out.println();
        foe1.info();
        System.out.println();
        System.out.println("====================================\n");

        // Downcasting
        if (foe1 instanceof Elf) {
            Elf foe3 = (Elf) foe1;
            foe3.heal(hero1);
        }

        // Menggunakan interface
        Item potion = new Potion();
        potion.use(hero1);

        System.out.println("\n=== Informasi Setelah Menggunakan Item ===");
        hero1.info();
        System.out.println("====================================\n");
    }
}
