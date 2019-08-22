package com.example.fields;

import com.jagacy.AbstractSession;
import com.jagacy.Key;
import com.jagacy.Session3270;
import com.jagacy.framework.g;
import com.jagacy.ui.UserInterface;
import com.jagacy.util.JagacyException;
import com.jagacy.util.JagacyProperties;
import com.jagacy.util.Loggable;

public class CreateLocation extends Session3270 {
	
	public CreateLocation(String arg0) throws JagacyException {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	
	
	String a ;
	
	private int row;
    private int column;
    private String text;

    /*public CreateLocation(final int rowNum, final int columnNum,
                      final String labelText) {
        this.row = rowNum;
        this.column = columnNum;
        this.text = labelText;
    }
*/
    /**
     * Get row number of the label.
     * @return row number
     */
    public final int getRow() {
        return row;
    }

    /**
     * Get column number of the label.
     * @return column number
     */
    public final int getColumn() {
        return column;
    }

    /**
     * Get label text.
     * @return label text
     */
    public final String getText() {
        return text;
    }

    
    public static void main(String[] args) throws JagacyException {
		
    	String a = "Test";
    	CreateLocation sa = new CreateLocation(a);
    	
    	//sa.readPosition(arg0, arg1, arg2)
    	
    	
    	
	}

    
}
