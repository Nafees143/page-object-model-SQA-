package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class commonMethods {
	
	WebDriver driver;
	
	public commonMethods(WebDriver driver) {
		this.driver = driver;
	}
	
	public String getTitle() {
		return driver.getTitle();
	}
	
	public void clickOnButton(By btn) {
		driver.findElement(btn).click();
	}
	
	public String getText(By element) {
		return driver.findElement(element).getText();
	}
	
	public void sendText(By element , String value) {
		driver.findElement(element).sendKeys(value);
	}
	
}
