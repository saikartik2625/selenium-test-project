package com.api.seliniium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutPage {
	WebDriver driver;
	
	private By firstname=By.id("first-name");
	private By lastname=By.id("last-name");
	private By postalcode=By.id("postal-code");
	private By contine=By.id("continue");
	
	public CheckOutPage(WebDriver driver) {
        this.driver = driver;
    }
	
	
	public void ContinueNext(String fname,String lname,String pcode) {
		driver.findElement(firstname).sendKeys(fname);
		driver.findElement(lastname).sendKeys(lname);
		driver.findElement(postalcode).sendKeys(pcode);
		driver.findElement(contine).click();
}
}