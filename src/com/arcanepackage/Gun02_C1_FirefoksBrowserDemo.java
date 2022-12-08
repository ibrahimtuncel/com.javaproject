package com.arcanepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gun02_C1_FirefoksBrowserDemo {

    /*
    https://www.mozilla.org/en-US/firefox/new/
    https://github.com/mozilla/geckodriver/releases
    Yeni sinif olustur : FirefoxBrowserDemo
    Main method olustur
    Set Path
    Gecko driver olustur
    Ac : google home page https://www.google.com/
    Maximize the window
    Close/Quit the browser
     */

    public static void main(String[] args ) {


            //Path'i set et
        System.setProperty("webdriver.gecko.driver","C:/Users/lenovo/Documents/" +
                "Selenium dependencies/drivers/geckodriver.exe");

            // obje olustur
            WebDriver driver = new FirefoxDriver();

            //             Maximize the window
            driver.manage().window().maximize();

//             Ac : google home page https://www.google.com/
            driver.get("https://www.google.com/");

//             Close/Quit the browser
            driver.close();
               /*
                get() and navigate().to()
             1) get() daha yaygin kullanilir
             2) get() daha hizli calisir
             3) get () YALNIZCA parametre olarak String alir. fakat navigate().to() hem String hem de
             URL'i parametre olarak alabilir
             4) navigate()  daha fazla method ortaya cikar (forward, to, back, refresh())


             close() ile quit () arasindaki fark
1) close() yanlizca calistigimiz browseri kapatir
2) quit () calisilan tum browserlari kapatir. Quit saglam kapatir

--------------------------------------
Java'ya bekleme (Wait) ekleme
1- Thread.sleep(5000)-> bir sonraki adima gecmeden 5 saniye bekle
2- Bu bekleme JAVA'nin kendisine aitir. Seleniuma ait degildir
   bu neden Thread.sleep() kullanimi tavsiye edilmez ( Hard wait denir)
   Note: daha biz "selenium wait" bu dinamik bir beklemedir
   Bu selenium bekle daha hizlidir  extra bir zaman beklemez
              */


        }

    }


