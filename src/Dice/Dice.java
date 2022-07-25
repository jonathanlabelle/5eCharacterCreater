package Dice;

import java.util.Random;

public class Dice {
    public static int d4() {
        Random rand = new Random();
        return rand.nextInt(4)+1;
    }
    public static int d6() {
        Random rand = new Random();
        return rand.nextInt(6)+1;
    }
    public static int d8() {
        Random rand = new Random();
        return rand.nextInt(8)+1;
    }
    public static int d10() {
        Random rand = new Random();
        return rand.nextInt(10)+1;
    }
    public static int d12() {
        Random rand = new Random();
        return rand.nextInt(12)+1;
    }
    public static int d20() {
        Random rand = new Random();
        return rand.nextInt(20)+1;
    }
    public static int d100() {
        Random rand = new Random();
        return rand.nextInt(20)+1;
    }
}
