package com.bau.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {

    By accountUser = By.className("account-user");
    By searchBar = By.cssSelector("[data-testid=suggestion]");
    By searchIcon = By.cssSelector("[data-testid=search-icon]");

    public LoginPage clickLogin() {
        click(accountUser);
        return new LoginPage();
    }

    public String getTextOfAccountButton() {
        WebElement loginButton = findElement(accountUser);
        return loginButton.getText();
    }

    public SearchResultPage search(String keyword) {
        findElement(searchBar).sendKeys(keyword);
        click(searchIcon);
        return new SearchResultPage();
    }
}
