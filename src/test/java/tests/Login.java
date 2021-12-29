package tests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.Base;
import model.Locators;
import model.commonMethods;
import pages.HomePage;

public class Login {
	
	Base base = new Base();
	WebDriver driver = base.setup();
	
	commonMethods CommonMethods = new commonMethods(driver);
	
	HomePage homePage = new HomePage(driver);
	
	@BeforeClass
	public void start() {
		driver.get(homePage.homePageUrl());
		driver.manage().window().maximize();
		
	}
	@Test
	public void loginTest() {
		assertEquals(CommonMethods.getTitle(), Locators.pageTitle);
	}
	
	
	
	
	
	
}
