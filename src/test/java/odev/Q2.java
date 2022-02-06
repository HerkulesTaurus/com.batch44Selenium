package odev;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q2 {
    public static void main(String[] args) throws InterruptedException {


        // 1-driver olusturalim
        // 2-java class'imiza chromedriver.exe'yi tanitalim
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        // 3-driver'in tum ekrani kaplamasini saglayalim
        driver.manage().window().maximize();

        // 4-https://github.com/ adresine gidelim
         driver.navigate().to("https://github.com/");

        // 5-Ardindan https://www.hepsiburada.com/ adresine gidelim
        driver.navigate().to("https://www.hepsiburada.com/");

        // 6-Title ve url console da yazdirin ve yine title ve url in "burada" kelimesini icerip icermedigini kontrol edelim
        //TİTLE
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

        String actualTitle=driver.getTitle();
        String titleContain="burada";

        if (actualTitle.contains(titleContain)){
            System.out.println("Title contain 'burada'--> PASS");
        }else{
            System.out.println("Title doesnt contain 'burada'--> FAİLED");
        }

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //URL
        String actualUrl = "https://www.hepsiburada.com/";
        String urlContain="burada";

        if (actualUrl.contains(urlContain)){
            System.out.println("URL contain 'burada' --> PASS ");
        }else{
            System.out.println("URL doesnt contain 'burada'--> FAİLED");
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // 7-Sonrasinda https://github.com/ adresine geri donelim ve  sayfayi yenileyelim

        driver.navigate().to("https://github.com/");
        // driver.navigate().back(); -->back() burada calismadi

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.navigate().refresh();

        // 8-Son adim olarak butun sayfalarimizi kapatmis olalim

        driver.quit();



    }
}
