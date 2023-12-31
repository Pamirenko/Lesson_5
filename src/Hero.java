public class Hero {
    private int health;
    private int damage;
    private String attackType;

    public Hero(int health, int damage) {
        this.health = health;
        this.damage = damage;
    }

    public Hero(int health, int damage, String attackType) {
        this.health = health;
        this.damage = damage;
        this.attackType = attackType;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public String getAttackType() {
        return attackType;
    }
}