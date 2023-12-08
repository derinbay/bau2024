package com.bau.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {
    private static final ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static WebDriver getDriver() {
        return driver.get();
    }

    @BeforeMethod
    public void startUp() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setCapability("browserName", "chrome");
        try {
            driver.set(new RemoteWebDriver(new URL("http://localhost:4444"), chromeOptions));
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        getDriver().get("https://www.trendyol.com");
        getDriver().findElement(By.className("modal-close"))
                .click();
        getDriver().findElement(By.id("onetrust-accept-btn-handler"))
                .click();
    }

    @AfterMethod
    public void tearDown() {
        getDriver().quit();
    }
}
