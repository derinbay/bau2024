package com.bau.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SmokeTest {

    @Test
    public void firstTest() {
        //1- open trendyol
        //2- giriş yap'a tıkla
        //eposta şifre gir
        // giriş yapa bas
        //doğrula - anasayfaya yönlenme, giriş yap elementinin orda hesbaım yazıyor

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.trendyol.com");
        WebElement closeButton = driver.findElement(By.className("modal-close"));
        closeButton.click();
        WebElement acceptButton = driver.findElement(By.id("onetrust-accept-btn-handler"));
        acceptButton.click();

        WebElement loginButton = driver.findElement(By.className("account-user"));
        loginButton.click();

        WebElement emailTextBox = driver.findElement(By.id("login-email"));
        emailTextBox.click();
        emailTextBox.sendKeys("automatedbuyer-3cd5ab6d-4089-48d1-89a1-dddd722cc732@trendyol.com");

        WebElement passwordTextBox = driver.findElement(By.id("login-password-input"));
        passwordTextBox.click();
        passwordTextBox.sendKeys("1234567a");

        WebElement loginSubmitButton = driver.findElement(By.className("submit"));
        loginSubmitButton.click();

        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(currentUrl, "https://www.trendyol.com/");

        String accountText = loginButton.getText();
        Assert.assertEquals(accountText, "Hesabım");

        driver.quit();
    }
}