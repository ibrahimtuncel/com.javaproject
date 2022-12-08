package com.arcanepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gun01_C1_FirstSeleniumClass {
    public static void main(String[] args ) {

        //driverin type ve path icin system.setProperty() olustur.
        System.setProperty("webdriver.chrome.driver","C:/Users/lenovo/Documents/" +
                "Selenium dependencies/drivers/chromedriver.exe");

        //diğer sayfaya gecisi engelliyor boyle, ilkinde geciyor.
        /*System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Documents\\" +
                "Selenium dependencies\\drivers\\chromedriver.exe");*/

        //Webdriver object olustur. Automation icin şarttır.
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");


    }
}
