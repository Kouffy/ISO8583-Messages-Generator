package ma.kouffy.iso8583.models;

public class Mti {
	
	private char version;
	private char msgClass;
	private char msgfunction;
	private char msgOrigin;
	
	public Mti(char version, char msgClass, char msgfunction, char msgOrigin) {
		super();
		this.version = version;
		this.msgClass = msgClass;
		this.msgfunction = msgfunction;
		this.msgOrigin = msgOrigin;
	}
	
	public String getStringMti() {
		return new StringBuilder()
				.append(this.version)
				.append(this.msgClass)
				.append(this.msgfunction)
				.append(this.msgOrigin)
				.toString();
	}
	
	public char getVersion() {
		return version;
	}
	public void setVersion(char version) {
		this.version = version;
	}
	public char getMsgClass() {
		return msgClass;
	}
	public void setMsgClass(char msgClass) {
		this.msgClass = msgClass;
	}
	public char getMsgfunction() {
		return msgfunction;
	}
	public void setMsgfunction(char msgfunction) {
		this.msgfunction = msgfunction;
	}
	public char getMsgOrigin() {
		return msgOrigin;
	}
	public void setMsgOrigin(char msgOrigin) {
		this.msgOrigin = msgOrigin;
	}
	
	
}
