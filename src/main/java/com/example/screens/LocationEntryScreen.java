package com.example.screens;

import com.example.fields.EntryField;
import com.example.fields.LabelField;
import com.example.session.Session;
import com.jagacy.Key;

public class LocationEntryScreen {

	private Session session;
	
	private EntryField entry;
	
    private LabelField waitForLabel = new LabelField(1, 31, "Location Entry");
    private EntryField companyEntryField = new EntryField(10, 49);
    private EntryField locationEntryField = new EntryField(11, 50);
    private LabelField warnLabel =  new LabelField(0, 27, "Display Program Messages");
	
    public EntryField entryRowCol(EntryField e, int row, int col){
    	this.entry = e;
    	entry = new EntryField(row, col);
    	
    	return entry;
    	
    }
    
    
    
    public LocationEntryScreen(Session s){
    	this.session = s;
    }
    
    
    public void locationEntry(String comapny, String location) throws Exception{
    	
    	if(session.waitForTextLabel(waitForLabel)){
    		
    		session.setEntryFieldValue(companyEntryField, comapny);
    		session.setEntryFieldValue(locationEntryField, location);
    		session.writeKey(Key.ENTER);
    	}
    	
    }
    
    
    
    public void VerifyLocatoinEntry() throws Exception{
    	
    	if(session.waitForTextLabel(new LabelField(17, 7, "Terminal Address = QPADEV005C"))){
    
    		//session.setEntryFieldValue(entryRowCol(entry, 17,7),label); 
    		System.out.println("Terminal Address = QPADEV005C");
    		Thread.sleep(5000);
    	}else{
    		System.out.println(new LabelField(17, 7, "Terminal Address = QPADEV005C").getText());
    		System.out.println("Failed");}
    	Thread.sleep(5000);
    }
    
	
}
