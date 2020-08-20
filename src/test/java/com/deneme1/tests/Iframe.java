package com.deneme1.tests;

import com.deneme1.utilities.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Iframe {

    //Bir class olusturun: IframeTest
//https://the-internet.herokuapp.com/iframe adresine gidin.
//Bir metod olusturun: iframeTest
//“An IFrame containing….” textini konsolda yazdirin.
//Text Box’a “Merhaba Dunya!” yazin.
//TextBox’in altinda bulunan “Elemental Selenium” linkini textini konsolda yazdirin.


   // WebDriver driver;
    @BeforeClass
    public void setUp(){

        //WebDriverManager.chromedriver().setup();
        //driver=new ChromeDriver();
       // Driver.getDriver().get("https://the-internet.herokuapp.com/iframe");
        Driver.getDriver().get("https://the-internet.herokuapp.com/iframe");
        //driver.manage().window().maximize();

    }

    @Test
    public void iframeTest() throws InterruptedException {
        WebElement iframeText=Driver.getDriver().findElement(By.xpath("//h3"));
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        System.out.println(iframeText.getText());
        //Thread.sleep(3000);
        //Driver.getDriver().switchTo().frame(0);
        WebElement iframe=Driver.getDriver().findElement(By.id("mce_0_ifr"));
        Driver.getDriver().switchTo().frame(iframe);
        WebElement textBox=Driver.getDriver().findElement(By.xpath("//p"));
        textBox.clear();
        textBox.sendKeys("Merhaba Dunya ");

        Driver.getDriver().switchTo().parentFrame();// bir onceki  iframe geri gelmek icin driver upate edildi

        WebElement seleniumText=Driver.getDriver().findElement(By.xpath("//a[@target='_blank']"));
        //System.out.println(seleniumText.getText());
        Assert.assertTrue(seleniumText.isDisplayed());


    }
}
