package pom.pages;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;

public abstract class Page {
    protected final WebDriver driver;
    private final String url;

    public Page(WebDriver driver, String url) {
        this.driver = driver;
        this.url = url;
    }

    public Page(WebDriver driver)
    {
        this(driver,"");
    }


    protected void home() {
        driver.get(url);
    }

    protected void fillField(String selector, String text) {
        driver.findElement(By.name(selector)).sendKeys(text);
    }

    protected void submit(String selector) {
        driver.findElement(By.name(selector)).click();
    }

    protected void submitGoogle(String selector) {
        driver.findElement(By.name(selector)).submit();
    }
    protected void clickGoogleFirstResult() {
        driver.findElement(By.partialLinkText("Knowledgehut"))
                .click();
//        driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div[1]/a/h3"))
//       .click();
    }
    protected String getTabTitle(){
       return driver.getTitle();
    }


    protected String getText(String selector) {
        WebElement resultElement = driver.findElement(By.cssSelector(selector));

        return resultElement.getText();
    }

    public void screenshot(String name) {
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        try {
            FileUtils.copyFile(screenshot, new File("/Users/hbs/Desktop/" + name + ".jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getUrl() {
        return url;
    }
}
