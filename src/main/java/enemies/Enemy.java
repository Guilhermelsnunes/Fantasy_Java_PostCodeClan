package enemies;

public abstract class Enemy {

    private int healthPoints;

    public Enemy(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public void takeDamage(int damagePoints){
        this.healthPoints -= damagePoints;
    }

    public int getHealthPoints() {
        return healthPoints;
    }
}
