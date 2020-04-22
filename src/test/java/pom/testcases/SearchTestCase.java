package pom.testcases;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pom.library.Browser;
import pom.pages.*;

import static org.junit.Assert.assertTrue;

public class SearchTestCase {
    private static final Browser browser = new Browser();

    @Test
    public void searchnWithChrome() {
        WebDriver chrome = browser.getChrome();
        search(chrome);
        chrome.close();

    }

    @Test
    public void loginWithFirefox() {
        WebDriver firefox = browser.getFirefox();
        search(firefox);
        firefox.close();
    }

    private void search(WebDriver driver) {
        final GoogleSearchPage googleSearchPage = new GoogleSearchPage(driver);
        final GoogleResultsPage googleResultsPage = new GoogleResultsPage(driver);
        final KnowledgeHutPage knowledgeHutPage = new KnowledgeHutPage(driver);
        googleSearchPage.search("knowledgehut");
        googleResultsPage.clickSearchResult();

        if (!knowledgeHutPage.isSuccessfull())
            knowledgeHutPage.screenshot("chrome error");

        assertTrue(knowledgeHutPage.isSuccessfull());
    }
}
