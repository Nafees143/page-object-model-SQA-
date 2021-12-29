package model;

import org.openqa.selenium.By;

public class Locators {
	
	public static String homePageUrl = "https://www.daraz.com.bd/";
	
	public static String pageTitle = "Online Shopping in Bangladesh: Order Now from Daraz.com.bd";
	
	//Login x-path
	public static By loginClick = By.xpath("//a[contains(text(),'Signup / Login')]");
	
	public static By enterserName = By.xpath("//input[@placeholder='Please enter your Phone Number or Email']");
	
	public static By enterPassword = By.xpath("//input[@type='password']");
	
	public static By loginButtonClick = By.xpath("//button[contains(text(),'LOGIN')]");


}
