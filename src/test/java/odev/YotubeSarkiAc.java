package odev;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class YotubeSarkiAc {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.navigate().to("https://www.youtube.com/");
        // sayfanin Title "youtube" mu kontrol edin
        String actualTitle = driver.getTitle();
        String arananTitle = "youtube";
        if (arananTitle.equals(arananTitle)) {
            System.out.println("Title Testi PASS");
        } else {
            System.out.println("Title Testi FAILED");
        }
        //sayfanin url si dogrumu kontrol edin https://www.youtube.com/
        String actualYoutubeURL = driver.getCurrentUrl();
        String arananYoutubeUrl = "https://www.youtube.com/";

        if (actualYoutubeURL.equals(arananYoutubeUrl)) {
            System.out.println("Youtube URL Testi PASS");
        } else {
            System.out.println("Youtube URL Testi FAILED");
        }

        WebElement yotubeArama = driver.findElement(By.name("search_query"));
        yotubeArama.sendKeys("ekin uzunlar optum nefesinden");
        yotubeArama.submit();
        WebElement sarkiyiAc = driver.findElement(By.xpath("/html/body/ytd-app/div/ytd-page-manager/ytd-search/div[1]/ytd-two-column-search-results-renderer/div/ytd-section-list-renderer/div[2]/ytd-item-section-renderer/div[3]/ytd-video-renderer[1]/div[1]/div/div[1]/div/h3/a/yt-formatted-string"));
        sarkiyiAc.click();


    }
}