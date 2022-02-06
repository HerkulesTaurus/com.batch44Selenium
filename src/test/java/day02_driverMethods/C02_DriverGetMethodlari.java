package day02_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverGetMethodlari {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com");

        System.out.println(driver.getTitle());        // consola sayfanin Title ını getırır

        System.out.println(driver.getCurrentUrl());   // consola sayfanın url sını getırır

        System.out.println(driver.getWindowHandle()); // CDwindow-19338D02631E93D8419938F80AB5EC39 bu numara gelir
        // getWindowHandle chrome un her sayfa icin her giriste urettıgı numara

        System.out.println(driver.getPageSource());   // amazon un kaynak code larini getirir

    }
}
