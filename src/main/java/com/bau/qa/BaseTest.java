package com.bau.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BaseTest {
    private static final ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static WebDriver getDriver() {
        return driver.get();
    }

    @BeforeMethod
    public void startUp() {
        driver.set(new ChromeDriver());
        getDriver().get("https://www.trendyol.com");
        WebElement closeButton = getDriver().findElement(By.className("modal-close"));
        closeButton.click();
        WebElement acceptButton = getDriver().findElement(By.id("onetrust-accept-btn-handler"));
        acceptButton.click();
    }

    @AfterMethod
    public void tearDown() {
        getDriver().quit();
    }
}
