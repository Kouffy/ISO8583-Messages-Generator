package ma.kouffy.iso8583.models;

import ma.kouffy.iso8583.enums.IsoLengths;
import ma.kouffy.iso8583.enums.IsoTypes;
import ma.kouffy.iso8583.util.ByteUtil;
import ma.kouffy.iso8583.util.HexUtil;
import ma.kouffy.iso8583.util.LenghtUtil;

public class IsoField {
	
	int number;
	private IsoTypes type;
	private IsoLengths lengthType;
	private int maxLenght;
	private String value;
	
	public IsoField(int number,IsoTypes type, IsoLengths lengthType, int maxLenght) {
		super();
		this.number = number;
		this.type = type;
		this.lengthType = lengthType;
		this.maxLenght = maxLenght;
	}

	public String getValue() {
		return value;
	}
	
	public void setValue(String value) {
		this.value = value;
	}
	
	public int getNumber() {
		return number;
	}

	public String packStringField(boolean compress) {
		StringBuilder packed = new StringBuilder();
		if(this.value != null) {
			if(this.lengthType == IsoLengths.FIXED) {
				packed.append(this.value);
			} else if(this.lengthType == IsoLengths.LLVAR) {
				packed.append(LenghtUtil.getLLVARLenght(this.value, compress));
				packed.append(this.value);
			} else if(this.lengthType == IsoLengths.LLLVAR) {
				packed.append(LenghtUtil.getLLVARLenght(this.value, compress));
				packed.append(this.value);
			}
		}
		return packed.toString();
	}
	
	public String packByteField(boolean compress) {
		StringBuilder packed = new StringBuilder();
		if(this.value != null) {
			if(this.lengthType == IsoLengths.FIXED) {
				packed.append(HexUtil.toHexStr(this.value));
			} else if(this.lengthType == IsoLengths.LLVAR) {
				packed.append(String.format("%02d",Integer.parseInt(LenghtUtil.getLLVARLenght(this.value, compress))));
				packed.append(HexUtil.toHexStr(this.value));
			} else if(this.lengthType == IsoLengths.LLLVAR) {
				packed.append(String.format("%04d",Integer.parseInt(LenghtUtil.getLLVARLenght(this.value, compress))));
				packed.append(HexUtil.toHexStr(this.value));
			}
		}
		System.out.println(packed.toString());
		return packed.toString();
	}
	
	

}
