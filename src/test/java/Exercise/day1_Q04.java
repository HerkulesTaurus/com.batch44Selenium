package Exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class day1_Q04 {

    //......Exercise5.....

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // 1-Navigate to https://testpages.herokuapp.com/styled/index.html
        driver.navigate().to("https://testpages.herokuapp.com/styled/index.html");

        // 2-Click on Calculator under Micro Apps
        driver.findElement(By.id("calculatetest")).click();

        //   => Type and number in the first input
        driver.findElement(By.id("number1")).sendKeys("30");

        //   => Type and number in the second input
        driver.findElement(By.id("number2")).sendKeys("70");

        // 3-Click on Calculate
        driver.findElement(By.id("calculate")).click();

        // 4-Get the result
        driver.findElement(By.id("answer")).getText();

        // 5-Print the result

        System.out.println(driver.findElement(By.id("answer")).getText());

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.close();

      // BU sekılde de olabılır
      //  WebElement firstBox =driver.findElement(By.id("number1"));
      //  WebElement secondBox =driver.findElement(By.id("number2"));
      //  firstBox.sendKeys("25");
      //  secondBox.sendKeys("39");

    }

}

