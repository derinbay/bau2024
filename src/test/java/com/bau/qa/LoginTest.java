package com.bau.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class LoginTest extends BaseTest {

    @Test
    public void shouldLoginWithCorrectInfo() {
        HomePage homePage = new HomePage();
        homePage.clickLogin(driver);

        LoginPage loginPage = new LoginPage();
        loginPage.login(driver, wait, "automatedbuyer-3cd5ab6d-4089-48d1-89a1-dddd722cc732@trendyol.com", "1234567a");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[data-testid=sliderList]")));

        String currentUrl = homePage.getCurrentUrl(driver);
        assertEquals(currentUrl, "https://www.trendyol.com/");

        String accountText = homePage.getTextOfAccountButton(driver);
        assertEquals(accountText, "Hesabım");
    }

    @Test
    public void shouldNotLoginWithWrongPassword() {
        HomePage homePage = new HomePage();
        homePage.clickLogin(driver);

        LoginPage loginPage = new LoginPage();
        loginPage.login(driver, wait, "automatedbuyer-3cd5ab6d-4089-48d1-89a1-dddd722cc732@trendyol.com", "dsakjdhak");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("error-box-wrapper")));

        String warningText = loginPage.getWarningText(driver);
        assertEquals(warningText, "E-posta adresiniz ve/veya şifreniz hatalı.");
    }

    // Data
    // Method calls for actions
    // Assertions
}