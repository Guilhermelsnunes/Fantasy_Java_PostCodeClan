package magic;
import enemies.Enemy;

public class Fireball implements ISpell{

    private int damage;

    public Fireball() {
        this.damage = 3;
    }

    public void cast(Enemy enemy) {
        enemy.takeDamage(damage);
    }

}
