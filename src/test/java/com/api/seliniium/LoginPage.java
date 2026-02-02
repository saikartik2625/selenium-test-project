//package pages;

package com.api.seliniium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;
	
	private By username=By.id("user-name");
	private By password=By.id("password");
	private By login=By.id("login-button");
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void loginClick(String user,String pass) {
		driver.findElement(username).sendKeys(user);
		driver.findElement(password).sendKeys(pass);
		driver.findElement(login).click();
	}
}
//LoginPage
