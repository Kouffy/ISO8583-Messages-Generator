package ma.kouffy.iso8583.util;

public class HexUtil {
	
    protected static final char[] HEX = new char[]{'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};

    protected static final char[] BINARY = new char[]{'0','1'};
    
    public static String toHexStr(String str) {
        byte[] test = str.getBytes();
        return(hex(test));
    }
    
    
    public static String hex(byte[] bParam){
        StringBuilder accum = new StringBuilder();
        for(byte bt:bParam){
            accum.append(HEX[bt>>4&0x0F]);
            accum.append(HEX[bt&0x0F]);
        }
        return accum.toString();
    }

}
