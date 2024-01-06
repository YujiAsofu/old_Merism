package Wheel;

public class SlotResults {
    static int barrierCount = 0;
    static int leftSquareCount = 0;
    static int rightDiamondCount = 0;

    public static void opt1Hammer() {
        String name = "Hammer";
        System.out.println("\uD83D\uDD28");
        barrierCount += 1;
    }
    public static void opt2LeftSquare() {
        String name = "LeftSquare";
        System.out.println("\uD83D\uDD37");
        leftSquareCount += 1;
    }
    public static void opt3RightDiamond() {
        String name = "RightDiamond";
        System.out.println("\uD83D\uDFE7");
        rightDiamondCount += 1;
    }
        public static void opt4DoubleLSquare() {
        String name = "DoubleLeftSquare";
        System.out.println("2\uD83D\uDD37");
        leftSquareCount += 2;
    }
        public static void opt5DoubleRightDiamond() {
        String name = "DoubleRightDiamond";
        System.out.println("\uD83D\uDFE7");
        rightDiamondCount += 2;
    }
        public static void opt6DoubleHammer() {
        String name = "DoubleHammer";
        System.out.println("2\uD83D\uDD28");
        barrierCount += 2;
    }
        public static void opt7ExpLeftSquare() {
        String name = "ExpLeftSquare";
        System.out.println("\uD83D\uDD37*");
        leftSquareCount += 1;
        expCount += 1;
    }
        public static void opt8ExpRightDiamond() {
        String name = "ExpRightDiamond";
        System.out.println("\uD83D\uDFE7*");
        rightDiamondCount += 1;
        expCount += 1;
    }
        public static void opt9ExpDoubleLSquare() {
        String name = "ExpDoubleLeftSquare";
        System.out.println("2\uD83D\uDD37*");
        leftSquareCount += 2;
        expCount += 1;
        }
        public static void opt10ExpDoubleRightDiamond() {
        String name = "DoubleRightDiamond";
        System.out.println("\uD83D\uDFE7");
        rightDiamondCount += 2;
        expCount += 1;
    }


}
/*public static void printResults() {
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
}*/

/*            if (result < 22) {
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
            }*/
