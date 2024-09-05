import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FPDisabledAndEnabledElements {

    public static void main(String[] args) throws InterruptedException {

        // Where is your chromedriver
        System.setProperty("webdriver.chrome.driver", "/Users/Iaroslava/Downloads/chromedriver-mac-arm64/chromedriver");

        // Create new instance of ChromeDriver
        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/enabled");

        WebElement disabledElement = driver.findElement(By.id("disabledInput"));
        Assert.assertFalse(disabledElement.isEnabled());
        System.out.println("just validated that element is disabled");
//        disabledElement.sendKeys("123");


        WebElement enabledElement = driver.findElement(By.id("input"));
        Assert.assertTrue(enabledElement.isEnabled());
        System.out.println("just validated that element is enabled");

       enabledElement.sendKeys("testing enabled field input");

       Thread.sleep(3000);

       driver.quit();

    }
}