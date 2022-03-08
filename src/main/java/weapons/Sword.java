package weapons;
import enemies.Enemy;

public class Sword implements IWeapon{

    private int damage;

    public Sword() {
        this.damage = 1;
    }

    public void attack(Enemy enemy) {
        enemy.takeDamage(damage);
    }
}
