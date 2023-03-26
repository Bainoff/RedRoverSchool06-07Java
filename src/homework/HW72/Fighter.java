package homework.HW72;

public class Fighter {
    //TODO    Create a function that returns the name of the winner in a fight between two fighters.
//    Each fighter takes turns attacking the other and whoever kills the other first is victorious.
//    Death is defined as having health <= 0.
//    Each fighter will be a Fighter object/instance. See the Fighter class below in your chosen language.
//    Both health and damagePerAttack (damage_per_attack for python) will be integers larger than 0.
//    You can mutate the Fighter objects.
//    Your function also receives a third argument, a string, with the name of the fighter that attacks first.
    public String name;
    public int health, damagePerAttack;

    public Fighter(String name, int health, int damagePerAttack) {
        this.name = name;
        this.health = health;
        this.damagePerAttack = damagePerAttack;
    }

    public static void main(String[] args) {
        System.out.println(declareWinner("SubZero"));
    }

    public static String declareWinner(String attacker) {
        Fighter f1 = new Fighter("Sector", 80, 12);
        Fighter f2 = new Fighter("SubZero", 55, 15);
        while (f1.health >= 0 && f2.health >= 0) {
            if (attacker.equals(f1.name)) {
                f2.health = f2.health - f1.damagePerAttack;
                System.out.println(f1.name + " attacks " + f2.name + ", " + f2.name + " now has " + f2.health + " health");
                if (f2.health <= 0) break;
                attacker = f2.name;
            }
            if (attacker.equals(f2.name)) {
                f1.health = f1.health - f2.damagePerAttack;
                System.out.println(f2.name + " attacks " + f1.name + ", " + f1.name + " now has " + f1.health + " health");
                if (f1.health <= 0) break;
                attacker = f1.name;
            }
            if (!attacker.equals(f1.name) && !attacker.equals(f2.name))
                throw new IllegalArgumentException("Enter valid Fighter name");
        }
        return "and is dead. " + attacker + " wins.";
    }
}
