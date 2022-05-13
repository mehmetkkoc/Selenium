package day04_xpath_cssLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import java.time.Duration;

public class C04_RelativeXpath {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.diemol.com/selenium-4-demo/relative-locators-demo.html");
        WebElement boston=driver.findElement(By.id("pid6_thumb"));
        WebElement sailor=driver.findElement(By.id("pid11_thumb"));
        WebElement mountie=driver.findElement(RelativeLocator.with(By.tagName("img")).below(boston).toLeftOf(sailor));
        Thread.sleep(2000);
        mountie.click();
    }
}
