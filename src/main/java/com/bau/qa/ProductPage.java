package com.bau.qa;

import org.openqa.selenium.By;

public class ProductPage extends BasePage {

    By addToBasketButton = By.className("add-to-basket");
    By basketCounterBadge = By.cssSelector(".basket-item-count-container.visible");

    public void addToBasket() {
        click(addToBasketButton);
    }

    public boolean isCounterVisibleFromBasket() {
        return findElement(basketCounterBadge).isDisplayed();
    }
}
