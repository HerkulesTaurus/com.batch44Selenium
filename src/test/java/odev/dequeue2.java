package odev;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class dequeue2 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.navigate().to("https://youtube.com");
        String actualTitleYoutube = driver.getTitle();
        String expectedYoutubeTitle ="youtube";

        if (actualTitleYoutube.equals(expectedYoutubeTitle)){
            System.out.println("pass");
        }else{
            System.out.println("failed");
        }

        String actualYoutubeUrl=driver.getCurrentUrl();
        String arananKelimeYoutubeUrl="youtube";
        if (actualYoutubeUrl.contains(arananKelimeYoutubeUrl)) {
            System.out.println("pass");
        }else{
            System.out.println("failed"+actualYoutubeUrl);
        }

        driver.navigate().to("https://www.amazon.com/");
        driver.navigate().back();
        driver.navigate().refresh();
        driver.navigate().forward();;
        driver.manage().window().fullscreen();

        String actualAmazonTitle = driver.getTitle();
        String amazonTitlearananKelime="Amazon";

        if (actualAmazonTitle.contains(amazonTitlearananKelime)){
            System.out.println("pass");
        }else{
            System.out.println("failed");
        }

        String expectedAmazonUrl = "https://www.amazon.com/";
        String actualAmazonUrl = driver.getCurrentUrl();
        if (expectedAmazonUrl.equals(actualAmazonUrl)){
            System.out.println("pass");
        }else{
            System.out.println("failed");
        }

        driver.close();
        driver.quit();










    }
}
