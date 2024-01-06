package gods;
public interface AttributesInterface {

    default int getActionPoints() {
        return AttributesStorage.requiredActionPoints.get(this);
    }

    default void setDefaultActionPoints(int defaultActionPoints) {
        AttributesStorage.requiredActionPoints.put(this, defaultActionPoints);
        AttributesStorage.currentActionPoints.put(this, 0);
    }

    default int getCurrentActionPoints() {
        return AttributesStorage.currentActionPoints.get(this);
    }

    default void updateActionPoints (int actionPoints) {
        int currentActionPoints = getCurrentActionPoints() + actionPoints;
        AttributesStorage.currentActionPoints.put(this, currentActionPoints);
    }
}
