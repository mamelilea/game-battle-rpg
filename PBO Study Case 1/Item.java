// class Item
public class Item {
    private int effect;
// Constructor
    public Item(int effect) {
        this.effect = effect;
    }
// setters dan getters
    public int getEffect() {
        return effect;
    }

    // Method Hero
    public void usePotion(Hero hero) {
    }
    public void useEther(Hero hero) {
    }
    public void useElixir(Hero hero) {
    }

    // Method Foe
    public void usePotion(Foe foe) {
    }
    public void useEther(Foe foe) {
    }
    public void useElixir(Foe foe) {
    }
}
