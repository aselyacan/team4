package com.deneme1.tests;

import com.deneme1.pages.DenemeDropDownPage;
import com.deneme1.utilities.Driver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DenemeDropDownTest {

    DenemeDropDownPage dropDownPage;


    @BeforeClass
    public void setUp(){
        Driver.getDriver().get("http://techcanvass.com/examples/register.html");
        dropDownPage=new DenemeDropDownPage();


    }

    @Test
    public void dropDownTest() throws InterruptedException {

        dropDownPage.firstName.sendKeys("can");
        dropDownPage.lastName.sendKeys("kanan");
        dropDownPage.genderButton.click();
        Select select=new Select(dropDownPage.select);
        select.selectByIndex(2);
        dropDownPage.adress1.sendKeys("darmstadt");
        dropDownPage.adress2.sendKeys("otto rohtm str");
        dropDownPage.city.sendKeys("darmstadt");
        dropDownPage.contact1.sendKeys("alex");
        dropDownPage.contact2.sendKeys("juliou sezar");
        dropDownPage.checkBox.click();
        dropDownPage.registerButton.click();
        Thread.sleep(5000);
        System.out.println( Driver.getDriver().switchTo().alert().getText()+" dir ");



    }
    @AfterClass
    public void tearDown(){
       // Driver.getDriver().close();
    }
}
