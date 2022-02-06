package day05_RelativeXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_TekrarTesti {
    public static void main(String[] args) {
        //1-C01_TekrarTesti isimli bir class olusturun

        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //2- https://www.amazon.com/ adresine gidin
        driver.get("https://www.amazon.com/");
        //3- Browseri tam sayfa yapin
        driver.manage().window().maximize();
        //4-Sayfayi “refresh” yapin
        driver.navigate().refresh();
        //5- Sayfa basliginin “Spend less” ifadesi icerdigini test edin
        String actualTitle= driver.getTitle();
        String titleArananKelime="Spend less";
        if (actualTitle.contains(titleArananKelime)){
            System.out.println("Title testi PASS");
        }else{
            System.out.println("Title testi FAİLED\nActual Title"+actualTitle);
        }
        //6- Gift Cards sekmesine basin
        driver.findElement(By.xpath("//a[text()='Gift Cards']")).click();
        //7- Birthday butonuna basin
        driver.findElement(By.xpath("//img[@alt='Birthday Gift Cards']")).click();
        //8- Best Seller bolumunden ilk urunu tiklayin
        driver.findElement(By.xpath("//span[@class='a-truncate-cut])[1]")).click();
        //9- Gift card details’den 25 $’i  secin
        driver.findElement(By.xpath("//button[@value='25.00']")).click();
        //10-Urun ucretinin 25$ oldugunu test edin
        WebElement fiyatElementi=driver.findElement(By.xpath("//span[@class='-color-price a-text-bold']"));
        String expectedPrize="$25.00";
        String actualPrize=fiyatElementi.getText();

        if (expectedPrize.equals(actualPrize)){
            System.out.println("Prize test PASS");
        }else {
            System.out.println("Prize test FAİLED");
        }
        //10-Sayfayi kapatin
     driver.close();




    }
}
