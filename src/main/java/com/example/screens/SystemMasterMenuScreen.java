package com.example.screens;

import com.example.fields.EntryField;
import com.example.fields.LabelField;
import com.example.session.Session;
import com.jagacy.AbstractSession;
import com.jagacy.Location;

public class SystemMasterMenuScreen {
	
	private Session session;
	private EntryField entry;
	
    private LabelField waitForLabel = new LabelField(1, 29, "SYSTEM MASTER MENU");
    private EntryField companyEntryField = new EntryField(10, 49);

    public SystemMasterMenuScreen(Session s){
    	
    	this.session = s;
    }
    
    

   
    
    
    
}
