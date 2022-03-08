package weapons;
import enemies.Enemy;

public class Club implements IWeapon{

    private int damage;

    public Club() {
        this.damage = 2;
    }

    public void attack(Enemy enemy) {
        enemy.takeDamage(damage);
    }

}
