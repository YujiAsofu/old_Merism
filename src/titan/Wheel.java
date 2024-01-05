package titan;
import java.util.Arrays;
import java.util.Scanner;

public class Wheel {
    public static int[] resultsFromSpin = new int [5];
    public static int[] FinalResults = new int [5];

    public static int[] spin() {
        for (int i = 0; i < resultsFromSpin.length; i++ ) {
            resultsFromSpin[i] = (int)((Math.random()*10)+1);
        }
        return resultsFromSpin;
    }

    public static void toggleResultLock(int index) {
        if (FinalResults[index] == 0) {
            FinalResults[index] = resultsFromSpin[index];
        } else {
            FinalResults[index] = 0;
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

    public static int[] showFinalResults(int[] resultsSpin, int [] finalResults) {
        for ( int i = 0; i < finalResults.length; i++ )
            if (finalResults[i] == 0) {
                finalResults[i] = resultsSpin[i];
        }
        return finalResults;
    }

    public static void showResults() {
        int[] results = new int [5];
        for (int i = 0; i < FinalResults.length; i++ ) {
            if (FinalResults[i] == 0) {
                results[i] = resultsFromSpin[i];
            } else {
                results[i] = FinalResults[i];
            }
        }
        System.out.println(Arrays.toString(results));
    }
}