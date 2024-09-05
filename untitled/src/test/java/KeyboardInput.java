import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardInput {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/Iaroslava/Downloads/chromedriver-mac-arm64/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/keypress?");

        WebElement fullName = driver.findElement(By.id("name"));
        fullName.sendKeys("Test Tester");
        fullName.sendKeys(Keys.ENTER);

        //mouse input. the button doesn't work
//        WebElement button = driver.findElement(By.id("button"));
//        button.click();

        Thread.sleep(3000);

        driver.quit();
    }
}
