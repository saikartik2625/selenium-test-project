package com.api.seliniium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Inventory {

    WebDriver driver;

    
    private By addToCartButton = By.id("add-to-cart-sauce-labs-backpack");
    private By cartIcon = By.className("shopping_cart_link");
    private By checkOut = By.id("checkout"); 

    
    public Inventory(WebDriver driver) {
        this.driver = driver;
    }

    
    public void addToCart() {
        driver.findElement(addToCartButton).click();
    }

        public void openCart() {
        driver.findElement(cartIcon).click();
    }
        public void checkOut() {
        	driver.findElement(checkOut).click();
        	
        }
}
