import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FPFileUpload {
    public static void main(String[] args) throws InterruptedException {

        // Where is your chromedriver
        System.setProperty("webdriver.chrome.driver", "/Users/EvgenyShashkov/Downloads/QAschool/Drivers/chromedriver");

        // Create new instance of ChromeDriver
        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/fileupload");

        driver.manage().window().fullscreen();

        WebElement fileUploadField = driver.findElement(By.id("file-upload-field"));
        fileUploadField.sendKeys("/Users/EvgenyShashkov/Downloads/fileForUploading.png");

        Thread.sleep(2000);

        driver.quit();
    }
}