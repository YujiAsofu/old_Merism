package game;

import Wheel.Actions;
import Wheel.Resolutions;

public class Game {
    /* public void startGame() {
    }
    public int checkWinner();
    public void newRound();

    public void endGame() {

    } */

    public static void playerTurn() {
        for ( int i = 0; i < 2; i++ ) {
            System.out.println("-- " + (i + 1) + "ª RODADA --");
            Actions.spin();
            Actions.buildMaskOfResults();
            Resolutions.translateSpin();
            Actions.waitForLockInput();
            System.out.println();
        }
        Actions.spin();
        Actions.buildFinalResults();
        System.out.println("-- 3ª RODADA --");
        Resolutions.translateFinalResults();
    }
}
