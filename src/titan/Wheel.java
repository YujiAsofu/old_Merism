package titan;

public class Wheel {
    static int[] resultsSpin = new int [5];
    public static int[] finalResults = new int [5];

    public static int[] spinWheel() {
        for ( int i = 0; i < resultsSpin.length; i++ ) {
            resultsSpin[i] = (int)(Math.random()*10);
        }
        return resultsSpin;
    }

    public static int[] toggleLock(int index) {
        if (finalResults[index] == 0) {
            finalResults[index] = resultsSpin[index];
        } else {
            finalResults[index] = 0;
        }
    return finalResults;
    }


}