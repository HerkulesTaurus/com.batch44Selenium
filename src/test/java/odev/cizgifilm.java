package odev;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class cizgifilm {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.youtube.com");

        WebElement searcBox = driver.findElement(By.name("search_query"));
        searcBox.sendKeys("Mr bean 1. bolum");
        searcBox.submit();
        WebElement cizgiFilmAC = driver.findElement(By.xpath("//*[@id='video-title']/yt-formatted-string"));
        cizgiFilmAC.click();


    }
}
