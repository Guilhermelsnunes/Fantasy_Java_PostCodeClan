package protects;
import enemies.Enemy;

public class Dragon implements IDefend{

    private int defendMageCastOnEnemy;

    public Dragon() {
        this.defendMageCastOnEnemy = 1;
    }

    public void defendMageCastOnEnemy(Enemy enemy) {
        enemy.takeDamage(defendMageCastOnEnemy);
    }


}

