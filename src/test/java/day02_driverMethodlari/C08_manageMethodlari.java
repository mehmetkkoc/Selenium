package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C08_manageMethodlari {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        System.out.println("maximize boyut "+driver.manage().window().getSize());
        System.out.println("maximize konum"+driver.manage().window().getPosition());
        Thread.sleep(2000);


        driver.manage().window().fullscreen();
        System.out.println("fullscreen boyut "+driver.manage().window().getSize());
        System.out.println("fullscreen konum"+driver.manage().window().getPosition());
        Thread.sleep(2000);

        driver.close();

    }
}
