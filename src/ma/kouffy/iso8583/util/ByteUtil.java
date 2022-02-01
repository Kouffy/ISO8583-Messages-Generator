package ma.kouffy.iso8583.util;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ByteUtil {
	
    public static byte[] hexStringToByteArray(String hexString) {

        if ((hexString == null || hexString.length() == 0)) {
            return null;
        }

        hexString = hexString.replaceAll(" ", "");

        int len = hexString.length();
        int index = 0;

        byte[] bytes = new byte[len / 2];

        while (index < len) {

            String sub = hexString.substring(index, index + 2);

            bytes[index/2] = (byte)Integer.parseInt(sub,16);

            index += 2;
        }


        return bytes;
    }
	
	public static byte[] concatByteArray(byte[] a,byte[] b) throws IOException {
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream( );
		outputStream.write(a);
		outputStream.write(b);
		return outputStream.toByteArray();
	}

}
