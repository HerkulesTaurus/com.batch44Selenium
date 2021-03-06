package day03_WebelementsLocators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_TekrarTesti {
    public static void main(String[] args) {

        //1. Yeni bir class olusturun (TekrarTesti)
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //2. Youtube web sayfasına gidin ve sayfa başlığının “youtube” olup olmadığını doğrulayın (verify),
        // eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.
        driver.navigate().to("https://youtube.com");
        String actualtitleYoutube = driver.getTitle();
        String expectedYoutubeTitle="youtube";

       if(actualtitleYoutube.equals(expectedYoutubeTitle)){
           System.out.println("youtube Title testi PASS");
       }else{
           System.out.println("Youtube title testi FAİLED \nactual sayfa basligi:"+actualtitleYoutube);
       }

       //3. Sayfa URL'sinin “youtube” içerip içermediğini (contains) doğrulayın, içermiyorsa doğru URL'yi yazdırın.
        String actualYoutubeUrl = driver.getCurrentUrl();
        String arananKelimeYoutubeUrl="youtube";
        if (actualYoutubeUrl.contains(arananKelimeYoutubeUrl)){
            System.out.println("Youtube URL testi PASS");
        }else {
            System.out.println("Youtube URL testi FAİLED \nActual Youtube URL"+actualYoutubeUrl);
        }

        //4. Daha sonra Amazon sayfasina gidin https://www.amazon.com/
        driver.navigate().to("https://www.amazon.com");
        //5. Youtube sayfasina geri donun
        driver.navigate().back();
        //6. Sayfayi yenileyin
        driver.navigate().refresh();
        //7. Amazon sayfasina donun
        driver.navigate().forward();
        //8. Sayfayi tamsayfa yapin
        driver.manage().window().fullscreen();
        //9. Ardından sayfa başlığının (Title) "Amazon" içerip içermediğini (contains) doğrulayın,
        // Yoksa doğru başlığı(Actual Title) yazdırın.
        String actualAmazonTitle = driver.getTitle();
        String amazonTitleArananKelime="Amazon";

        if (actualAmazonTitle.contains(amazonTitleArananKelime)){
            System.out.println("Amazon Title testi PASS");
        }else{
            System.out.println("Amazon Title testi FAİLED\nActual amazon Title :"+ actualAmazonTitle);
        }

        //10.Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın, degilse doğru URL'yi yazdırın

        String expectedAmazonUrl = "https://www.amazon.com";
        String actualAmazonUrl = driver.getCurrentUrl();
        if (expectedAmazonUrl.equals(actualAmazonUrl)){
            System.out.println("Amazon URL PASS");
        }else{
            System.out.println("Amazon URL FAİLED\n Actual Amazon URL:"+actualAmazonUrl);
        }


         //11.Sayfayi kapatin
        driver.close();
    }
}
