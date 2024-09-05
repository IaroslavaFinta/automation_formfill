import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FPModal {
    public static void main(String[] args) throws InterruptedException {

        // Where is your chromedriver
        System.setProperty("webdriver.chrome.driver", "/Users/Iaroslava/Downloads/chromedriver-mac-arm64/chromedriver");

        // Create new instance of ChromeDriver
        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/modal");

        WebElement openModal = driver.findElement(By.id("modal-button"));
        openModal.click();

        WebElement closeButton = driver.findElement(By.id("close-button"));


        JavascriptExecutor js = (JavascriptExecutor)driver;
        Thread.sleep(3000);
//        closeButton.click(); >> this is how it works with modal windows
        js.executeScript("arguments[0].click();", closeButton);

        Thread.sleep(3000);

        driver.quit();
    }
}

