package parallelExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.WeakHashMap;

public class parallelExecutionExample {
    @Test
    public void openFacebook() throws InterruptedException {
        Thread.sleep(2000);
        System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        String title = driver.getTitle();
        String url = driver.getCurrentUrl();
        System.out.println(title);
        System.out.println(url);
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(title, "Facebook – log in or sign up");
        softAssert.assertEquals(url, "https://www.facebook.com/");
        softAssert.assertAll();
        driver.quit();
    }

    @Test
    public void openFacebookonFirefoxInstance() {
        System.setProperty("webdriver.gecko.driver", "./src/test/resources/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.facebook.com");
        String title = driver.getTitle();
        String url = driver.getCurrentUrl();
        System.out.println(title);
        System.out.println(url);
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(title, "Facebook – log in or sign up");
        softAssert.assertEquals(url, "https://www.facebook.com/");
        softAssert.assertAll();
        driver.quit();
    }
}
