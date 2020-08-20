package com.deneme1.tests;

import com.deneme1.utilities.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertions {

    //Class name : Soft_Hard_Assertion
//http://a.testaddressbook.com/sign_in adresine gidin.
//email textbox,password textbox, ve signin button elementlerini locate edin.
//Aşağıdaki username ve password girin ve signin buttonuna tıklayın.
//Username : testtechproed@gmail.com
//Password : Test1234!
//Daha sonra farklı iddialar(assertions) kullanarak sayfaya doğru giriş yaptığınızı doğrulayın.
//Daha sonra assertions kullanarak testtechproed@gmail.com kullanıcı kimliğinin(userID) doğrulayın

    WebDriver driver;

    @BeforeClass
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("http://a.testaddressbook.com/sign_in");
    }
    @Test
    public void assertionsMethod(){
       // Driver.getDriver().get("http://a.testaddressbook.com/sign_in");

        WebElement testEmailBox=driver.findElement(By.id("session_email"));
        WebElement testPasswordBox=driver.findElement(By.id("session_password"));
        WebElement testSingIn=driver.findElement(By.xpath("//input[@name='commit']"));
        testEmailBox.sendKeys("testtechproed@gmail.com");
        testPasswordBox.sendKeys("Test1234!");
        testSingIn.click();
        driver.manage().window().maximize();

        WebElement dogrulamaText=driver.findElement(By.xpath("//h1[.='Welcome to Address Book']"));
       // System.out.println(dogrulamaText.getText());
        //Assert.assertTrue(dogrulamaText.isDisplayed());

        SoftAssert softAssert=new SoftAssert();
        softAssert.assertFalse(dogrulamaText.isDisplayed());
        softAssert.assertTrue(dogrulamaText.isDisplayed());
        softAssert.assertEquals(3,7);
        softAssert.assertAll();



    }


    @AfterClass
    public void tearDown(){
        driver.close();
    }

}
