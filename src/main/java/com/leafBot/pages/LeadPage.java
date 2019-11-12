package com.leafBot.pages;

import com.leafBot.selenium.api.base.SeleniumBase;

public class LeadPage  extends SeleniumBase{
	
	public Leads1Page  clicklead() {
		
		//click(locateElement("class","decorativeSubmit"));
		//driver.findElementByLinkText("Leads").click();
		
		click(locateElement("link","Leads"));
		
	  	return new Leads1Page();
	}

}
