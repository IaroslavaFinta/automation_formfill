import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.Assert.assertTrue;

public class CustomizeProduct {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/Iaroslava/Downloads/chromedriver-mac-arm64/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://ws00-test.myshopify.com");

        driver.manage().window().maximize();

        WebElement passwordEnter = driver.findElement(By.id("password"));
        passwordEnter.sendKeys("12345");
        passwordEnter.sendKeys(Keys.ENTER);

        String pageText = driver.getPageSource();
        assertTrue(pageText.contains("Browse our latest products"));
        System.out.println("store is open");

        WebElement phoneCase = driver.findElement(By.xpath("/html/body/main/section[2]/div/div/slider-component/ul/li[8]/div/div/div[2]/div[1]/h3/a"));
        phoneCase.click();
        System.out.println("case is selected");

        WebDriverWait wait = new WebDriverWait(driver, 3);

        WebElement iPhone12Pro = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/main/section[1]/div/div/div/div/div/div/div/div[2]/div[1]/div/div/div[2]/div/div[2]/div[2]/div[2]/div[2]/span[2]/div/span/div")));
        iPhone12Pro.click();
        System.out.println("iPhone12Pro is selected");

        WebElement tough = driver.findElement(By.xpath("/html/body/main/section[1]/div/div/div/div/div/div/div/div[2]/div[1]/div/div/div[2]/div/div[2]/div[3]/div[2]/div[2]/span[2]/div/span/div"));
        tough.click();
        System.out.println("tough is selected");

        WebElement matte = driver.findElement(By.xpath("/html/body/main/section[1]/div/div/div/div/div/div/div/div[2]/div[1]/div/div/div[2]/div/div[2]/div[4]/div[2]/div[2]/span[2]/div/span/div"));
        matte.click();
        System.out.println("matte is selected");

        WebElement design3 = driver.findElement(By.xpath("/html/body/main/section[1]/div/div/div/div/div/div/div/div[2]/div[1]/div/div/div[2]/div/div[2]/div[5]/div[2]/div[2]/span[3]/div/span/div"));
        design3.click();
        System.out.println("design3 is selected");

//        WebElement imageUpload = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/main/section[1]/div/div/div/div/div/div/div/div[2]/div[1]/div/div/div[2]/div/div[2]/div[6]/div[2]")));
//        imageUpload.sendKeys("/Users/Iaroslava/Downloads/7grkegytV4qrcMb9zSQT8V.jpeg");
//        Thread.sleep(7000);
//        System.out.println("image is selected");

        WebElement textArea1 = driver.findElement(By.xpath("/html/body/main/section[1]/div/div/div/div/div/div/div/div[2]/div[1]/div/div/div[2]/div/div[2]/div[7]/div[2]/div[2]/div/div/label[1]/input"));
        textArea1.sendKeys("King Kobra");
        System.out.println("King Kobra is selected");

        WebElement textArea2 = driver.findElement(By.xpath("/html/body/main/section[1]/div/div/div/div/div/div/div/div[2]/div[1]/div/div/div[2]/div/div[2]/div[7]/div[2]/div[2]/div/div/label[2]/input"));
        textArea2.sendKeys("beauty snake");
        System.out.println("Beauty snake is selected");

        WebElement textColor = driver.findElement(By.xpath("/html/body/main/section[1]/div/div/div/div/div/div/div/div[2]/div[1]/div/div/div[2]/div/div[2]/div[8]/div[2]/div[2]/span[4]/span/div[1]/span"));
        textColor.click();
        System.out.println("Grey color is selected");

        WebElement ringGrey = driver.findElement(By.xpath("/html/body/main/section[1]/div/div/div/div/div/div/div/div[2]/div[1]/div/div/div[2]/div/div[2]/div[9]/div[2]/div[2]/div/div[2]"));
        ringGrey.click();
        System.out.println("ring grey is selected");

        WebDriverWait waitToAdd = new WebDriverWait(driver, 5);
        WebElement addToCart = waitToAdd.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/main/section[1]/div/div/div/div/div/div/div/div[2]/div[2]/div[2]/div/button[4]/span")));
        Thread.sleep(5000);
        addToCart.click();

        Thread.sleep(5000);

        String pageTextCart = driver.getPageSource();
        if (pageTextCart.contains("Your cart")){
            System.out.println("item is in a cart");
        } else  {
            System.out.println("test is not working");
        }

        WebElement checkout = driver.findElement(By.xpath("/html/body/main/div[2]/div/div/div/div/div[2]/button"));
        checkout.click();
        System.out.println("checkout button is clicked");

        WebDriverWait waitToFill = new WebDriverWait(driver, 5);
        WebElement email = waitToFill.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
        email.sendKeys("iaroslava.sv7@gmail.com");
        System.out.println("email is entered");

        WebElement firstName = driver.findElement(By.id("TextField0"));
        firstName.sendKeys("Iaroslava");
        System.out.println("first name is entered");

        WebElement lastName = driver.findElement(By.id("TextField1"));
        lastName.sendKeys("Finta");
        System.out.println("last name is entered");

        WebElement address = driver.findElement(By.id("shipping-address1"));
        address.sendKeys("1777 Main Ln");
        System.out.println("address is entered");

        WebElement city = driver.findElement(By.id("TextField3"));
        city.sendKeys("Beaumont");
        System.out.println("city is entered");

        WebElement zipcode = driver.findElement(By.id("TextField4"));
        zipcode.sendKeys("77713");
        zipcode.sendKeys(Keys.ENTER);
        System.out.println("zipcode is entered");

//        WebElement shippingMethodStandart = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[1]/div[2]/div[1]/div/main/div/form/div[1]/div[3]/div/section/div/div[2]/section/div/div/div[2]/div/div/div/div/div/div/fieldset/div/div[2]/div/div[1]/input"));
//        shippingMethodStandart.click();
//        System.out.println("shipping method is clicked");
//
        WebElement cardNumber = driver.findElement(By.id("number"));
        cardNumber.sendKeys("1");
        System.out.println("card number is entered");

        WebElement cardExpDate = driver.findElement(By.id("expiry"));
        cardExpDate.sendKeys("04/28");
        System.out.println("exp date is entered");

        WebElement cardCode = driver.findElement(By.id("verification_value"));
        cardCode.sendKeys("123");
        System.out.println("code is entered");

        WebDriverWait waitToPayNow = new WebDriverWait(driver, 5);
        WebElement payButton = waitToPayNow.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
        payButton.click();
        System.out.println("button pay now is clicked");

        String pageOrder = driver.getPageSource();
        assertTrue(pageOrder.contains("Your order is confirmed"));
        System.out.println("order is placed");

        driver.quit();
    }
}

