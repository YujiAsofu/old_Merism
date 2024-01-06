package gods;

public class Zeus implements AttributesInterface , ActionsInterface {
    public static final int REQUIRED_ACTION_POINTS = 5;
    public Zeus() {
        setDefaultActionPoints(REQUIRED_ACTION_POINTS);
    }
    public static void firstAction() {
        ActionsInterface.basicHitOnEnemy(-2);
    }
    public void secondAction() {}

}
