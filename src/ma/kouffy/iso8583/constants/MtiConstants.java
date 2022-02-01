package ma.kouffy.iso8583.constants;

public class MtiConstants {
	/*
	 * Message version
	 */
	public static final char V_1987 = '0';
	public static final char V_1993 = '1';	
	public static final char V_2003 = '2';
	public static final char NATIONAL_USE = '8';	
	public static final char PRIVATE_USE = '9';
	
	/*
	 * Message class
	 */
	public static final char Authorization_message = '1';
	public static final char Financial_messages = '2';	
	public static final char File_actions_message = '3';
	public static final char Reversal_and_chargeback_messages = '4';	
	public static final char Reconciliation_message = '5';
	public static final char Administrative_message = '6';
	public static final char Fee_collection_messages = '7';
	public static final char Network_management_message = '8';
	
	/*
	 * Message_function
	 */
	public static final char Request = '0';
	public static final char Request_response = '1';	
	public static final char Advice = '2';
	public static final char Advice_response = '3';	
	public static final char Notification = '4';
	public static final char Notification_acknowledgement = '5';
	public static final char Instruction = '6';
	public static final char Instruction_acknowledgement = '9';
	
	/*
	 * Message Origin :
	 */
	public static final char Acquirer = '0';
	public static final char Acquirer_repeat = '1';	
	public static final char Issuer = '2';
	public static final char Issuer_repeat = '3';	
	public static final char Other = '4';
	public static final char Other_repeat = '5';

}
