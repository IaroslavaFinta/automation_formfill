import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.testng.AssertJUnit.assertTrue;

public class FPDropDown {

    public static void main(String[] args) throws InterruptedException {

        // Where is your chromedriver
        System.setProperty("webdriver.chrome.driver", "/Users/EvgenyShashkov/Downloads/QAschool/Drivers/chromedriver");

        // Create new instance of ChromeDriver
        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/dropdown");

        WebElement dropDown = driver.findElement(By.id("dropdownMenuButton"));
        dropDown.click();

        WebElement checkbox = driver.findElement(By.xpath("/html/body/div/div/div/a[3]"));
        checkbox.click();

        String currentUrl = driver.getCurrentUrl();
        assertTrue(currentUrl.contains("https://formy-project.herokuapp.com/checkbox"));
        System.out.println("We are on checkbox page");

        Thread.sleep(3000);

        driver.quit();

    }
}
