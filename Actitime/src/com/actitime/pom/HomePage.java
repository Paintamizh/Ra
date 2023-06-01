package com.actitime.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(id="logoutLink")
	private WebElement lgout;
	@FindBy(xpath="//div[text()='Tasks']")
	private WebElement task;
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void getTask() {
		task.click();
	}
    public void setLogout() {
    	lgout.click();
    	
    }
		
}
