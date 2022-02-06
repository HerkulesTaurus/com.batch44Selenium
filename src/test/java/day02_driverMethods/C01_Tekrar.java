package day02_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_Tekrar {
    // Normalde selenium un kednı ıdesı var fakat bız daha kullanıslı oldugu ıcın ıntelij kullanıyoruz
    // intelij de yenı bır proje actıgımızda oncelıkle selenium kutuphanelerını projeye eklemek gerekır
    // bır en ılkel haliyle projemize kutuphaneleri jar dosyaları olarak yukledık
    // bu ekledigimiz dosyalarla artik driver in ayarlarini yapabiliriz

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        // driver->chromedriver a sag tıkla path i kopyala yapıstır
        // setProperty method u 2 parametre ister
        // ilki kullanacagımız browser a ait driver
        // ikincisi parametre ise selenium idesinden indirip projemize ekledigimiz chromedriver in path i
        // windows kullanıcları sona exe. eklerken apple kullanan sona exe eklememeli

        WebDriver driver=new ChromeDriver();

        driver.get("https://www.amazon.com");

        Thread.sleep(5000);
        // java dan gelir, icine yazılan milisaniye kadar kodların calismasını durdurur.

        driver.close();
        // driver.close clasın sonuna yazılır, islemler bıttınkten sonra kapatmak ıcın
        // en sona yazılır cunku kod calısınca driver kapanır yeniden browser acmka istiyorsak driver a yenşi deger atamalıyız



    }
}
