import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {

    WebDriver driver;

    @BeforeMethod
    public void setup() {

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/login");
    }

    @Test
    public void validLoginTest() {

        driver.findElement(By.id("username"))
                .sendKeys("tomsmith");

        driver.findElement(By.id("password"))
                .sendKeys("SuperSecretPassword!");

        driver.findElement(By.cssSelector("button[type='submit']"))
                .click();

        String successMessage =
                driver.findElement(By.id("flash")).getText();

        Assert.assertTrue(
                successMessage.contains("You logged into a secure area!")
        );

        Assert.assertTrue(
                driver.getCurrentUrl().contains("/secure")
        );
    }

    @Test
    public void invalidLoginTest() {

        driver.findElement(By.id("username"))
                .sendKeys("wrongusername");

        driver.findElement(By.id("password"))
                .sendKeys("wrongpassword");

        driver.findElement(By.cssSelector("button[type='submit']"))
                .click();

        String errorMessage =
                driver.findElement(By.id("flash")).getText();

        Assert.assertTrue(
                errorMessage.contains("Your username is invalid!")
        );
    }

    @Test
    public void emptyFieldsTest() {

        driver.findElement(By.cssSelector("button[type='submit']"))
                .click();

        String errorMessage =
                driver.findElement(By.id("flash")).getText();

        Assert.assertTrue(
                errorMessage.contains("Your username is invalid!")
        );
    }

    @AfterMethod
    public void tearDown() {

        driver.quit();
    }
}