package ma.kouffy.iso8583.models;

import java.util.List;

import ma.kouffy.iso8583.util.FixedSizeBitSet;

public class Bitmap {
	
	FixedSizeBitSet fixedSizeBitSet;
	
	public Bitmap() {
		this.fixedSizeBitSet = new FixedSizeBitSet(64);
	}
	
	public void updateBitmap(int index) {
		this.fixedSizeBitSet.set(index);
	}
	
	public boolean isSet(int index) {
		return this.fixedSizeBitSet.get(index);
	}
	
	public String getBinStringBitmap() {
		return this.fixedSizeBitSet.toString();
	}
	
	public String getHexStringBitmap() {
		return this.fixedSizeBitSet.bitset2Hex(this.fixedSizeBitSet,16);
	}
}
