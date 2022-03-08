package player;
import enemies.Enemy;
import weapons.IWeapon;

public abstract class Fighter extends Player {

    private IWeapon weapon;

    public Fighter(String name, int healthPoints, IWeapon weapon) {
        super(name, healthPoints);
        this.weapon = weapon;
    }

    public void attack(Enemy enemy){
        this.weapon.attack(enemy);
    }

    public void changeWeapon(IWeapon newWeapon){
        this.weapon = newWeapon;
    }

    public IWeapon getWeapon() {
        return weapon;
    }

}
