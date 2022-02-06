package odev;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class dequeue5 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        driver.findElement(By.xpath("//*[@id='content']/div/button")).click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        WebElement deleteButonu = driver.findElement(By.xpath("//*[@id='elements']/button"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        if (deleteButonu.isDisplayed()){
            System.out.println("pass");
        }else{
            System.out.println("failed");
        }

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        WebElement addRomoveElementi =driver.findElement(By.xpath("//*[@id='content']/div/button"));

    if (addRomoveElementi.isDisplayed()){
        System.out.println("pass");
    }else{
        System.out.println("failed");
    }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


driver.close();

    }
}
