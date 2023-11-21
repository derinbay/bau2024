package com.bau.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static com.bau.qa.BaseTest.getDriver;

public class HomePage extends BasePage {

    public LoginPage clickLogin() {
        WebElement loginButton = getDriver().findElement(By.className("account-user"));
        loginButton.click();
        return new LoginPage();
    }

    public String getTextOfAccountButton() {
        WebElement loginButton = getDriver().findElement(By.className("account-user"));
        return loginButton.getText();
    }
}
