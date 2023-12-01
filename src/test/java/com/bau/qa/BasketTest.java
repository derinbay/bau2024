package com.bau.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import static com.bau.qa.BaseTest.getDriver;

public class BasketTest {

    /**
     * 1- search "kazak" keyword
     * 2- click first product
     * 3- add to basket
     * 4- assert that the product has beed added to basket
     * */

    public static void main(String[] args) {
        WebElement searchBar = getDriver().findElement(By.id("searchData"));
        searchBar.sendKeys("tshirt");
        WebElement searchButton = getDriver().findElement(By.className("searchBtn"));
        searchButton.click();

        getDriver().findElement(By.id("searchData")).sendKeys("tshirt" + Keys.ENTER);
    }

}
