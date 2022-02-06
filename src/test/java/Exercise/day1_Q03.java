package Exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class day1_Q03 {


    // ......Exercise3.....

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        // 1- go to url: https://www.techlistic.com/p/selenium-practice-form.html
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
        driver.findElement(By.id("cookieChoiceDismiss")).click();

        driver.navigate().to("https://www.techlistic.com/p/selenium-practice-form.html");
        // driver.manage().deleteAllCookies();                           //  ==>cookies icin
        // driver.findElement(By.xpath("//a[@id='cookieChoiceDismiss']")); ==>cokies icin
        // 2- fill the firstname
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("domates");
        // 3- fill the lastname
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("salatalik");
        // 4- check the gender
        driver.findElement(By.id("sex-0")).click(); //radioButton larda locate İd ile daha mantıklı
        // 5- check the experience
        driver.findElement(By.id("exp-6")).click();
        // 6- fill the date
        driver.findElement(By.id("datepicker")).sendKeys("10/04/2019");
        // 7- choose your profession -> Automation Tester
        WebElement prf = driver.findElement(By.id("profession-1"));
        prf.click();
        prf.sendKeys(Keys.PAGE_DOWN);
        // 8- choose your tool  -> Selenium Webdriver
        driver.findElement(By.xpath("//input[@id='tool-2']")).click();
        // 9- choose your continent -> Antartica
        driver.findElement(By.xpath("//select[@id='continents']")).sendKeys("Antartica");
        //10- choose your commond   -> Browser Commands
        //driver.findElement(By.xpath("//option[normalize-space()='Browser Commands']")).click();
        driver.findElement(By.xpath("//option[text()='Browser Commands']")).click();

        //11- click submit button
        driver.findElement(By.xpath("//*[@id='submit']")).click();

    }
}
