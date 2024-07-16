import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxes {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/Iaroslava/Downloads/chromedriver-mac-arm64/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/checkbox");

        WebElement checkbox1 = driver.findElement(By.id("checkbox-1"));
        checkbox1.click();
        Thread.sleep(2000);

        WebElement checkbox2 = driver.findElement(By.id("checkbox-2"));
        checkbox2.click();
        Thread.sleep(2000);

        WebElement checkbox3 = driver.findElement(By.id("checkbox-3"));
        checkbox3.click();
        Thread.sleep(2000);

        driver.quit();
    }

}
