package titan;
public class Titan {
    int healthPoints = 10;
    int barrierPoints = 0;

    public int loseLife(int damage) {
        healthPoints -= damage;
        return healthPoints;
    }

    public int loseBarrier(int damage) {
        barrierPoints -= damage;
            if (barrierPoints < 0) {
                barrierPoints = 0;
            }
        return barrierPoints;
    }

    public int earnLife(int heal) {
        healthPoints += heal;
        return healthPoints;
    }

    public int earnBarrier (int repair) {
        barrierPoints += repair;
        return barrierPoints;
    }

    public void spinWheel() {

    }

    public void lockWheel() {

    }

}
