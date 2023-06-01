package com.actitime.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.Baseclass;
import com.actitime.generic.FileLib;
import com.actitime.pom.HomePage;
import com.actitime.pom.TaskList;
@Listeners(com.actitime.generic.ListenerImplementation.class)
public class CustomerModule extends Baseclass {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	@Test
	public void CreateCustomer() throws EncryptedDocumentException, IOException {
		Reporter.log("CreateCustomer",true);
		HomePage h=new HomePage(driver);
		h.getTask();
		FileLib f=new FileLib();
	String customer = f.getExcelData("CreateCustomer",1,2);
	String customerdata = f.getExcelData("CreateCustomer",1,3);
		TaskList t=new TaskList(driver);
		t.getAddnew().click();
		t.getNewcustomer().click();
		t.getAddnewcustomer().sendKeys(customer);
		t.getDescription().sendKeys(customerdata);
		t.getDropdown().click();
		t.getBigbangcompany().click();
		t.getCreatecustomer().click();
		String result = t.getActualresult().getText();
		Assert.assertEquals(result,customer);
	}
	
}

