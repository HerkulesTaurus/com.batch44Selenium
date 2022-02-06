package Exercise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class day1_Q02 {
    //.........Exercise2..............
    // 1-driver olusturalım
    // 2-java class ımıza chromedriver.exe tanıtalım
    // 3-driver ın tum ekranı kaplamasını saglayalım
    // 4-driver a sayfanın yuklenmesını 10.000 milisaniye (10 saniye) boyunca beklemesini
    // soyleyelim. eger oncesınde sayfa yuklenırse beklemeuyı bıraksın

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // 10 sanıye sayfa yuklenmesi icin zaman ayır dıyoruz

        // 5-"sahibinden.com" adresine gidelim
        driver.get("https://www.sahibinden.com");
        // 6-bu web adresinin sayfa baslıgını(title) ve adres(url)ini alalım
        String shbTitle=driver.getTitle();
        String shbUrl= driver.getCurrentUrl();

        System.out.println("sahibinden URL"+shbUrl);
        System.out.println("sahibinden Title"+shbUrl);

        // 7-title ve url in "Oto" kelimesini icerip icermedigini kontrol edelim
        if(shbTitle.contains("Oto")) {

            System.out.println("Title Oto yazisi vardir");
        }else {

            System.out.println("Title Oto yazisi yoktur");
        }

        if (shbUrl.contains("Oto")){

            System.out.println("URL Oto kelimesi var");

        }else{

            System.out.println("URL Oto kelimesi yok");
        }

        // 8-Ardından "gittigidiyor.com" adresine gidelim
        driver.get("https://www.gittigidiyor.com");

        // 9-Bu adresin baslıgını alalım ve "Sitesi" kelimesini icerip icermedigini kontrol edelim

        boolean isTrue=driver.getTitle().contains("Sitesi"); // if le degıl boolean la yaptık

       if (isTrue){

           System.out.println("Test PASS");

       }else{

           System.out.println("Test FAİLED");
       }

        // String gittiTitle=driver.getTitle(); =========>>>>>>> if olmadan ternary ile de yapılabılır dı
        // System.out.println("gittiTitle"+gittiTitle);
        // System.out.println(gittiTitle.contains("Sitesi") ? "PAss" : "FAİL");

        // 10-Bı oncekı web sayfasına gerı donelım
        driver.navigate().back();

        // 11-Sayfayı yenileyelim
        driver.navigate().refresh();

        // 12-Daha sonra web sayfamıza tekrar donelım ve oldugumuz sayfayi kapalım
        driver.navigate().forward();

        // 13-En son olarak butun sayfaları kapatalım
        driver.quit();








    }
}
