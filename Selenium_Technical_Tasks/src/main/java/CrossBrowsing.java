import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class CrossBrowsing {

    String URL = "https://www.salesforce.com/au/";
    WebDriver driver;

    public  void launchapp(String browser) {

        if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver","C:\\Users\\Admin\\IdeaProjects\\nopCommerce E-Commerce Application\\Drivers\\geckodriver-v0.32.0-win64\\geckodriver.exe");
            driver = new FirefoxDriver();
            driver.get(URL);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.manage().window().maximize();
        } else if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\IdeaProjects\\Selenium_Technical_Tasks\\Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.get(URL);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.manage().window().maximize();
        } else {
            throw new IllegalArgumentException("The Browser Type is Undefined");
        }
    }
    public static void main(String args[]){

        CrossBrowsing crossBrowsing = new CrossBrowsing();
        crossBrowsing.launchapp("chrome");


    }
}
