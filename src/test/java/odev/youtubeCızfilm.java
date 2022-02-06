package odev;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;


public class youtubeCızfilm {

    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //youtube a git
        driver.navigate().to("https://www.youtube.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // searcbaox a mr bean yaz
        WebElement searchBox=driver.findElement(By.name("search_query"));
       // searchBox.click();
        searchBox.sendKeys("Mr bean 1. bolum");


        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // searchBox.findElement(By.xpath("//*[@id='video-title']/yt-formatted-string")).click();





    }
}
