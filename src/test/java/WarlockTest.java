//import enemies.Enemy;
//import enemies.Orc;
//import magic.ISpell;
//import magic.LighteningStrike;
//import org.junit.Before;
//import org.junit.Test;
//import player.Warlock;
//import protects.Dragon;
//import protects.IDefend;
//
//import static org.junit.Assert.assertEquals;
//
//public class WarlockTest {
//
//    Warlock warlock;
//    Enemy enemy;
//    ISpell spell;
//    IDefend defendMageCastOnEnemy;
//
//    @Before
//    public void before(){
//        defendMageCastOnEnemy = new Dragon();
//        spell = new LighteningStrike();
//        enemy = new Orc(10);
//        warlock = new Warlock("Merlin", 10, spell, defendMageCastOnEnemy);
//    }
//
//    @Test
//    public void hasName(){
//        assertEquals("Merlin", warlock.getName());
//    }
//
//    @Test
//    public void hasHealthPoints(){
//        assertEquals(10, warlock.getHealthPoints());
//    }
//
//    @Test
//    public void canCast(){
//        warlock.cast(enemy);
//        assertEquals(6, enemy.getHealthPoints());
//    }
//
//    @Test
//    public void canDefendMageCastOnEnemy(){
//        warlock.cast(enemy);
//        warlock.defendMageCastOnEnemy(enemy);
//    }
//}
