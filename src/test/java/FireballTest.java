import enemies.Troll;
import magic.Fireball;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FireballTest {

    Fireball fireball;
    Troll troll;

    @Before
    public void before(){
        fireball = new Fireball();
        troll = new Troll(10);
    }

    @Test
    public void canDoDamage(){
        fireball.cast(troll);
        assertEquals( 7, troll.getHealthPoints());
    }

}
