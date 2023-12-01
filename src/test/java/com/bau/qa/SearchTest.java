package com.bau.qa;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class SearchTest extends BaseTest {

    @Test
    public void shouldSearchKeywordProperly() {
        /**
         * 1- Open trenyol.com
         * 2- From homepage, search "telefon" from searchbar
         * 3- Assert that you are in search result page
         * 4- Assert that there are results are listed on the page
         * */
        HomePage homePage = new HomePage();
        SearchResultPage  searchResultPage = homePage.search("telefon");
        assertEquals(getDriver().getCurrentUrl(), "https://www.trendyol.com/sr?q=telefon&qt=telefon&st=telefon&os=1");
        assertTrue(searchResultPage.hasProducts());
    }
}
