package com.arcanepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;

public class Gun02_C2_VerifyTitleTest {

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

        //windowsu maximize et
        //driver.manage().window().maximize();

        //baslıkta google olup olmdıgını verify etme
        String beklenen= "Google";
        String actualTitle= driver.getTitle();

        if(beklenen.equals(actualTitle)){
            System.out.println("basarili");
        }else{
            System.out.println("basarisis");
            System.out.println("beklenen:"+ beklenen);
            System.out.println("gercek ise:"+ actualTitle);
        }
        driver.close();




    }
}
