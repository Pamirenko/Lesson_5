public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setDamage(140);
        boss.setHealth(700);
        boss.setTypeOfProtection("Поглощение чужих уронов");
        System.out.println("-------------------");
        System.out.println("Характеристика Босса");
        System.out.println("Жизнь Босса: " + boss.getHealth());
        System.out.println("Урон Босса: " + boss.getDamage());
        System.out.println("Тип Защиты Боссат: " + boss.getTypeOfProtection());
    }
}