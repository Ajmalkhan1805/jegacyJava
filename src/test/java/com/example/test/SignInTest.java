package com.example.test;

import org.junit.BeforeClass;
import org.junit.Test;
import com.example.screens.*;
import com.example.session.Session;
import com.jagacy.util.JagacyException;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;




public class SignInTest {
private Session session;
private SignInScreen signIn;
private LocationEntryScreen locEntry;
private Scenario scenario;
	 
	 @BeforeClass
	    public static void setUpSuite() {
	        System.setProperty("jagacy.properties.dir",
	                "./src/test/resources");
	        System.setProperty("test.window", "true");
	    }

	  @Before
	    public void setUp(Scenario scenario){
	        this.scenario = scenario;
	    }
	    
	 
	@Test
	public void testt() throws Exception{
	    session = new Session("test");
        session.open();
        signIn  = new SignInScreen(session);
		signIn.signInTest("DISQA","conns123");	
		signIn.verifySignIn();
		int i = 0;
		while(i != 0){
		if(session.isKeyboardUnlocked()){
			System.out.println("Proceed to next");
			i = 1;
		}else
		{
			i = 0;
			Thread.sleep(2000);
			
		}
		}
		locEntry = new LocationEntryScreen(session);
		locEntry.locationEntry("CON", "112");
		locEntry.VerifyLocatoinEntry();
		
	}
	
	@After
    public void tearDown() throws JagacyException {
        session.close();
    }

}
