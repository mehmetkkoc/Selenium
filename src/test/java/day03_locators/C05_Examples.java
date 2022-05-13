package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C05_Examples {
    public static void main(String[] args) {
        /*
        1- amazon.com'a gidip arama kutusunu locate edin
        2- arama kutusunun tagName'inin input oldugunu test edin
        3- arama kutusunun name attribute'nun degerinin field-keywords oldugunu test edin
     */
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https:www.amazon.com");

        WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));

        String expectedTagName="input";
        String actualTagName=aramaKutusu.getTagName();

        if (actualTagName.equals(expectedTagName)){
            System.out.println("tagName test PASSED");
        }else{
            System.out.println("tagName test FAILED");
        }

        String expectedName="field-keywords";
        String actualName=aramaKutusu.getAttribute("name");

        if (actualName.equals(expectedName)){
            System.out.println("name testi PASSED");
        }else{
            System.out.println("name test FAILED");
        }

        System.out.println("konum : " + aramaKutusu.getLocation());
        System.out.println("webelement yuksekligi : " + aramaKutusu.getSize().height);
        driver.close();


    }
}
