package ma.kouffy.iso8583.enums;

public enum IsoTypes {
	ALPHA("a","Alpha, including blanks"),
	NUMERIC("n","Numeric values only"),
	NUMERIC_AMOUNT("xn","Numeric (amount) values, where the first byte is either 'C' to indicate a positive or Credit value, or 'D' to indicate a negative or Debit value, followed by the numeric value (using n digits)"),
	SPECIAL_CHARS("s","Special characters only"),
	ALPHA_NUMERIC("an","Alphanumeric"),
	ALPHA_SPECIAL_CHARS("as","Alpha & special characters only"),
	NUMERIC_SPECIAL_CHARS("ns","Numeric and special characters only"),
	ALPHA_NUMERIC_SPECIAL_CHARS("ans","Alphabetic, numeric and special characters."),
	BINARY("b","Binary data"),
	TRACK_X("z","Tracks 2 and 3 code set as defined in ISO/IEC 7813 and ISO/IEC 4909 respectively");
	
	private String abbreviation;
	private String description;
	
    private IsoTypes(String abbreviation,String description) {
		this.description = description;
		this.abbreviation = abbreviation;
	}
	
	public String getDescription() {
		return this.description;
	}

}
