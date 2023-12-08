package com.bau.qa;

import org.openqa.selenium.By;

import java.util.Set;

import static com.bau.qa.BaseTest.getDriver;

public class SearchResultPage extends BasePage {

    By productCard = By.className("p-card-wrppr");

    public boolean hasProducts() {
        return findElement(productCard).isDisplayed();
    }

    public ProductPage clickFirstProduct() {
        click(productCard, 0);

        String currentWindow = getDriver().getWindowHandle();
        Set<String> allWindows = getDriver().getWindowHandles();

        for (String windowHandle : allWindows) {
            if (!currentWindow.contentEquals(windowHandle)) {
                getDriver().switchTo().window(windowHandle);
                break;
            }
        }

        return new ProductPage();
    }
}
