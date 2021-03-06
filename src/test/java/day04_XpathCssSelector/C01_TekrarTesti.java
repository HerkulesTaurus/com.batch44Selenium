package day04_XpathCssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C01_TekrarTesti {
    public static void main(String[] args) {

        //1. Bir class oluşturun : AmazonSearchTest
        //2. Main method oluşturun ve aşağıdaki görevi tamamlayın.

        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //    a.amazon web sayfasına gidin. https://www. amazon.com/

        driver.get("https://www.amazon.com");

        //    b. Search kutusuna "city bike" yazıp arattırın(ara) “city bike”
        WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("city bike" + Keys.ENTER);
        //aramaKutusu.submit();--> dıger yontem Key.ENTER yerıne yazılabılır

        //    c. Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın

        WebElement sonucYazisiElementi = driver.findElement(By.className("sg-col-inner")); // alttaki xpath le bulunusu
        // WebElement sonucYazisiElementi=driver.findElement(By.xpath("//div[@class='sg-col-14-of-20 sg-col s-breadcrumb sg-col-10-of-16 sg-col-6-of-12']"));
        System.out.println(sonucYazisiElementi.getText());
        // classname ile daha once bu elementi locate edemedigimiz halde
        // xpathile class attribute  ile locate ettık

        //    d. “Shopping” e tıklayın.
        //    e. Sonra karşınıza çıkan ilk sonucun resmine tıklayın

        //1- WebElement ilkUrunResmi = driver.findElement(By.className("s-image"));
        //2- ilkUrunResmi.click();

        // sadece click yapmak gibi basit bir islemde kullanacagımız webelementler icin
        // variable olusturmadan direkt lacate edip, istedgımız islemi yapabılırız

        driver.findElement(By.className("s-image")).click(); // --> yukarıdakı 1 ve 2 numaralı ıslem tek satırda yazılabılır

    }
}
