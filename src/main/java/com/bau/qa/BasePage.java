package com.bau.qa;

import org.openqa.selenium.WebDriver;

public class BasePage {

    public String getCurrentUrl(WebDriver driver) {
        return driver.getCurrentUrl();
    }
}
