package com.api.student;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StaffLoginPage {

    WebDriver driver;

    private By username = By.id("username");
    private By password = By.id("password");
    private By loginButton = By.id("login-button");

    public StaffLoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void login(String user, String pass) {
        driver.findElement(username).sendKeys(user);
        driver.findElement(password).sendKeys(pass);
        driver.findElement(loginButton).click();
    }
}
