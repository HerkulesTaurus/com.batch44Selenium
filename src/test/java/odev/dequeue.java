package odev;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class dequeue {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.navigate().to("https://www.youtube.com");


        System.out.println(driver.getTitle());


        driver.navigate().to("https://www.amazon.com");
        driver.navigate().back();
        driver.navigate().refresh();
        driver.navigate().forward();
        driver.manage().window().fullscreen();

        driver.navigate().to("http://a.testaddressbook.com");

        WebElement signInLinki=driver.findElement(By.id("sign-in"));
        signInLinki.click();

        WebElement emailTextBox=driver.findElement(By.id("session_email"));
        WebElement passwordTextBox=driver.findElement(By.id("session_password"));
        WebElement signInButton=driver.findElement(By.name("commit"));

        emailTextBox.sendKeys("testtechproed@gmail.com");
        passwordTextBox.sendKeys("Test1234!");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        signInButton.click();

        WebElement girisYazisiElementi=driver.findElement(By.tagName("h1"));
        System.out.println(girisYazisiElementi.getText());
        String actualGirisYazisi = girisYazisiElementi.getText();
        String expectedGirisYazisi="Wellcome to adress book";

        if (actualGirisYazisi.equals(expectedGirisYazisi)){
            System.out.println("Pass");
        }else{
            System.out.println("failed");
        }

        WebElement addressWebElementi=driver.findElement(By.linkText("Addresses"));
        WebElement signOutElementi=driver.findElement(By.linkText("Sign out"));

        System.out.println(addressWebElementi.isDisplayed());

        if (addressWebElementi.isDisplayed()){
            System.out.println("pass");
        }else{
            System.out.println("faıled");
        }

        if (signOutElementi.isDisplayed()){
            System.out.println("pass");
        }else{
            System.out.println("faıled");

            List<WebElement> linklerListesi = driver.findElements(By.tagName("a"));
            System.out.println("sayfada"+linklerListesi.size()+"adet link var ");
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        driver.get("http://a.testaddressbook.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        WebElement signInLinki2 = driver.findElement(By.id("sign-in"));

        System.out.println("size:"+signInLinki2.getSize());
        System.out.println("aria role :"+signInLinki2.getAriaRole());
        System.out.println("accessible name :"+signInLinki2.getAccessibleName());
        System.out.println("id attribute value'su :"+signInLinki2.getAttribute("id"));
        System.out.println("location :"+signInLinki2.getLocation());
        System.out.println("genislik:"+signInLinki2.getRect().width);
        System.out.println("color:"+signInLinki2.getCssValue("color"));






        driver.close();
        driver.quit();
    }
}
