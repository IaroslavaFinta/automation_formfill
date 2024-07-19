import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepicker {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/Iaroslava/Downloads/chromedriver-mac-arm64/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/datepicker");

        WebElement datepicker = driver.findElement(By.id("datepicker"));

        datepicker.sendKeys("07/15/2024");
        Thread.sleep(2000);

      datepicker.sendKeys(Keys.ENTER);

// submit doesn't work because it doesn't understand that method
//        comment for understanding
//        datepicker.submit();
        Thread.sleep(3000);

        driver.quit();
    }
}
