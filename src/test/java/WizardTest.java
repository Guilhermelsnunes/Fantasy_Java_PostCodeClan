//import enemies.Enemy;
//import enemies.Orc;
//import magic.Fireball;
//import magic.ISpell;
//import org.junit.Before;
//import org.junit.Test;
//import player.Wizard;
//import static org.junit.Assert.assertEquals;
//
//
//public class WizardTest {
//
//    Wizard wizard;
//    Enemy enemy;
//    ISpell spell;
//
//    @Before
//    public void before(){
//        spell = new Fireball();
//        enemy = new Orc(10);
//        wizard = new Wizard("Harry", 10, spell);
//    }
//
//    @Test
//    public void hasName(){
//        assertEquals("Harry", wizard.getName());
//    }
//
//    @Test
//    public void hasHealthPoints(){
//        assertEquals(10, wizard.getHealthPoints());
//    }
//
//    @Test
//    public void canCast(){
//        wizard.cast(enemy);
//        assertEquals(7, enemy.getHealthPoints());
//    }
//
//}
