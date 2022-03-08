import enemies.Troll;
import magic.LighteningStrike;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LighteningStrikeTest {

    LighteningStrike lighteningStrike;
    Troll troll;

    @Before
    public void before(){
        lighteningStrike = new LighteningStrike();
        troll = new Troll(10);
    }

    @Test
    public void canDoDamage(){
        lighteningStrike.cast(troll);
        assertEquals(6, troll.getHealthPoints());
    }

}
