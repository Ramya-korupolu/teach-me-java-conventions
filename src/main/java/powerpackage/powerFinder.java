package powerpackage;

public class PowerFinder {
    public static int calculatePower(int base, int exp) {
        int result = 1;
        for (int i = 0; i < exp; i++) {
            result *= base;
        }
        return result;
    }
}
