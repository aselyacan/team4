package com.deneme1.tests;
import com.deneme1.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class DenemeApple {
    @BeforeClass
    public void setup(){
        Driver.getDriver().get("https://www.apple.com/de/");
    }
    @Test
    public void appleIframe() throws InterruptedException {
        Thread.sleep(7000);
        WebElement ertsApple = Driver.getDriver().findElement(By.xpath("(//a[@class='unit-link'])[1]"));
        Thread.sleep(2000);
        ertsApple.click();

        Thread.sleep(7000);
        WebElement kaufen = Driver.getDriver().findElement(By.linkText("Kaufen"));
        kaufen.click();
        WebElement yanButton = Driver.getDriver().findElement(By.xpath("(//button[@data-ase-gallery='buyflow-gallery'])[2]"));
        yanButton.click();
        WebElement kostenlosTesten = Driver.getDriver().findElement(By.linkText("Kostenlos testen"));
        kostenlosTesten.click();
        WebElement anmeldenButton = Driver.getDriver().findElement(By.xpath("//button[@class='commerce-button']"));
        anmeldenButton.click();
        Driver.getDriver().switchTo().frame(1);
        WebElement anmeldenText = Driver.getDriver().findElement(By.xpath("//input[@id='account_name_text_field']"));
        anmeldenText.click();
        Thread.sleep(5000);
        anmeldenText.sendKeys("rafael"+ Keys.ENTER);

    }

}
