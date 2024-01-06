package gods;
import titan.EnemyAttributes;
public interface ActionsInterface {
    static void changeLife(int valuePoints) {
        int currentLife = titan.EnemyAttributes.getHealthPoints();
        currentLife += valuePoints;
        titan.EnemyAttributes.setHealthPoints(currentLife);
    }

    static void changeBarrier(int valuePoints) {
        int currentBarrier = titan.EnemyAttributes.getBarrierPoints();
        currentBarrier = Math.max(0, currentBarrier + valuePoints);
        titan.EnemyAttributes.setBarrierPoints(currentBarrier);
    }

    static void basicHitOnEnemy(int valuePoints) {
        if (EnemyAttributes.getBarrierPoints() > 0) {
            changeBarrier(valuePoints);
        } else {
            changeLife(valuePoints);
        }
    }
}
