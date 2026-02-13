package com.api.student;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class canteentest {

    @Test
    void staffloginTest() {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://localhost:8081/collegeManagment/home.jsp");

        // Click Staff Login link
        StaffPage staffPage = new StaffPage(driver);
        staffPage.clickStaffLogin();

        // Perform login
        StaffLoginPage loginPage = new StaffLoginPage(driver);
        loginPage.login("staff", "staff");

        // driver.quit(); // enable after verification
    }
}

