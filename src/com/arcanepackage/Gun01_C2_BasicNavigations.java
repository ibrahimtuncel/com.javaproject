package com.arcanepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Gun01_C2_BasicNavigations {

/*
    Main method olustur
    Path'i set et
    Chrome driver olustur
    Window'u Maximize et
    Google anasayfasina git https://www.google.com/.
    Ayni class'in icinde, amazon anasayfasini (home page) Navigate et https://www.amazon.com/
    Google'e tekrar/geri Navigate et
    Amazon'a tekrar/geri Navigate et
    Sayfayi Refresh (yenile) et
    Browser'dan Close/Quit yap
 */

    public static void main(String[] args ) throws InterruptedException {

        //driverin type ve path icin system.setProperty() olustur.
        System.setProperty("webdriver.chrome.driver","C:/Users/lenovo/Documents/" +
                "Selenium dependencies/drivers/chromedriver.exe");

        /*System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Documents\\" +
                "Selenium dependencies\\drivers\\chromedriver.exe");*/

        //Webdriver object olustur.
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");

        //windowsu maximize et
        driver.manage().window().maximize();

        /*

        //driver.get("https://www.amazon.com/");
        driver.navigate().to("https://www.amazon.com/");

        //google a tekrar
        driver.navigate().back();
        Thread.sleep(5000);

        //amazon a tekrar
        driver.navigate().forward();

        //yenile
        driver.navigate().refresh();

        //close/quit yap
        driver.quit();
        driver.close();
        */

        //driver.findElement(By.name("q")).sendKeys("haber");
        //driver.get("https://www.youtube.com/");
        driver.findElement(By.name("q")).sendKeys("haber");
        Thread.sleep(1000);
        driver.findElement(By.className("gNO89b")).click();
        //driver.findElement(By.id("gsr")).click();

    }
}