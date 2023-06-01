package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskList  {
	@FindBy(xpath="//div[@class='addNewButton']")
	private WebElement addnew;
	@FindBy(xpath="//div[@class='item createNewCustomer']")
	private WebElement newcustomer;
	@FindBy(xpath="//input[@class='inputFieldWithPlaceholder newNameField inputNameField']")
	private WebElement addnewcustomer;
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
	private WebElement description;
	@FindBy(xpath="//div[@class='emptySelection']")
	private WebElement dropdown;
	@FindBy(xpath="//div[@class='searchItemList']/div[4]")
	private WebElement bigbangcompany;
	@FindBy(xpath="//div[text()='Create Customer']")
	private WebElement createcustomer;
	@FindBy(xpath="//div[@class='titleEditButtonContainer']/div[1]")
	private WebElement actualresult;
	public TaskList(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public WebElement getAddnew() {
		return addnew;
	}
	
	public WebElement getActualresult() {
		return actualresult;
	}
	public WebElement getNewcustomer() {
		return newcustomer;
	}
	public WebElement getAddnewcustomer() {
		return addnewcustomer;
	}
	public WebElement getDescription() {
		return description;
	}
	public WebElement getDropdown() {
		return dropdown;
	}
	public WebElement getBigbangcompany() {
		return bigbangcompany;
	}
	public WebElement getCreatecustomer() {
		return createcustomer;
	}
	
	}


