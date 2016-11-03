/*
 * Licensed Materials - Property of Cirrus Link Solutions
 * Copyright (c) 2016 Cirrus Link Solutions LLC - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 */

package com.cirruslink.sparkplug.message.model;

/**
 * A enumeration of data types associated with a DataSet
 */
public enum DataSetDataType {
	
	// Basic Types
	Int8(1),
	Int16(2),
	Int32(3),
	Int64(4),
	UInt8(5),
	UInt16(6),
	UInt32(7),
	UInt64(8),
	Float(9),
	Double(10),
	Boolean(11),
	String(12),
	DateTime(13),
	Text(14),
	
	// Unknown
	Unknown(0);
	
	private int intValue = 0;
	
	private DataSetDataType() {
	}
	
	private DataSetDataType(int intValue) {
		this.intValue = intValue;
	}
	
	public int toIntValue() {
		return this.intValue;
	}
	
	public static DataSetDataType fromInteger(int i) {
		switch(i) {
			case 1:
				return Int8;
			case 2:
				return Int16;
			case 3:
				return Int32;
			case 4:
				return Int64;
			case 5:
				return UInt8;
			case 6:
				return UInt16;
			case 7:
				return UInt32;
			case 8:
				return UInt64;
			case 9:
				return Float;
			case 10:
				return Double;
			case 11:
				return Boolean;
			case 12:
				return String;
			case 13:
				return DateTime;
			case 14:
				return Text;
			default:
				return Unknown;
		}
	}
}
