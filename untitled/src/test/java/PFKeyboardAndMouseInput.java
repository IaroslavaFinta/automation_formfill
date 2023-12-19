import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PFKeyboardAndMouseInput {
    public static void main(String[] args) throws InterruptedException {

        // Where is your chromedriver
        System.setProperty("webdriver.chrome.driver", "/Users/EvgenyShashkov/Downloads/QAschool/Drivers/chromedriver");

        // Create new instance of ChromeDriver
        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/keypress");

        WebElement name = driver.findElement(By.id("name"));

        name.sendKeys("Testing input field");

        //keyboard input
//        name.sendKeys(Keys.RETURN);

        //mouse input
        WebElement button = driver.findElement(By.id("button"));
        button.click();

        Thread.sleep(2000);

        driver.quit();

    }
}