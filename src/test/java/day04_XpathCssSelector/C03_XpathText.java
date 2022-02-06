package day04_XpathCssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class C03_XpathText {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //Asagidaki testi text’leri kullanarak locate edin
        //1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        //2- Add Element butonuna basin
        driver.findElement(By.xpath("//button[text()='Add Element']")).click();

        //3- Delete butonu’nun gorunur oldugunu test edin
        WebElement deleteButonu = driver.findElement(By.xpath("//button[text()='Delete']"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        if (deleteButonu.isDisplayed()) {
            System.out.println("delete butonu gorunuyor testi PASS");
        } else {
            System.out.println("delete butonu gorunmuyor testi FAİLED");
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //4- Delete tusuna basin
        deleteButonu.click();

        //5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin
        //WebElement addYazisiElementi=driver.findElement(By.xpath("//h3"));  // xpath de // koyup yazıoz
        WebElement addYazisiElementi = driver.findElement(By.xpath("//h3[text()='Add/Remove Elements']")); // tagname de sadece h3 yazmak yeterlı

        if (addYazisiElementi.isDisplayed()) {
            System.out.println("add yazisi gorunuyor testi PASS");
        } else {
            System.out.println("add yazisi gorunuyor testi FAİLED");

        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.close();
    }
}
