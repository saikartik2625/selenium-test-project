package com.api.seliniium;

//import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

    @Test
    void validLoginTest() {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");

        
        LoginPage login = new LoginPage(driver);
        login.loginClick("standard_user", "secret_sauce");
        									

        Inventory inventory = new Inventory(driver);
        inventory.addToCart();
        inventory.openCart();
        inventory.checkOut();
        
        CheckOutPage c = new CheckOutPage(driver);
        c.ContinueNext("kartik","movva","vvnagar");
        
        Finishh f = new Finishh(driver);
        f.ff();
        
        
    }
}
