package com.arcanepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gun02_C4_GetPageSource {

    public static void main(String[] args ) {

        //driverin type ve path icin system.setProperty() olustur.
        System.setProperty("webdriver.chrome.driver","C:/Users/lenovo/Documents/" +
                "Selenium dependencies/drivers/chromedriver.exe");

        //Webdriver object olustur. Automation icin şarttır.
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");

        //driver.get("https://www.amazon.com/");
        driver.navigate().to("https://www.amazon.com/");



        String pageSource= driver.getPageSource();
        //getPageSource sayfanın kaynagını HTML sayfasını string olarak döndürür
        //tum sayfanın icinde istenilen teks-metin varlıgı verify edilebilir.
        //getPageSource icin assertion pek sık kullanılmas cunku buyuk ve genel
        // bir bilgi döndürür.karışık bu durum yanlıs sonuc verebilir.

        //System.out.println(pageSource);

        System.out.println(pageSource.contains("Electronics"));

        if(pageSource.contains("Electronics")){
            System.out.println("Basarili");
        }else{
            System.out.println("Basarisis");
        }
        driver.close();



    }
}
