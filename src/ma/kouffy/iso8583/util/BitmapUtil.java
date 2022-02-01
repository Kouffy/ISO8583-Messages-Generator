package ma.kouffy.iso8583.util;

import java.util.BitSet;

public class BitmapUtil {
	
    public static String bitset2Hex(final BitSet bitset, final int minLength) {
        final StringBuilder result = new StringBuilder();
        for (int bytenum = 0; bytenum < minLength / 2; bytenum++) {
            byte v = 0;
            for (int bit = 0, mask = 0x80; mask >= 0x01; bit++, mask /= 2) {
                if (bitset.get((bytenum * 8) + bit)) {
                    v |= mask;
                }
            }
            result.append(String.format("%02X", v));
        }
        while (result.length() < minLength) {
            result.append("00");
        }
        return result.toString();
    }
}
