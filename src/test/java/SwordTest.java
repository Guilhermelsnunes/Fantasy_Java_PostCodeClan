import enemies.Troll;
import org.junit.Before;
import org.junit.Test;
import weapons.Sword;
import static org.junit.Assert.assertEquals;

public class SwordTest {

    Sword sword;
    Troll troll;

    @Before
    public void before(){
        sword = new Sword();
        troll = new Troll(10);
    }

    @Test
    public void canDoDamage(){
        sword.attack(troll);
        assertEquals(9, troll.getHealthPoints());
    }
}
