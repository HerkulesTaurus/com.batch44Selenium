package odev;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.Scanner;

public class trendyolKullanıcıBilgileri {

    public static void main(String[] args) throws InterruptedException {

    Scanner scan = new Scanner(System.in);
        System.out.println("Kaç kullanıcı oluşturulsun?");
    int thread = scan.nextInt();

        for (int i = 0; i < thread; i++) {
        //--------------------------------------------//
        String email ="";
        String sifre ="Ahmet123!";
        //--------------------------------------------//

        //Create a instance of ChromeOptions class
        ChromeOptions options = new ChromeOptions();

        //Add chrome switch to disable notification - "**--disable-notifications**"
        options.addArguments("--disable-notifications");

       // WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(21));

        //ChromeOptions a = new ChromeOptions();

        // Kullanıcı Trendyola giriş yapsın.
        driver.get("https://www.trendyol.com/");

        //sayfa handle değerini alalım
        String sayfa1HandeDegeri = driver.getWindowHandle();

        //Cinsiyet seçimi popop bolumü geçildi
        driver.findElement(By.xpath("//*[@id=\"gender-popup-modal\"]/div/div/div[1]")).click();

        //Giriş yap butonunu üstne geldik -hover-
        WebElement girisYapButton = driver.findElement(By.xpath("//*[@id=\"account-navigation-container\"]/div/div[1]/div[1]/p"));

        //Instantiating Actions class
        Actions actions = new Actions(driver);

        //Hovering on main menu
        actions.moveToElement(girisYapButton).build().perform();

        //Üye ol butonu tıklandı, sayfa açıldı
        driver.findElement(By.xpath("//div[@class=\"signup-button\"]")).click();

        //mail onay sitesine gidildi
        driver.switchTo().newWindow(WindowType.TAB).get("https://www.temporary-mail.net/");
        String IkıncısayfaHandleDegeri =  driver.getWindowHandle();
        email = driver.findElement(By.xpath("//*[@id=\"active-mail\"]")).getAttribute("data-clipboard-text");

        //trendyol sitesine geri dönüş yapıldı
        driver.switchTo().window(sayfa1HandeDegeri);

        //email adresi girildi
        driver.findElement(By.xpath("//input[@id=\"register-email\"]")).sendKeys(email);
        //password girildi
        driver.findElement(By.xpath("//*[@name=\"register-password\"]")).sendKeys("Ahmet123!");
        //cinsiyet seçildi
        driver.findElement(By.xpath("//*[@id=\"login-register\"]/div[3]/div[1]/form/div[3]/div/button[2]")).click();


        //sözleşme onay kutuları işaretlendi.
        driver.findElement(By.xpath("//div[@class='marketing-checkbox']//div[@class='ty-mgr-2 ty-relative ty-checkbox-container']//*[name()='svg']")).click();
        driver.findElement(By.xpath("//div[@class='ty-display-flex ty-checkbox-wrapper']//div[@class='ty-mgr-2 ty-relative ty-checkbox-container']//*[name()='svg']")).click();


        System.out.println("Elementler başarıyla işaretlendi.");

        // üye ol tuşuna tıklandı
        // mail onay sayfası geldi.
        driver.findElement(By.xpath("//*[@id=\"login-register\"]/div[3]/div[1]/form/button")).click();


        // 2.sayfa sekmesine gidildi.
        driver.switchTo().window(IkıncısayfaHandleDegeri);
        Thread.sleep(13000);
        // mailin gelmesi beklendi
        String gelenMail = driver.findElement(By.xpath("//*[@id=\"message-list\"]/tr[1]/td[2]/a")).getText();
        String dogrulamaKodu = gelenMail.substring(gelenMail.length()-6,gelenMail.length());
        //mail alındı Strin manipulation ile son 6 karakter dogrulama kodu dogrulama kodunu aldım
        System.out.println(dogrulamaKodu);

        //trendyol sayfasına geri dönüldü
        driver.switchTo().window(sayfa1HandeDegeri);
        Thread.sleep(3000);

        //trendyol onayı yapıyoruz
        driver.findElement(By.xpath("//*[@id=\"login-register\"]/div[3]/div[1]/div/div/div/div[2]/form/div[2]/input")).click();
        driver.findElement(By.xpath("//*[@id=\"login-register\"]/div[3]/div[1]/div/div/div/div[2]/form/div[2]/input")).clear();
        driver.findElement(By.xpath("//*[@id=\"login-register\"]/div[3]/div[1]/div/div/div/div[2]/form/div[2]/input")).click();
        driver.findElement(By.xpath("//*[@id=\"login-register\"]/div[3]/div[1]/div/div/div/div[2]/form/div[2]/input")).sendKeys(dogrulamaKodu);
        //onayla butonu tıklandı
        driver.findElement(By.xpath("//*[@id=\"login-register\"]/div[3]/div[1]/div/div/div/div[2]/form/div[3]/button[1]")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//*[@id=\"account-navigation-container\"]/div/div[1]/div[1]/div")).click();

        if(driver.getCurrentUrl().equals("https://www.trendyol.com/hesabim/siparislerim")){
            System.out.println(gelenMail);
            System.out.println("*******************************");
            System.out.println((i+1)+ ". kullanıcı oluşturuldu.");
            System.out.println(email+" "+sifre);
            System.out.println("*******************************");
        }else {
            System.out.println("Hata ---> Hesap Oluşturulamadı");
        }
        scan.close();
        driver.quit();
    }
}
}
