package com.leafBot.pages;

import com.leafBot.selenium.api.base.SeleniumBase;

public class Leads1Page extends SeleniumBase {
	
	public PcreateLead leftlink() {
		
		
		//click(locateElement("class","decorativeSubmit"));
		//driver.findElementByLinkText("Create Lead").click();
		
		click(locateElement("link","Create Lead"));
		
		
		return new  PcreateLead ();
	}

}
