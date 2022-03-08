import enemies.Orc;
import org.junit.Before;
import org.junit.Test;
import weapons.Club;
import static org.junit.Assert.assertEquals;

public class ClubTest {

    Club club;
    Orc orc;

    @Before
    public void before(){
        club = new Club();
        orc = new Orc(10);
    }

    @Test
    public void canDoDamage(){
        club.attack(orc);
        assertEquals(8, orc.getHealthPoints());
    }
}
