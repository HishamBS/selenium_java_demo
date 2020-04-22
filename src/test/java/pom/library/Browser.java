package pom.library;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {

    static {
        System.setProperty("webdriver.gecko.driver", "/usr/local/bin/geckodriver");
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
    }

    public WebDriver getChrome() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--lang=es");
        return setup(new ChromeDriver(options));
    }

    public WebDriver getFirefox() {
        return setup(new FirefoxDriver());
    }

    private WebDriver setup(WebDriver driver) {
        driver.manage().window().maximize();
        return driver;
    }
}