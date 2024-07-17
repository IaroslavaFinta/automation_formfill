import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CompleteWebForm {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/Iaroslava/Downloads/chromedriver-mac-arm64/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/form");

//       #first name
        WebElement firstName = driver.findElement(By.id("first-name"));
        firstName.sendKeys("Iaroslava");
        firstName.sendKeys(Keys.ENTER);
        Thread.sleep(2000);

//       #last name
        WebElement lastName = driver.findElement(By.id("last-name"));
        lastName.sendKeys("Finta");
        lastName.sendKeys(Keys.ENTER);
        Thread.sleep(2000);

//        #job title
        WebElement jobTitle = driver.findElement(By.id("job-title"));
        jobTitle.sendKeys("tester");
        jobTitle.sendKeys(Keys.ENTER);
        Thread.sleep(2000);

//        #highest level of education
        WebElement highSchool = driver.findElement(By.id("radio-button-1"));
        highSchool.click();
        Thread.sleep(2000);

//        #sex
        WebElement sexFemale = driver.findElement(By.id("checkbox-2"));
        sexFemale.click();
        Thread.sleep(2000);

//        #years of experience
        WebElement yearsOfExperience = driver.findElement(By.id("select-menu"));
        yearsOfExperience.click();
        Thread.sleep(1000);

        WebElement firstOption = driver.findElement(By.xpath("/html/body/div/form/div/div[6]/select/option[2]"));
        firstOption.click();
        Thread.sleep(3000);

//        #date
        WebElement date = driver.findElement(By.id("datepicker"));
        date.sendKeys("07/16/2024");
        Thread.sleep(2000);
        date.sendKeys(Keys.ENTER);
        Thread.sleep(2000);

//        #submit button
        WebElement submitButton = driver.findElement(By.xpath("/html/body/div/form/div/div[8]/a"));
        submitButton.click();
        Thread.sleep(3000);

        driver.quit();

    }
}
