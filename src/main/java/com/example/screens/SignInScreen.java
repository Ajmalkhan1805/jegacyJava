package com.example.screens;

import com.example.fields.EntryField;
import com.example.fields.LabelField;
import com.example.fields.base;
import com.example.session.Session;
import com.jagacy.Key;
import com.jagacy.util.JagacyException;

public class SignInScreen {


    private Session session;
    private String screenCrc = "0x5985865d";
    
    // Screen fields
    private LabelField waitForLabel = new LabelField(0, 35, "Sign On");
    private EntryField userEntryField = new EntryField(5, 52);
    private EntryField passwordEntryField = new EntryField(6, 52);
    private LabelField warnLabel =  new LabelField(0, 27, "Display Program Messages");
    
    public SignInScreen(final Session s) throws JagacyException {
        this.session = s;
        if (!session.waitForTextLabel(waitForLabel)) {
            throw new IllegalStateException("Not Sign On "
                    + "Search screen!");
        }

        if (session.getCrc32() != Long.decode(screenCrc)) {
            throw new IllegalStateException("Sign In"
                    + " screen has been changed!");
        }
    }
    
    
    public final void signInTest(String user, String password)
            throws Exception {
        session.setEntryFieldValue(userEntryField, user);
        session.writeKey(Key.TAB);
        session.setEntryFieldValue(passwordEntryField, password);
        session.writeKey(Key.ENTER);
        session.waitForChange(session.DEFAULT_TIMEOUT);
        Thread.sleep(5000);
    }
    
    
    public final void verifySignIn() throws Exception{
      

    	
    	if(session.waitForTextLabel(warnLabel)){
    		
    		System.out.println("Test Passed  :  "+warnLabel.getText() );
    		
    		System.out.println(session.readPosition(0, 27, 7));
    		//System.out.println(base.getValueWithLength(0, 27, 7));
    		 session.writeKey(Key.ENTER);
    		 Thread.sleep(20000);
    }else{ System.out.println("Failed");
	 Thread.sleep(20000);}
    
    }
    
}
