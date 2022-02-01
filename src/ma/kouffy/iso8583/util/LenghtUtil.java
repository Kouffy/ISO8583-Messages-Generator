package ma.kouffy.iso8583.util;

public class LenghtUtil {
	
	public static String getLLVARLenght(String value, boolean compress) {
		return String.valueOf(compress ? (value.length() / 2) : (value.length()) );
	}
	
	public static String getLLLVARLenght(String value, boolean compress) {
		return String.valueOf(compress ? (value.length() / 2) : (value.length()) );
	}
	
}
