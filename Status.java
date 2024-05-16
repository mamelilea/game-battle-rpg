// class Status
public class Status {
    boolean isWeak;
    boolean isPoisoned;
    boolean isSleeping;
    private int poisonDamage;
    private int poisonDuration;

    public Status() {
        this.isWeak = false;
        this.isPoisoned = false;
        this.isSleeping = false;
        this.poisonDamage = 0;
        this.poisonDuration = 0;
    }

    public boolean isWeak() {
        return isWeak;
    }

    public void setWeak(boolean isWeak) {
        this.isWeak = isWeak;
    }

    public boolean isPoisoned() {
        return isPoisoned;
    }

    public void setPoisoned(boolean isPoisoned, int poisonDamage, int duration) {
        this.isPoisoned = isPoisoned;
        this.poisonDamage = poisonDamage;
        this.poisonDuration = duration;
    }

    public boolean isSleeping() {
        return isSleeping;
    }

    public void setSleeping(boolean isSleeping) {
        this.isSleeping = isSleeping;
    }

    public int getPoisonDamage() {
        return poisonDamage;
    }

    public int getPoisonDuration() {
        return poisonDuration;
    }

    public void reducePoisonDuration() {
        if (poisonDuration > 0) {
            poisonDuration--;
        }
    }

    public void clearAllStatus() {
        this.isWeak = false;
        this.isPoisoned = false;
        this.isSleeping = false;
        this.poisonDamage = 0;
        this.poisonDuration = 0;
    }

    public void clearPoison() {
        this.isPoisoned = false;
        this.poisonDamage = 0;
        this.poisonDuration = 0;
    }

    public String toString() {
        return "Weak: " + isWeak + ", Poisoned: " + isPoisoned + ", Sleeping: " + isSleeping;
    }
}
