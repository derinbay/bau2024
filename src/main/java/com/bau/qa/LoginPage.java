package com.bau.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage {

    By emailTextBox = By.id("login-email");
    By passwordTextBox = By.id("login-password-input");
    By submitButton = By.className("submit");
    By successElement = By.cssSelector("[data-testid=sliderList]");
    By errorBox = By.id("error-box-wrapper");

    public void login(String email, String password, boolean isSuccess) {
        findElement(emailTextBox).sendKeys(email);
        findElement(passwordTextBox).sendKeys(password);
        click(submitButton);

        if (isSuccess) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(successElement));
        } else {
            wait.until(ExpectedConditions.visibilityOfElementLocated(errorBox));
        }
    }

    public String getWarningText() {
        return findElement(errorBox).getText();
    }
}
