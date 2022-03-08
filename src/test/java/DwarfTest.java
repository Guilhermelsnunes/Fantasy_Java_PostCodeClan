import enemies.Enemy;
import enemies.Troll;
import org.junit.Before;
import org.junit.Test;
import player.Dwarf;
import weapons.Axe;
import weapons.IWeapon;
import weapons.Sword;
import static org.junit.Assert.assertEquals;

public class DwarfTest {

    Dwarf dwarf;
    Enemy enemy;
    IWeapon weapon1;
    IWeapon weapon2;

    @Before
    public void before(){
        weapon1 = new Sword();
        weapon2 = new Axe();
        dwarf = new Dwarf("Bilbo", 10, weapon1);
        enemy = new Troll(10);
    }

    @Test
    public void hasName(){
        assertEquals("Bilbo", dwarf.getName());
    }

    @Test
    public void hasHealth(){
        assertEquals(10, dwarf.getHealthPoints());
    }

    @Test
    public void canDamage(){
        dwarf.attack(enemy);
        assertEquals(9, enemy.getHealthPoints());
    }

    @Test
    public void canSwapWeapon(){
        dwarf.changeWeapon(weapon2);
        dwarf.attack(enemy);
        assertEquals(weapon2, dwarf.getWeapon());
        assertEquals(5, enemy.getHealthPoints());
    }

}
