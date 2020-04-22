package pom.pages;

import org.openqa.selenium.WebDriver;

public class GoogleSearchPage extends Page
{

    private static final String URL = "https://www.google.com/en";


    public GoogleSearchPage(WebDriver driver) {

        super(driver,URL);

    }

    public void search(String query) {
        home();
        fillField("q", query);
        submitGoogle("q");
    }

//    public boolean isSuccessfull() {
//        return SUCCESSFUL_LOGIN.equals(getResults());
//    }
//
//    public String getResults() {
//        return getText(RESULT_SELECTOR);
//    }



}
