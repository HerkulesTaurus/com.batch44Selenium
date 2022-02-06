package odev;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q1 {

        public static void main(String[] args) throws InterruptedException{

            //Question1
            System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
            WebDriver driver = new ChromeDriver();

            //1.https://www.youtube.com sayfasına gidin
            driver.get("https://www.youtube.com");
            Thread.sleep(3000);

            //2.Title i consolda yazdirin
            System.out.println(driver.getTitle());

            //3.Title “YouTube” a eşitse “correct title” yazdirin değilse “incorrect title yazdirin”
            String actualTitle = driver.getTitle();
            String esitMİ="YouTube";

            if (actualTitle.contains(esitMİ)){
                System.out.println("Correct Title");
            }else{
                System.out.println("Incorrect Title");
                System.out.println("Correct Title :"+actualTitle);
            }

            //4.Sayfayi kapatin
            driver.close();

            //5.Tum sayfalari kapatin
            driver.quit();

            //6.Consola “Test completed” yazdirin
            System.out.println("Test Completed");

        }

    }


