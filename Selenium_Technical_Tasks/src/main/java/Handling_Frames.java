import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Frames {
    public static void main(String args[]){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\IdeaProjects\\Selenium_Technical_Tasks\\Drivers\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
        driver.manage().window().maximize();

        WebElement frame1 = driver.findElement(By.id("iframeResult"));
        driver.switchTo().frame(frame1);

        WebElement btn = driver.findElement(By.xpath("//button[contains(text(),\"Try it\")]"));
        btn.click();
        driver.switchTo().alert().sendKeys("Noor Mohammad");
        driver.switchTo().alert().accept();

    }

}
