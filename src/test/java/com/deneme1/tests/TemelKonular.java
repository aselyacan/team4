package com.deneme1.tests;

import com.deneme1.pages.Deneme1Page;
import com.deneme1.utilities.ConfigReader;
import com.deneme1.utilities.Driver;
import com.github.javafaker.Faker;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class TemelKonular {

    Deneme1Page deneme1Page=new Deneme1Page();

    @BeforeClass
    public void  setUp(){
        Driver.getDriver().get(ConfigReader.getProperty("google_url"));

    }

    @Test
    public void navigatorMethod(){

        Driver.getDriver().navigate().to("https://www.amazon.de/");
        Driver.getDriver().navigate().refresh();
        Driver.getDriver().navigate().back();
        Driver.getDriver().navigate().forward();

        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Driver.getDriver().manage().window().maximize();
       // Driver.getDriver().manage().window().fullscreen();


       // Assert.assertEquals(Driver.getDriver().getTitle(),
        //        "Amazon.de: Günstige Preise für Elektronik & Foto, Filme, Musik, Bücher, Games, Spielzeug & mehr");

        //Assert.assertEquals( Driver.getDriver().getCurrentUrl(),"https://www.amazon.de/");


    }

    @Test(dependsOnMethods ="navigatorMethod" )
    public void locatorsMethod() throws InterruptedException {
        deneme1Page.amazonDropDownBox.click();
        Select select=new Select(deneme1Page.amazonDropDownBox);
        select.selectByIndex(8);
        deneme1Page.amazonSearchBox.sendKeys("Barbie"+Keys.ENTER);
        Thread.sleep(2000);
        deneme1Page.amazonPrimeCheckBOX.click();
        deneme1Page.amazonRadioButton.click();
        deneme1Page.choiceButton.click();
        deneme1Page.saveButton.click();


    }

    @Ignore
    @Test
    public void mavenMethods(){

        Driver.getDriver().get(ConfigReader.getProperty("google_url"));
        Faker faker=new Faker();// maven den import ettik
        deneme1Page.googleSearchBox.sendKeys(faker.country().capital()+Keys.ENTER);
        //faker.country().capital();
        Driver.getDriver().navigate().back();
        deneme1Page.googleSearchBox.sendKeys(faker.name().name()+Keys.ENTER);
        Driver.getDriver().navigate().back();
        deneme1Page.googleSearchBox.sendKeys(faker.name().bloodGroup()+" ne anlama gelir "+Keys.ENTER);

    }
    @AfterClass
    public void tearDown(){
        Driver.getDriver().close();
    }


}
