import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnabledDisabledFields {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/EvgenyShashkov/Downloads/QAschool/Drivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/enabled");

        WebElement enabledInput = driver.findElement(By.id("input"));
        Assert.assertTrue(enabledInput.isEnabled());
        System.out.println("The assertion is passed");
        enabledInput.sendKeys("Field is enabled we can type here");

        WebElement disableInput =  driver.findElement(By.id("disabledInput"));
        Assert.assertFalse(disableInput.isEnabled());
        System.out.println("The field is disable, assertion passed");

        Thread.sleep(3000);

        driver.quit();







    }
}
