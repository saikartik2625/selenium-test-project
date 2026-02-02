package com.api.seliniium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Finishh {
	WebDriver driver;
	private By ffinish=By.id("finish");
	
	public Finishh(WebDriver driver) {
		this.driver=driver;
	}
	public void ff() {
		driver.findElement(ffinish).click();
	}
}
