package com.bau.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage {

    public void login(WebDriver driver, WebDriverWait wait, String email, String password) {
        WebElement emailTextBox = driver.findElement(By.id("login-email"));
        emailTextBox.click();
        emailTextBox.sendKeys(email);

        WebElement passwordTextBox = driver.findElement(By.id("login-password-input"));
        passwordTextBox.click();
        passwordTextBox.sendKeys(password);

        WebElement loginSubmitButton = driver.findElement(By.className("submit"));
        loginSubmitButton.click();
    }

    public String getWarningText(WebDriver driver) {
        WebElement warningBox = driver.findElement(By.id("error-box-wrapper"));
        return warningBox.getText();
    }
}
