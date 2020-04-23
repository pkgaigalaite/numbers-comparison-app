package numbers;

import java.util.Arrays;

public class BinaryComparator implements NumberComparator {
    @Override
    public boolean compare(long number1, long number2) {
        return Arrays.equals(getBits(number1), getBits(number2));
    }

    public static boolean[] getBits(long number) {
        boolean[] bits = new boolean[8];
        for (int i = 7; i >= 0; i--) {
            bits[i] = (number & (1 << i)) != 0;
        }
        return bits;
    }
}
