package Task02;

import java.util.Random;

public class Model {

    private final static int RAND_MAX = 100;

    int rand () {
        Random r = new Random();
        return r.nextInt(RAND_MAX);
    }

    int rand (int min, int max) {
        Random r = new Random();
        return r.nextInt(max - min) + min;
    }

    boolean checkResult(int input, int key) {
        return input == key;
    }

}