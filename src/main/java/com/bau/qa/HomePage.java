package com.bau.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {

    public void clickLogin(WebDriver driver) {
        WebElement loginButton = driver.findElement(By.className("account-user"));
        loginButton.click();
    }

    public String getTextOfAccountButton(WebDriver driver) {
        WebElement loginButton = driver.findElement(By.className("account-user"));
        return loginButton.getText();
    }
}
