package Wheel;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Actions {
    public static int[] resultsFromSpin = new int [5];
    public static int[] buildUpResults = new int [5];
    public static int[] finalResults = new int [5];

    public static int[] spin() {
        Random random = new Random();
        for (int i = 0; i < resultsFromSpin.length; i++ ) {
            resultsFromSpin[i] = random.nextInt(100)+1;
        }
        return resultsFromSpin;
    }

    public static void toggleResultLock(int index) {
        if (buildUpResults[index] == 0) {
            buildUpResults[index] = resultsFromSpin[index];
        } else {
            buildUpResults[index] = 0;
        }
    }

    public static void waitForLockInput() {
        int input = 0;
        System.out.println("Digite o número desejado [1, 2, 3, 4, 5] ou '9' para encerrar a rodada.");
        while (input != 9) {
            Scanner scanner = new Scanner(System.in);
            input = scanner.nextInt();
            switch (input) {
                case 1:
                    toggleResultLock(0);
                    break;
                case 2:
                    toggleResultLock(1);
                    break;
                case 3:
                    toggleResultLock(2);
                    break;
                case 4:
                    toggleResultLock(3);
                    break;
                case 5:
                    toggleResultLock(4);
                    break;
                case 9:
                    break;
            }
        }
    }

    public static int[] showFinalResults() {
        for (int i = 0; i < buildUpResults.length; i++ )
            if (buildUpResults[i] == 0) {
                buildUpResults[i] = resultsFromSpin[i];
        }
        return buildUpResults;
    }

    public static void showSpinResults() {
        //int[] results = new int [5];
        for (int i = 0; i < buildUpResults.length; i++ ) {
            if (buildUpResults[i] == 0) {
                finalResults[i] = resultsFromSpin[i];
            } else {
                finalResults[i] = buildUpResults[i];
            }
        }
        System.out.println(Arrays.toString(finalResults));
    }

    /* HAMMER EMOTE: \uD83D\uDD28
    DOUBLE HAMMER: \u2692
    LEFT SYMBOL: \uD83D\uDD37
    RIGHT SYMBOL: \uD83D\uDFE7
    * */
}