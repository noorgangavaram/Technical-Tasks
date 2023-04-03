import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class Select_Multiple_Options_Dropdown {
    public static void main(String args[]){

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\IdeaProjects\\Selenium_Technical_Tasks\\Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://semantic-ui.com/modules/dropdown.html");
        driver.manage().window().maximize();


        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
        WebElement select = driver.findElement(By.xpath("//div[@class=\"ui fluid dropdown selection multiple active visible\"]"));
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);

        select.click();

        Select select1 = new Select(select);
        select1.selectByVisibleText("Angular");
       // select1.selectByValue("ia");
       // select1.selectByIndex(7);

        driver.close();


    }
}
