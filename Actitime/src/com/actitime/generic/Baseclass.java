package com.actitime.generic;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.actitime.pom.HomePage;
import com.actitime.pom.LoginPage;

public class Baseclass {
	
	public static WebDriver driver;
	@BeforeTest
	public void openBrowser() {
		Reporter.log("open Browser",true);
	 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
	@AfterTest
	public void closeBrowser() {
		Reporter.log("close Browser",true);
	}
	@BeforeMethod
	public void login() throws IOException {
		Reporter.log("login",true);
		FileLib f=new FileLib();
		String url = f.getProperty("url");
		driver.get(url);
		LoginPage l=new LoginPage(driver);
		l.setLogin("admin","manager");
		
	}
    @AfterMethod
    public void logout() {
    	Reporter.log("logout",true);
    	HomePage h=new HomePage(driver);
    	h.setLogout();
    	
    }
}
