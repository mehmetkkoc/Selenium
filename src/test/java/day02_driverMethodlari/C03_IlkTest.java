package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_IlkTest {
    public static void main(String[] args) {

        /*  1 - https://www.amazon.com url sine git
            2 - Basligin Amazon kelimesi icerdigini test edin
            3 - Url nin https://www.amazon.com a esit olup olmadigini test edin
            4 - sayfayi kapatin
         */
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
       // 1 - https://www.amazon.com url sine git
        driver.get("https://www.amazon.com");
        driver.manage().window().maximize();

        //  2 - Basligin Amazon kelimesi icerdigini test edin
        String actualTitle=driver.getTitle();
        String arananKelime="Amazon";

        if (actualTitle.contains(arananKelime)){
            System.out.println("Title Testi PASSED");
        }else{
            System.out.println("Title "+arananKelime+"'yi icermiyor. Title Testi FAILED");
        }

        //3 - Url nin https://www.amazon.com a esit olup olmadigini test edin
        String actualUrl=driver.getCurrentUrl();
        String expectedUrl="https://www.amazon.com";

        if (actualUrl.equals(expectedUrl)){
            System.out.println("Url Testi PASSED");
        }else {
            System.out.println("Url Testi FAILED");
        }
        // 4 - sayfayi kapatin
        driver.close();


    }
}
