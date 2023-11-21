package com.bau.qa;

import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static com.bau.qa.BaseTest.getDriver;

public class BasePage {

    WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(15));

    public String getCurrentUrl() {
        return getDriver().getCurrentUrl();
    }
}
