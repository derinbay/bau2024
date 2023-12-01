package com.bau.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.bau.qa.BaseTest.getDriver;

public class SearchResultPage {

    public boolean hasProducts() {
        WebElement element = getDriver().findElement(By.className("p-card-wrppr"));
        return element.isDisplayed();
    }
}
