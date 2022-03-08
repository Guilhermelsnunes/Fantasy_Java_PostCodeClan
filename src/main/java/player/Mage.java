package player;

import enemies.Enemy;
import magic.ISpell;
import protects.IDefend;

public abstract class Mage extends Player{

    private ISpell spell;
    private IDefend defendMageCastOnEnemy;

    public Mage(String name, int healthPoints, ISpell spell, IDefend defendMageCastOnEnemy) {
        super(name, healthPoints);
        this.spell = spell;
        this.defendMageCastOnEnemy = defendMageCastOnEnemy;
    }

    public void cast(Enemy enemy){
        this.spell.cast(enemy);
    }

    public ISpell getSpell() {
        return spell;
    }
}
