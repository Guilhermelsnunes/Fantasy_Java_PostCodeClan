import enemies.Enemy;
import enemies.Orc;
import player.Barbarian;
import org.junit.Before;
import org.junit.Test;
import weapons.Axe;
import weapons.Club;
import weapons.IWeapon;
import static org.junit.Assert.assertEquals;

public class BarbarianTest {

    Barbarian barbarian;
    Enemy enemy;
    IWeapon weapon1;
    IWeapon weapon2;

    @Before
    public void before(){
        weapon1 = new Axe();
        weapon2 = new Club();
        barbarian = new Barbarian("Fredrick", 10, weapon1);
        enemy = new Orc(10);
    }

    @Test
    public void hasName(){
        assertEquals("Fredrick", barbarian.getName());
    }

    @Test
    public void hasHealth(){
        assertEquals(10, barbarian.getHealthPoints());
    }

    @Test
    public void canDamage(){
        barbarian.attack(enemy);
        assertEquals(5, enemy.getHealthPoints());
    }

    @Test
    public void canSwapWeapon(){
        barbarian.changeWeapon(weapon2);
        barbarian.attack(enemy);
        assertEquals(weapon2, barbarian.getWeapon());
        assertEquals(8, enemy.getHealthPoints());
    }

}
