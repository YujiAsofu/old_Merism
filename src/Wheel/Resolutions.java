package Wheel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Resolutions {
public static void printResults() {
    int [] spinResults = Actions.finalResults;
    String option;
    String [] results = new String[5];
    for ( int result : spinResults) {
        if (result < 22) {
            option = "Hammer";
        } else if (result < 44) {
            option = "LeftSquare";
        } else if (result > 44 && result < 68) {
            option = "RightDiamond";
        } else if (result < 74) {
            option = "DoubleLSquare";
        } else if (result < 80) {
            option = "DoubleRDiamond";
        } else if (result < 85) {
            option = "DoubleHammer";
        } else if (result < 90) {
            option = "ExpLeftSquare";
        } else if (result < 95) {
            option = "ExpRightDiamond";
        } else if (result < 98) {
            option = "ExpDoubleLeftSquare";
        } else {
            option = "ExpDoubleRightDiamond";
        }
        results[result] = option;
    }
        for (String result : results) {
            switch (result) {
                case "Hammer":
                    System.out.println("\uD83D\uDD28");
                    break;
                case "LeftSquare":
                    System.out.println("\uD83D\uDD37");
                    break;
                case "RightDiamond":
                    System.out.println("\uD83D\uDFE7");
                    break;
                case "DoubleLSquare":
                    System.out.println("2\uD83D\uDD37");
                    break;
                case "DoubleRDiamond":
                    System.out.println("2\uD83D\uDFE7");
                    break;
                case "DoubleHammer":
                    System.out.println("2\uD83D\uDD28");
                    break;
                case "ExpLeftSquare":
                    System.out.println("\uD83D\uDD37*");
                    break;
                case "ExpRightDiamond":
                    System.out.println("\uD83D\uDFE7*");
                    break;
                case "ExpDoubleLeftSquare":
                    System.out.println("2\uD83D\uDD37*");
                    break;
                case "ExpDoubleRightDiamond":
                    System.out.println("2\uD83D\uDFE7*");
                    break;
                default:
                    System.out.println("Resultado inválido");
            }
        }
        System.out.println(Arrays.toString(results));
    }
}

