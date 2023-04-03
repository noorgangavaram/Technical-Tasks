import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Handling_Multiple_Windows {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\IdeaProjects\\Selenium_Technical_Tasks\\Drivers\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.salesforce.com/au/");
        driver.manage().window().maximize();

        WebElement freeTrail = driver.findElement(By.xpath("(//a[@aria-label=\"Start my free trial with Salesforce CRM\"])[1]"));
        freeTrail.click();

        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

        Set<String> widowsHandles =  driver.getWindowHandles();
        //It will return the set of windowHandles which can be used to itarate over
        System.out.println(widowsHandles);

        Iterator<String> iterator =  widowsHandles.iterator();
        String parentWindow = iterator.next();
        String childWindow = iterator.next();
        driver.switchTo().window(childWindow);

        driver.findElement(By.xpath("//input[@name=\"UserFirstName\"]")).sendKeys("Noor Mohammad");

        driver.findElement(By.xpath("//input[@name=\"UserLastName\"]")).sendKeys("Gangavaram");

    }
}
