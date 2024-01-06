package titan;
public class PlayerAttributes {
    private static int healthPoints = 10;
    private static int barrierPoints = 0;

    //GETTERS AND SETTERS
    public static int getHealthPoints() {
        return healthPoints;
    }
    public static int getBarrierPoints() {
        return barrierPoints;
    }
    public static void setHealthPoints(int healthPoints) {
        PlayerAttributes.healthPoints = healthPoints;
    }

    public static void setBarrierPoints(int barrierPoints) {
        PlayerAttributes.barrierPoints = barrierPoints;
    }
}
