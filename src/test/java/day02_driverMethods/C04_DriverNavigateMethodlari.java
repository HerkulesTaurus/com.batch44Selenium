package day02_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_DriverNavigateMethodlari {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://www.amazon.com");
        // driver.get ile aynı islemi yapar ama daha hizlidir

        driver.navigate().to("https://www.google.com");

        driver.navigate().back(); // sayfayi geri goturur

        driver.navigate().forward(); // sayfayi geri goturur

        driver.navigate().refresh(); // sayfayi yeniler



    }
}
