package Wheel;

import java.util.Arrays;

public class Resolutions {
    public static void translateSpin() {
        translateResults(Actions.buildUpResults);
    }

    public static void translateFinalResults() {
        translateResults(Actions.finalResults);
    }

    public static void translateResults(int[] spinResults) {
        int option;
        int[] results = new int[5];
        for (int i = 0; i < spinResults.length; i++) {
            if (spinResults[i] < 22) {
                option = 1;
            } else if (spinResults[i] < 44) {
                option = 2;
            } else if (spinResults[i] < 68) {
                option = 3;
            } else if (spinResults[i] < 74) {
                option = 4;
            } else if (spinResults[i] < 80) {
                option = 5;
            } else if (spinResults[i] < 85) {
                option = 6;
            } else if (spinResults[i] < 90) {
                option = 7;
            } else if (spinResults[i] < 95) {
                option = 8;
            } else if (spinResults[i] < 98) {
                option = 9;
            } else {
                option = 10;
            }
            results[i] = option;
        }
        System.out.println(Arrays.toString(results));
    }
}