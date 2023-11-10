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

    WebDriver driver = new ChromeDriver();
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

    @BeforeMethod
    public void startUp() {
        driver.get("https://www.trendyol.com");
        WebElement closeButton = driver.findElement(By.className("modal-close"));
        closeButton.click();
        WebElement acceptButton = driver.findElement(By.id("onetrust-accept-btn-handler"));
        acceptButton.click();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
