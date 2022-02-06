package odev;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class mailQuestion {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //1.  https://app.hubspot.com/login sayfasina gidin
        driver.get("https://app.hubspot.com/login?__cf_chl_jschl_tk__=LXH6e1H0meldlKWVBZmb84qtZtG1DQ8vsFu1TMjGF6M-1642662191-0-gaNycGzNCKU");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //2.  Bir mail adresi giriniz
        WebElement mail =driver.findElement(By.xpath("//input[@id='username']"));
        mail.sendKeys("jhagjha@gmail.com");

        //3.  Bir password giriniz
        WebElement pswrd=driver.findElement(By.xpath("//input[@id='username']"));
        pswrd.sendKeys("Hkjsjka31212.");

        //4.  Login butonuna tiklayiniz
        WebElement loginButon=driver.findElement(By.id("loginBtn"));
        loginButon.click();

        //5.  "That email address doesn't exist." texti gorunur ise
        WebElement doenstExist=driver.findElement(By.xpath("//hs[@class='Heading-nhr39c-0 H5-xrl7qn-0 hdtmNA private-alert_title']"));

        //6.  "kayit yapilamadi" yazdiriniz
        //8.  eger yazi gorunur degilse "kayit yapildi" yazdiriniz
        if (doenstExist.isDisplayed()){
            System.out.println("kayit yapilamadi");
        }else{
            System.out.println("kayit yapildi");
        }

        //9.  Tum sayfalari kapatiniz
        driver.quit();
    }
}
