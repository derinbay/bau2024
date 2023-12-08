package com.bau.qa;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class BasketTest extends BaseTest {

    @Test
    public void shouldSearchAndAddToBasket() {
        HomePage homePage = new HomePage();
        SearchResultPage searchResultPage = homePage.search("kazak");

        ProductPage productPage = searchResultPage.clickFirstProduct();
        productPage.addToBasket();

        assertTrue(productPage.isCounterVisibleFromBasket(), "Counter is not visible!");
    }

    //rest-assured
    // create a request to get some data from a public api (omdbapi)
    //
}
