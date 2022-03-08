package weapons;
import enemies.Enemy;

public class Axe implements IWeapon {

    private int damage;

    public Axe() {
        this.damage = 5;
    }

    public void attack(Enemy enemy) {
        enemy.takeDamage(damage);
    }
}
