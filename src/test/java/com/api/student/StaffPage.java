package com.api.student;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StaffPage {

    WebDriver driver;

    private By staffLoginLink = By.xpath("//a[@href='StaffLogin.jsp']");

    public StaffPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickStaffLogin() {
        driver.findElement(staffLoginLink).click();
    }
}
