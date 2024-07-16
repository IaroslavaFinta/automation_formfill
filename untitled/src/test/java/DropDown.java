import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertTrue;

public class DropDown {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/Iaroslava/Downloads/chromedriver-mac-arm64/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/dropdown");

        WebElement dropDownButton = driver.findElement(By.xpath("/html/body/div/div/button"));
        dropDownButton.click();

        Thread.sleep(3000);

        WebElement checkbox = driver.findElement(By.xpath("/html/body/div/div/div/a[3]"));
        checkbox.click();

        String currentUrl = driver.getCurrentUrl();
        assertTrue(currentUrl.contains("https://formy-project.herokuapp.com/checkbox"));
        System.out.println("Yes, we are on the correct page");

        Thread.sleep(3000);

        driver.quit();
    }
}