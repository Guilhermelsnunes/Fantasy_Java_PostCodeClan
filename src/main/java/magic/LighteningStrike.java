package magic;
import enemies.Enemy;


public class LighteningStrike implements ISpell {

    private int damage;

    public LighteningStrike(){
        this.damage = 4;
    }


    public void cast(Enemy enemy) {
        enemy.takeDamage(damage);
    }
}
