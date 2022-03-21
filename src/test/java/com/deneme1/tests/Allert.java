package com.deneme1.tests;

import com.deneme1.utilities.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Collections;
import java.util.List;

public class Allert {

    //Bir class olusturun: Alerts
//https://the-internet.herokuapp.com/javascript_alerts adresine gidin.
//1. butona tıklayın, uyarıdaki OK butonuna tıklayın ve result mesajının görüntülendiğini doğrulayın.
//2. butona tıklayın, uyarıdaki Cancel butonuna tıklayın ve result mesajının görüntülendiğini doğrulayın.
//3. butona tıklayın, uyarıdaki metin kutusuna isminizi yazin,
// OK butonuna tıklayın ve result mesajının görüntülendiğini doğrulayın.
    //Merhabalar arkadaslar bugun ilk githup dersimiz umaraim mutlu olursunuz
    //dersde herekese basarilar
    //.................

    WebDriver driver;
    @BeforeClass
    public void setUp(){

     WebDriverManager.chromedriver().setup();
     driver=new ChromeDriver();
     driver.get("https://the-internet.herokuapp.com/javascript_alerts");
     driver.manage().window().maximize();

     }

     @Test
    public void alertGirisSayfasi() throws InterruptedException {

        //Burada ellert buttonu kullanilmistir
         WebElement allertButton=driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
         allertButton.click();
         String  mesaj=driver.switchTo().alert().getText();
         System.out.println(mesaj);
         driver.switchTo().alert().accept();

         WebElement resultMesaji=driver.findElement(By.id("result"));
         Assert.assertTrue(resultMesaji.isDisplayed());
         Thread.sleep(3000);
        System.out.println(mesaj);

         WebElement dismisButton=driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
         dismisButton.click();
         driver.switchTo().alert().dismiss();
         WebElement result2=driver.findElement(By.xpath("//p[.='You clicked: Cancel']"));
         String actualResulMesaj=result2.getText();
         String expectedResultMesaj="You clicked: Cancel";

         Assert.assertEquals(actualResulMesaj,expectedResultMesaj);


     }

     @Test
    public void dwSagManSo(){

        driver.get("https://www.dw.com/de/jemandem-rutscht-das-herz-in-die-hose/l-19068103");
        driver.manage().window().maximize();

        WebElement cookies=driver.findElement(By.xpath("//p[@class='cookie__text']"));

        WebElement cookiesOkay=driver.findElement(By.xpath("//a[@class='cookie__btn cookie__btn--ok']"));
        cookiesOkay.click();

        List<WebElement> sagtManSo= driver.findElements(By.xpath("(//ul[@class='smallList'])[2]"));



         for (WebElement basliklar:sagtManSo){
             System.out.println(basliklar.getText());
             System.out.println(mesaj);
         }


     }

}
