package day04_xpath_cssLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.Key;
import java.time.Duration;

public class C03_CssSelector {
    public static void main(String[] args) throws InterruptedException {

        //1 ) Bir class oluşturun : Locators_css
        //2 ) Main method oluşturun ve aşağıdaki görevi tamamlayın.

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //    a. Verilen web sayfasına gidin. http://a.testaddressbook.com/sign_in

        driver.get("http://a.testaddressbook.com/sign_in");
        Thread.sleep(2000);
        //    b. Locate email textbox
        driver.findElement(By.cssSelector("input[type='email']")).sendKeys("testtechproed@gmail.com");
        Thread.sleep(2000);
        //    c. Locate password textbox ve
        driver.findElement(By.cssSelector("input#session_password")).sendKeys("Test1234!");
        Thread.sleep(2000);
        //    d. Locate signin button
        driver.findElement(By.cssSelector("input[value='Sign in']")).click();
        //    e. Asagidaki kullanıcı adını ve şifreyi girin ve sign in düğmesini tıklayın
        //        i. Username : testtechproed@gmail.com
        //        ii. Password : Test1234!

        Thread.sleep(2000);
        driver.close();

    }
}
