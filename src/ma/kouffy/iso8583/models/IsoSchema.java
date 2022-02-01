package ma.kouffy.iso8583.models;

import java.util.ArrayList;
import java.util.List;

import ma.kouffy.iso8583.enums.IsoLengths;
import ma.kouffy.iso8583.enums.IsoTypes;

public class IsoSchema {
	
	public static List<IsoField> getDataElements() {
		return new ArrayList<IsoField>() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

		{
			add(new IsoField(1,IsoTypes.BINARY,IsoLengths.FIXED, 8));
			add(new IsoField(2,IsoTypes.NUMERIC,IsoLengths.LLVAR, 19));
			add(new IsoField(3,IsoTypes.NUMERIC,IsoLengths.FIXED, 6));
			add(new IsoField(4,IsoTypes.NUMERIC,IsoLengths.FIXED, 12));
			add(new IsoField(5,IsoTypes.NUMERIC,IsoLengths.FIXED, 12));
			add(new IsoField(6,IsoTypes.NUMERIC,IsoLengths.FIXED, 12));
			add(new IsoField(7,IsoTypes.NUMERIC,IsoLengths.FIXED, 10));
			add(new IsoField(8,IsoTypes.NUMERIC,IsoLengths.FIXED, 8));
			add(new IsoField(9,IsoTypes.NUMERIC,IsoLengths.FIXED, 8));
			add(new IsoField(10,IsoTypes.NUMERIC,IsoLengths.FIXED, 8));
			add(new IsoField(11,IsoTypes.NUMERIC,IsoLengths.FIXED, 6));
			add(new IsoField(12,IsoTypes.NUMERIC,IsoLengths.FIXED, 6));
			add(new IsoField(13,IsoTypes.NUMERIC,IsoLengths.FIXED, 4));
			add(new IsoField(14,IsoTypes.NUMERIC,IsoLengths.FIXED, 4));
			add(new IsoField(15,IsoTypes.NUMERIC,IsoLengths.FIXED, 4));
			add(new IsoField(16,IsoTypes.NUMERIC,IsoLengths.FIXED, 4));
			add(new IsoField(17,IsoTypes.NUMERIC,IsoLengths.FIXED, 4));
			add(new IsoField(18,IsoTypes.NUMERIC,IsoLengths.FIXED, 4));
			add(new IsoField(19,IsoTypes.NUMERIC,IsoLengths.FIXED, 3));
			add(new IsoField(20,IsoTypes.NUMERIC,IsoLengths.FIXED, 3));
			add(new IsoField(21,IsoTypes.NUMERIC,IsoLengths.FIXED, 3));
			add(new IsoField(22,IsoTypes.NUMERIC,IsoLengths.FIXED, 3));
			add(new IsoField(23,IsoTypes.NUMERIC,IsoLengths.FIXED, 3));
			add(new IsoField(24,IsoTypes.NUMERIC,IsoLengths.FIXED, 3));
			add(new IsoField(25,IsoTypes.NUMERIC,IsoLengths.FIXED, 2));
			add(new IsoField(26,IsoTypes.NUMERIC,IsoLengths.FIXED, 2));
			add(new IsoField(27,IsoTypes.NUMERIC,IsoLengths.FIXED, 1));
			add(new IsoField(28,IsoTypes.NUMERIC_AMOUNT,IsoLengths.FIXED, 8));
			add(new IsoField(29,IsoTypes.NUMERIC_AMOUNT,IsoLengths.FIXED, 8));
			add(new IsoField(30,IsoTypes.NUMERIC_AMOUNT,IsoLengths.FIXED, 8));
			add(new IsoField(31,IsoTypes.NUMERIC_AMOUNT,IsoLengths.FIXED, 8));
			add(new IsoField(32,IsoTypes.NUMERIC,IsoLengths.LLVAR, 11));
			add(new IsoField(33,IsoTypes.NUMERIC,IsoLengths.LLVAR, 11));
			add(new IsoField(34,IsoTypes.NUMERIC_SPECIAL_CHARS,IsoLengths.LLVAR, 28));
			add(new IsoField(35,IsoTypes.TRACK_X,IsoLengths.LLVAR, 37));
			add(new IsoField(36,IsoTypes.NUMERIC,IsoLengths.LLLVAR, 104));
			add(new IsoField(37,IsoTypes.ALPHA_NUMERIC,IsoLengths.FIXED, 12));
			add(new IsoField(38,IsoTypes.ALPHA_NUMERIC,IsoLengths.FIXED, 6));
			add(new IsoField(39,IsoTypes.ALPHA_NUMERIC,IsoLengths.FIXED, 2));
			add(new IsoField(40,IsoTypes.ALPHA_NUMERIC,IsoLengths.FIXED, 3));
			add(new IsoField(41,IsoTypes.ALPHA_NUMERIC_SPECIAL_CHARS,IsoLengths.FIXED, 8));
			add(new IsoField(42,IsoTypes.ALPHA_NUMERIC_SPECIAL_CHARS,IsoLengths.FIXED, 15));
			add(new IsoField(43,IsoTypes.ALPHA_NUMERIC_SPECIAL_CHARS,IsoLengths.FIXED, 40));
			add(new IsoField(44,IsoTypes.ALPHA_NUMERIC,IsoLengths.LLVAR, 25));
			add(new IsoField(45,IsoTypes.ALPHA_NUMERIC,IsoLengths.LLVAR, 76));
			add(new IsoField(46,IsoTypes.ALPHA_NUMERIC,IsoLengths.LLLVAR, 999));
			add(new IsoField(47,IsoTypes.ALPHA_NUMERIC,IsoLengths.LLLVAR, 999));
			add(new IsoField(48,IsoTypes.ALPHA_NUMERIC,IsoLengths.LLLVAR, 999));
			add(new IsoField(49,IsoTypes.ALPHA,IsoLengths.FIXED, 3));
			add(new IsoField(50,IsoTypes.ALPHA,IsoLengths.FIXED, 3));
			add(new IsoField(51,IsoTypes.ALPHA,IsoLengths.FIXED, 3));
			add(new IsoField(52,IsoTypes.BINARY,IsoLengths.FIXED, 64));
			add(new IsoField(53,IsoTypes.NUMERIC,IsoLengths.FIXED, 16));
			add(new IsoField(54,IsoTypes.ALPHA_NUMERIC,IsoLengths.FIXED, 120));
			add(new IsoField(55,IsoTypes.ALPHA_NUMERIC_SPECIAL_CHARS,IsoLengths.FIXED, 999));
			add(new IsoField(56,IsoTypes.ALPHA_NUMERIC_SPECIAL_CHARS,IsoLengths.FIXED, 999));
			add(new IsoField(57,IsoTypes.ALPHA_NUMERIC_SPECIAL_CHARS,IsoLengths.FIXED, 999));
			add(new IsoField(58,IsoTypes.ALPHA_NUMERIC_SPECIAL_CHARS,IsoLengths.FIXED, 999));
			add(new IsoField(59,IsoTypes.ALPHA_NUMERIC_SPECIAL_CHARS,IsoLengths.FIXED, 999));
			add(new IsoField(60,IsoTypes.ALPHA_NUMERIC_SPECIAL_CHARS,IsoLengths.FIXED, 999));
			add(new IsoField(61,IsoTypes.ALPHA_NUMERIC_SPECIAL_CHARS,IsoLengths.FIXED, 999));
			add(new IsoField(62,IsoTypes.ALPHA_NUMERIC_SPECIAL_CHARS,IsoLengths.FIXED, 999));
			add(new IsoField(63,IsoTypes.ALPHA_NUMERIC_SPECIAL_CHARS,IsoLengths.FIXED, 999));
			add(new IsoField(64,IsoTypes.BINARY,IsoLengths.FIXED, 64));
			add(new IsoField(65,IsoTypes.BINARY,IsoLengths.FIXED, 1));
			add(new IsoField(66,IsoTypes.NUMERIC,IsoLengths.FIXED, 1));
			add(new IsoField(67,IsoTypes.NUMERIC,IsoLengths.FIXED, 2));
			add(new IsoField(68,IsoTypes.NUMERIC,IsoLengths.FIXED, 3));
			add(new IsoField(69,IsoTypes.NUMERIC,IsoLengths.FIXED, 3));
			add(new IsoField(70,IsoTypes.NUMERIC,IsoLengths.FIXED, 3));
			add(new IsoField(71,IsoTypes.NUMERIC,IsoLengths.FIXED, 4));
			add(new IsoField(72,IsoTypes.NUMERIC,IsoLengths.FIXED, 4));
			add(new IsoField(73,IsoTypes.NUMERIC,IsoLengths.FIXED, 6));
			add(new IsoField(74,IsoTypes.NUMERIC,IsoLengths.FIXED, 10));
			add(new IsoField(75,IsoTypes.NUMERIC,IsoLengths.FIXED, 10));
			add(new IsoField(76,IsoTypes.NUMERIC,IsoLengths.FIXED, 10));
			add(new IsoField(77,IsoTypes.NUMERIC,IsoLengths.FIXED, 10));
			add(new IsoField(78,IsoTypes.NUMERIC,IsoLengths.FIXED, 10));
			add(new IsoField(79,IsoTypes.NUMERIC,IsoLengths.FIXED, 10));
			add(new IsoField(80,IsoTypes.NUMERIC,IsoLengths.FIXED, 10));
			add(new IsoField(81,IsoTypes.NUMERIC,IsoLengths.FIXED, 10));
			add(new IsoField(82,IsoTypes.NUMERIC,IsoLengths.FIXED, 12));
			add(new IsoField(83,IsoTypes.NUMERIC,IsoLengths.FIXED, 12));
			add(new IsoField(84,IsoTypes.NUMERIC,IsoLengths.FIXED, 12));
			add(new IsoField(85,IsoTypes.NUMERIC,IsoLengths.FIXED, 12));
			add(new IsoField(86,IsoTypes.NUMERIC,IsoLengths.FIXED, 16));
			add(new IsoField(87,IsoTypes.NUMERIC,IsoLengths.FIXED, 16));
			add(new IsoField(88,IsoTypes.NUMERIC,IsoLengths.FIXED, 16));
			add(new IsoField(89,IsoTypes.NUMERIC,IsoLengths.FIXED, 16));
			add(new IsoField(90,IsoTypes.NUMERIC,IsoLengths.FIXED, 42));
			add(new IsoField(91,IsoTypes.ALPHA_NUMERIC,IsoLengths.FIXED, 1));
			add(new IsoField(92,IsoTypes.ALPHA_NUMERIC,IsoLengths.FIXED, 2));
			add(new IsoField(93,IsoTypes.ALPHA_NUMERIC,IsoLengths.FIXED, 5));
			add(new IsoField(94,IsoTypes.ALPHA_NUMERIC,IsoLengths.FIXED, 7));
			add(new IsoField(95,IsoTypes.ALPHA_NUMERIC,IsoLengths.FIXED, 42));
			add(new IsoField(96,IsoTypes.BINARY,IsoLengths.FIXED, 64));
			add(new IsoField(97,IsoTypes.NUMERIC_AMOUNT,IsoLengths.FIXED, 16));
			add(new IsoField(98,IsoTypes.ALPHA_NUMERIC_SPECIAL_CHARS,IsoLengths.FIXED, 25));
			add(new IsoField(99,IsoTypes.NUMERIC,IsoLengths.FIXED, 11));
			add(new IsoField(100,IsoTypes.NUMERIC,IsoLengths.FIXED, 11));
			add(new IsoField(101,IsoTypes.ALPHA_NUMERIC_SPECIAL_CHARS,IsoLengths.LLVAR, 17));
			add(new IsoField(102,IsoTypes.ALPHA_NUMERIC_SPECIAL_CHARS,IsoLengths.LLVAR, 28));
			add(new IsoField(103,IsoTypes.ALPHA_NUMERIC_SPECIAL_CHARS,IsoLengths.LLVAR, 28));
			add(new IsoField(104,IsoTypes.ALPHA_NUMERIC_SPECIAL_CHARS,IsoLengths.FIXED, 100));
			add(new IsoField(105,IsoTypes.ALPHA_NUMERIC_SPECIAL_CHARS,IsoLengths.FIXED, 999));
			add(new IsoField(106,IsoTypes.ALPHA_NUMERIC_SPECIAL_CHARS,IsoLengths.FIXED, 999));
			add(new IsoField(107,IsoTypes.ALPHA_NUMERIC_SPECIAL_CHARS,IsoLengths.FIXED, 999));
			add(new IsoField(108,IsoTypes.ALPHA_NUMERIC_SPECIAL_CHARS,IsoLengths.FIXED, 999));
			add(new IsoField(109,IsoTypes.ALPHA_NUMERIC_SPECIAL_CHARS,IsoLengths.FIXED, 999));
			add(new IsoField(110,IsoTypes.ALPHA_NUMERIC_SPECIAL_CHARS,IsoLengths.FIXED, 999));
			add(new IsoField(111,IsoTypes.ALPHA_NUMERIC_SPECIAL_CHARS,IsoLengths.FIXED, 999));
			add(new IsoField(112,IsoTypes.ALPHA_NUMERIC_SPECIAL_CHARS,IsoLengths.FIXED, 999));
			add(new IsoField(113,IsoTypes.ALPHA_NUMERIC_SPECIAL_CHARS,IsoLengths.FIXED, 999));
			add(new IsoField(114,IsoTypes.ALPHA_NUMERIC_SPECIAL_CHARS,IsoLengths.FIXED, 999));
			add(new IsoField(115,IsoTypes.ALPHA_NUMERIC_SPECIAL_CHARS,IsoLengths.FIXED, 999));
			add(new IsoField(116,IsoTypes.ALPHA_NUMERIC_SPECIAL_CHARS,IsoLengths.FIXED, 999));
			add(new IsoField(117,IsoTypes.ALPHA_NUMERIC_SPECIAL_CHARS,IsoLengths.FIXED, 999));
			add(new IsoField(118,IsoTypes.ALPHA_NUMERIC_SPECIAL_CHARS,IsoLengths.FIXED, 999));
			add(new IsoField(119,IsoTypes.ALPHA_NUMERIC_SPECIAL_CHARS,IsoLengths.FIXED, 999));
			add(new IsoField(120,IsoTypes.ALPHA_NUMERIC_SPECIAL_CHARS,IsoLengths.FIXED, 999));
			add(new IsoField(121,IsoTypes.ALPHA_NUMERIC_SPECIAL_CHARS,IsoLengths.FIXED, 999));
			add(new IsoField(122,IsoTypes.ALPHA_NUMERIC_SPECIAL_CHARS,IsoLengths.FIXED, 999));
			add(new IsoField(123,IsoTypes.ALPHA_NUMERIC_SPECIAL_CHARS,IsoLengths.FIXED, 999));
			add(new IsoField(124,IsoTypes.ALPHA_NUMERIC_SPECIAL_CHARS,IsoLengths.FIXED, 999));
			add(new IsoField(125,IsoTypes.ALPHA_NUMERIC_SPECIAL_CHARS,IsoLengths.FIXED, 999));
			add(new IsoField(126,IsoTypes.ALPHA_NUMERIC_SPECIAL_CHARS,IsoLengths.FIXED, 999));
			add(new IsoField(127,IsoTypes.ALPHA_NUMERIC_SPECIAL_CHARS,IsoLengths.FIXED, 999));
			add(new IsoField(128,IsoTypes.BINARY,IsoLengths.FIXED, 64));
		}};
	}

}
