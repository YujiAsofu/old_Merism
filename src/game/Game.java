package game;

import titan.Wheel;

import java.util.Arrays;

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
            Wheel.spin();
            Wheel.showResults();
            Wheel.waitForLockInput();
            System.out.println();
        }
        Wheel.spin();
        Wheel.showFinalResults();
        System.out.println("-- 3ª RODADA --");
        System.out.println(Arrays.toString(Wheel.FinalResults));
    }
}
