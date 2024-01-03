package titan;
import java.util.Arrays;
import java.util.Scanner;

public class Wheel {
    static int[] resultsSpin = new int [5];
    public static int[] finalResults = new int [5];

    public static int[] spinWheel() {
        for ( int i = 0; i < resultsSpin.length; i++ ) {
            resultsSpin[i] = (int)((Math.random()*10)+1);
        }
        return resultsSpin;
    }

    public static void toggleLock(int index) {
        if (finalResults[index] == 0) {
            finalResults[index] = resultsSpin[index];
        } else {
            finalResults[index] = 0;
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
                    toggleLock(0);
                    break;
                case 2:
                    toggleLock(1);
                    break;
                case 3:
                    toggleLock(2);
                    break;
                case 4:
                    toggleLock(3);
                    break;
                case 5:
                    toggleLock(4);
                    break;
                case 9:
                    break;
            }
        }
    }

    public static int[] createFinalResults(int[] resultsSpin, int [] finalResults) {
        for ( int i = 0; i < finalResults.length; i++ )
            if (finalResults[i] == 0) {
                finalResults[i] = resultsSpin[i];
        }
        return finalResults;
    }

    public static void printResults() {
        int[] results = new int [5];
        for ( int i = 0; i < finalResults.length; i++ ) {
            if (finalResults[i] == 0) {
                results[i] = resultsSpin[i];
            } else {
                results[i] = finalResults[i];
            }
        }
        System.out.println(Arrays.toString(results));
    }

    public static int[] defineResults() {
        for ( int i = 0; i < 2; i++ ) {
            System.out.println("-- " + (i + 1) + "ª RODADA --");
            spinWheel();
            printResults();
            waitForLockInput();
            System.out.println();
        }
        spinWheel();
        createFinalResults(resultsSpin,finalResults);
        System.out.println("-- 3ª RODADA --");
        System.out.println(Arrays.toString(finalResults));
        return finalResults;
    }
}