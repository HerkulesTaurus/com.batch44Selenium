package Exercise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class day1_Q01 {

    //....Exercise1.....
    // Create a new class under Q1 create main method

    public static void main(String[] args) {

        // Set Path
        // Create Chromedriver
        // Maximize the window
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        // Open google home page https://www.google.com/.
        driver.get("https://www.google.com/");
        // On the same class, Navigate to amazon home page "https://www.amazon.com/" Navigate back to "google"
        driver.navigate().to("https://www.amazon.com/");
        driver.navigate().back();
        // Navigate forward to amazon
        driver.navigate().forward();
        // Refresh the page
        driver.navigate().refresh();
        // Close/Quit the borwser
        driver.close();  // bulundugu sayfayı kapatır
        driver.quit();   // butun sayfaları kapatır
        // And  last step :print "all ok" on console
        System.out.println("all ok");
    }
}
