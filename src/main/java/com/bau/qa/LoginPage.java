package com.bau.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static com.bau.qa.BaseTest.getDriver;

public class LoginPage extends BasePage {

    public void login(String email, String password, boolean isSuccess) {
        WebElement emailTextBox = getDriver().findElement(By.id("login-email"));
        emailTextBox.click();
        emailTextBox.sendKeys(email);

        WebElement passwordTextBox = getDriver().findElement(By.id("login-password-input"));
        passwordTextBox.click();
        passwordTextBox.sendKeys(password);

        WebElement loginSubmitButton = getDriver().findElement(By.className("submit"));
        loginSubmitButton.click();

        if (isSuccess) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[data-testid=sliderList]")));
        } else {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("error-box-wrapper")));
        }
    }

    public String getWarningText() {
        WebElement warningBox = getDriver().findElement(By.id("error-box-wrapper"));
        return warningBox.getText();
    }
}
