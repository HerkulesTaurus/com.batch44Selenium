package odev;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class dequeue6 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("http://a.testaddressbook.com/sign_in");

        WebElement emailTextBox=driver.findElement(By.cssSelector("input[id='session_email']"));

        WebElement passwordTextBox=driver.findElement(By.cssSelector("input[id='session_password']"));

        WebElement signInButonu=driver.findElement(By.cssSelector("input[name='commit']"));

        emailTextBox.sendKeys("testtechproed@gmail.com");
        passwordTextBox.sendKeys("Test1234!");
        signInButonu.click();

    }
}

