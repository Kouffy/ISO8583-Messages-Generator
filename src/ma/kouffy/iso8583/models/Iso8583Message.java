package ma.kouffy.iso8583.models;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import ma.kouffy.iso8583.constants.MtiConstants;
import ma.kouffy.iso8583.util.ByteUtil;
import ma.kouffy.iso8583.util.HexUtil;

public class Iso8583Message {
	//message type indicator
	private Mti mti;
	//the first and the second bitmaps of the message
	private Bitmap bitmap1;
	private Bitmap bitmap2;
	//iso8583 message in string format
	private String header;
	private String msgString;
	//iso8583 message in byte format (to send via network)
	private byte[] msgFrame;
	//list that contains all the possible data elements in the message 
	//in order to iterate over each element to pack the fields that the user set them
	private final List<IsoField> dataElements;

	public Iso8583Message() {
		bitmap1 = new Bitmap();
		dataElements = IsoSchema.getDataElements();
	}
	
	public String getMti() {
		return mti.getStringMti();
	}

	public void setMti(Mti mti) {
		this.mti = mti;
	}

	public void setField(int index, String value) {
		--index;
		System.out.println("jhvjjvkjvg " + this.dataElements.get(index).getNumber());;
		this.dataElements.get(index).setValue(value);
		if(this.checkSecondBitmap() && this.bitmap2 == null) bitmap1 = new Bitmap();
		updateBitmap(index);	
	}
	
	public void pack() {
		StringBuilder msgBuilder = new StringBuilder();
		StringBuilder byteMsgBuilder = new StringBuilder();
		msgBuilder
		.append(this.mti.getStringMti())
		.append(bitmap1.getHexStringBitmap());
		for(IsoField isoField : this.dataElements) {
			if(isoField.getValue() != null) {
				System.out.println(isoField.getNumber());
				//compress is set to true because these fields contains hex values (ICC Data)
				if(isoField.getNumber() == 55 || isoField.getNumber() == 110) {
					System.err.println(isoField.packStringField(true));
					System.err.println(isoField.packByteField(true));
					msgBuilder.append(isoField.packStringField(true));
					byteMsgBuilder.append(isoField.packByteField(true));
				} else {
					System.err.println(isoField.packStringField(true));
					System.err.println(isoField.packByteField(true));
					msgBuilder.append(isoField.packStringField(false));
					byteMsgBuilder.append(isoField.packByteField(true));
				}
			}
		}
		msgString = msgBuilder.toString();
		msgFrame = ByteUtil.hexStringToByteArray(byteMsgBuilder.toString());
	}
	
	public void unPack(String receivedMsg) {
		try {
			if(receivedMsg != null) {
					
			}
		} catch (Exception e){
			
		}
	}
	
	private void updateBitmap(int index) {
		if(index <= 63) {
			this.bitmap1.updateBitmap(index);
		} else {
			this.bitmap2.updateBitmap(index);
		}
	}
	
	private boolean checkSecondBitmap() {
		return (this.dataElements.get(0).getValue() != null);
	}
	
	private boolean isPresent(int index) {
		if(index <= 64)
			return this.bitmap1.getBinStringBitmap().charAt(--index) == '1';
		else
			return this.bitmap2.getBinStringBitmap().charAt(--index) == '1';
	}
	
	public void printMessage() {
		if(msgString != null) System.out.println("message string : " + msgString);
		if(msgFrame != null) System.out.println("message frame : " + Arrays.toString(msgFrame));
		
		String fullBmp = "";
		if(this.bitmap1 != null) {
			fullBmp += bitmap1.getBinStringBitmap();
			if(this.bitmap2 != null) {
				fullBmp += bitmap2.getBinStringBitmap();
			}
		}
		
		for (int i = 0; i < fullBmp.length(); i++) {
			int realFieldNumber = i + 1;
			if(fullBmp.charAt(i) == '1')
				System.out.println("field " + realFieldNumber + " : " + this.dataElements.get(i).getValue());
        }
	}
	
	public static void main(String[] args) {
		Iso8583Message iso = new Iso8583Message();
		iso.setMti(new Mti(MtiConstants.V_1993,MtiConstants.Financial_messages, MtiConstants.Acquirer, MtiConstants.Request));
        iso.setField(2,"num carte");
        iso.setField(3, "");
        iso.setField(4,"montant");
        iso.setField(7,"date");
        iso.setField(11,"stan");
        iso.setField(12,"date");
        iso.setField(14,"date exp");
        iso.setField(17,"date");
        iso.setField(22,"900301700134");//
        iso.setField(23,"");
        iso.setField(24,"200");
        iso.setField(26,"MCC");
        iso.setField(32,"");
        iso.setField(37, "num transaction");//les 6 premiers nums de num tran
        iso.setField(41,"num term");
        iso.setField(42,"num com");
        iso.setField(43,"adresse");
        iso.setField(49,"504");
        iso.setField(55,"ICC DATA");
        iso.setField(63,"versions");
        iso.pack();
        
        iso.printMessage();
	}
	
}
