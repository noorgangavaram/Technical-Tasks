import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class All_WebElements {
    public static void main(String args[]){

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\IdeaProjects\\Selenium_Technical_Tasks\\Drivers\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.salesforce.com/au/");
        driver.manage().window().maximize();

        List<WebElement> elementList = driver.findElements(By.tagName("div"));

        System.out.print(elementList);

    }
}
