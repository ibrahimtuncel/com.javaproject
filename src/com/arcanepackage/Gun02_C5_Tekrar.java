package com.arcanepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gun02_C5_Tekrar {
    /*
Create a new class : Review1
ChromeDriver kullanarak, youtube git ve page basliginin  “youtube” oldugunu verify et, eger degilse dogrusunu yazdir.
the page URL'in youtube  icerip icermedigini verify et, ve dogru url'i yazdir.
Sonra https://www.amazon.com/ git
youtube geri navigate et
page'i Refresh et
amazon'a tekrar navigate et
Maximize the window
page basliginin “Amazon” icerdigini dogrula, eger degilse dogru basligi yazdir
page URL'in  https://www.amazon.com/ oldugunu dogrula, degilse dogru url'i yazdir
Quit the browser
 */
    public static void main(String[] args ) {

        //driverin type ve path icin system.setProperty() olustur.
        System.setProperty("webdriver.chrome.driver", "C:/Users/lenovo/Documents/" +
                "Selenium dependencies/drivers/chromedriver.exe");

        //Webdriver object olustur. Automation icin şarttır.
        WebDriver driver = new ChromeDriver();
        //youtube sayfasına git
        driver.get("https://www.youtube.com/");

        //baslıkta youtube olup olmdıgını verify etme
        String beklenen= "youtube";
        String actualTitle= driver.getTitle();

        if(beklenen.equals(actualTitle)){
            System.out.println("basarili");
        }else{
            System.out.println("basarisis");
            System.out.println("beklenen:"+ beklenen);
            System.out.println("gercek ise:"+ actualTitle);
        }
        //page URL'in youtube  icerip icermedigini verify et, ve dogru url'i yazdir.
        String pageSource= driver.getPageSource();
        System.out.println(pageSource.contains("Home"));

        if(pageSource.contains("Home")){
            System.out.println("Basarili");
        }else{
            System.out.println("Basarisis");
        }
        //amasona git
        driver.get("https://www.amazon.com/");
        //youtube geri gel-navigate et
        driver.navigate().back();
        //refresh et
        driver.navigate().refresh();
        //tekrar amasona git
        driver.navigate().forward();
        //sayfayı maksimise et
        driver.manage().window().maximize();

        //page basliginin “Amazon” icerdigini dogrula, eger degilse dogru basligi yazdir
        String beklenen2= "Amazon";
        String actualTitle2= driver.getTitle();

        if(beklenen2.contains(actualTitle2)){
            System.out.println("basarili");
        }else{
            System.out.println("basarisis");
            System.out.println("beklenen:"+ beklenen2);
            System.out.println("gercek ise:"+ actualTitle2);
        }

        //page URL'in  https://www.amazon.com/ oldugunu dogrula,
        // degilse dogru url'i yazdir
        String beklenen3= "https://www.amazon.com/";
        String actualurl= driver.getCurrentUrl();

        if(beklenen3.contains(actualurl)){
            System.out.println("basarili");
        }else{
            System.out.println("basarisis");
            System.out.println("beklenen:"+ beklenen3);
            System.out.println("gercek ise:"+ actualurl);
        }
        driver.close();
  }

}
