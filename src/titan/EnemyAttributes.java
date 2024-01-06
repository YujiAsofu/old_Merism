package titan;

public class EnemyAttributes {
    private static int HealthPoints = 10;
    private static int BarrierPoints = 2;

    //GETTERS AND SETTERS
    public static int getHealthPoints() {
        return HealthPoints;
    }
    public static int getBarrierPoints() {
        return BarrierPoints;
    }
    public static void setHealthPoints(int healthPoints) {
        EnemyAttributes.HealthPoints = healthPoints;
    }

    public static void setBarrierPoints(int barrierPoints) {
        EnemyAttributes.BarrierPoints = barrierPoints;
    }
}
