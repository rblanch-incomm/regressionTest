package mobile.android.utilities;

public class RNG {

    public static String generate() {
        double rng = 0;
        while (rng < 1 || rng > 498) {
            rng = Math.floor(Math.random() * 500);
        }
        return String.valueOf(rng);
    }
}
