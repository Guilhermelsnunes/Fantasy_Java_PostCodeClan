import enemies.Enemy;
import enemies.Troll;
import org.junit.Before;
import org.junit.Test;
import player.Knight;
import weapons.Club;
import weapons.IWeapon;
import weapons.Sword;
import static org.junit.Assert.assertEquals;

public class KnightTest {

    Knight knight;
    Enemy enemy;
    IWeapon weapon1;
    IWeapon weapon2;

    @Before
    public void before(){
        weapon1 = new Sword();
        weapon2 = new Club();
        knight = new Knight("Siegfried", 10, weapon2);
        enemy = new Troll(10);
    }

    @Test
    public void hasName(){
        assertEquals("Siegfried", knight.getName());
    }

    @Test
    public void hasHealth(){
        assertEquals(10, knight.getHealthPoints());
    }

    @Test
    public void canDamage(){
        knight.attack(enemy);
        assertEquals(8, enemy.getHealthPoints());
    }

    @Test
    public void canSwapWeapon(){
        knight.changeWeapon(weapon1);
        knight.attack(enemy);
        assertEquals(weapon1, knight.getWeapon());
        assertEquals(9, enemy.getHealthPoints());
    }

}
