package odev;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class dequeue4 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.findElement(By.xpath("//*[@id='content']/div/button")).click();

        WebElement deleteButonu=driver.findElement(By.xpath("//*[@id='elements']/button"));

    if (deleteButonu.isDisplayed()){
        System.out.println("pass");
    }else{
        System.out.println("failed");
    }

    deleteButonu.click();

    WebElement addYazisiElementi2=driver.findElement(By.xpath("//*[@id='content']/h3"));

    WebElement addYazisiElementi3=driver.findElement(By.xpath("//h3"));

    if (addYazisiElementi3.isDisplayed()){
        System.out.println("pass");
    }else{
        System.out.println("failed");
    }

        if (addYazisiElementi2.isDisplayed()){
            System.out.println("pass");
        }else{
            System.out.println("failed");
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        //driver.findElement(By.xpath())












    driver.close();
    driver.quit();















    }
}
