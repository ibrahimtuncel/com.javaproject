package com.arcanepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gun02_C3_VerifyURLTest {

    /*google ana sayfasında url i dogrulama yap-verify
    www.google.com
     */
    public static void main(String[] args ) {

        //driverin type ve path icin system.setProperty() olustur.
        System.setProperty("webdriver.chrome.driver","C:/Users/lenovo/Documents/" +
                "Selenium dependencies/drivers/chromedriver.exe");

        //Webdriver object olustur. Automation icin şarttır.
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();

        String beklenen= "https://www.google.com/";
        String actualurl= driver.getCurrentUrl();

        if(beklenen.equals(actualurl)){
            System.out.println("basarili");
        }else{
            System.out.println("basarisis");
            System.out.println("beklenen:"+ beklenen);
            System.out.println("gercek ise:"+ actualurl);
        }
        driver.close();



    }
}
