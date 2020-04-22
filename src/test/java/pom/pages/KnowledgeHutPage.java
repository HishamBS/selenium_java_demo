package pom.pages;

import org.openqa.selenium.WebDriver;

public class KnowledgeHutPage extends Page {
    public static final String CORRECT_TITLE = "Professional Certification Courses, Classroom And Virtual Trainings";

    public KnowledgeHutPage(WebDriver driver) {

        super(driver);
    }

    public String getTitle(){
        return getTabTitle();
    }

    public boolean isSuccessfull() {
        return CORRECT_TITLE.equals(getTitle());
    }
}
