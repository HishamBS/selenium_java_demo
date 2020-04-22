package pom.pages;

import org.openqa.selenium.WebDriver;

public class GoogleResultsPage extends Page {

    public GoogleResultsPage(WebDriver driver) {

        super(driver);
    }

    public void clickSearchResult(){
        clickGoogleFirstResult("Knowledgehut");
    }

}
