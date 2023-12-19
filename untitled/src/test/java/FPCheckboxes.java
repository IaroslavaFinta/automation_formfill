import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FPCheckboxes {

    public static void main(String[] args) throws InterruptedException {

        // Where is your chromedriver
        System.setProperty("webdriver.chrome.driver", "/Users/EvgenyShashkov/Downloads/QAschool/Drivers/chromedriver");

        // Create new instance of ChromeDriver
        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/checkbox");

        WebElement checkbox1 = driver.findElement(By.id("checkbox-1"));
        checkbox1.click();

        Thread.sleep(3000);

        WebElement checkbox2 = driver.findElement(By.xpath("//*[@id=\"checkbox-2\"]"));
        checkbox2.click();
        Thread.sleep(3000);

        WebElement checkbox3 = driver.findElement(By.cssSelector("#checkbox-3"));
        checkbox3.click();
        Thread.sleep(3000);

        checkbox1.click();
        Thread.sleep(3000);

        checkbox2.click();
        Thread.sleep(3000);

        checkbox3.click();
        Thread.sleep(3000);
        driver.quit();
    }
}

