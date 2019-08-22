package com.example.fields;

import com.example.session.Session;
import com.jagacy.Session3270;
import com.jagacy.util.JagacyException;

public class base extends Session3270 {

	
	
	public base(String arg0) throws Exception {
		super(arg0);
		// TODO Auto-generated constructor stub
	}
	
	
	
	public static String getValueWithLength(int row, int column, int length) throws Exception{
		
		base a = new base("Test");	
		return a.readPosition(row, column, length);
		
	}
	
	
}
