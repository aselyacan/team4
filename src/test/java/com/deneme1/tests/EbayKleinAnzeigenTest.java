package com.deneme1.tests;
import com.deneme1.pages.EbayKleinAnzeigenPage;
import com.deneme1.utilities.ConfigReader;
import com.deneme1.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class EbayKleinAnzeigenTest  {
    //EbayKleinAnzeigen
    //- https://www.ebay-kleinanzeigen.de/
    //1.Alle Kategorien(DropDown)
    //2.	==>	Auto, rat&boot
    //3.		==>		Autos.click
    //4.solda bulunan linklerden==>VolksWagen.click
    //5.solda bulunan linklerden==>  Golf.click
    //6.Erstzulassungsjahr bolumunde uretim yil kutucuklarini doldur(2015-2019) ve click
    //7. 3.ilani tikla(Reklamlardan sonraki ilk ilan)
    //8. Anzeige teilen.click
    //9.via E-Mail tailen.click

    EbayKleinAnzeigenPage ekAPage;
    Actions actions;
    WebDriverWait wait;

    @Test(priority = 1)
    public void girisTesti(){
        Driver.getDriver().get(ConfigReader.getProperty("ebayGirisurl"));
        ekAPage=new EbayKleinAnzeigenPage();
        actions=new Actions(Driver.getDriver());
        wait=new WebDriverWait(Driver.getDriver(),15);

        Assert.assertEquals(Driver.getDriver().getTitle(),"eBay Kleinanzeigen | Kostenlos. Einfach. Lokal. Anzeigen gratis inserieren mit eBay Kleinanzeigen");
    }
    @Test(priority = 2)
    public void alleKategorienTest(){

        ekAPage.akzeptieren.click();
        ekAPage.alleKategorienDropDown.click();
        wait.until(ExpectedConditions.visibilityOfAllElements(ekAPage.allSubLink));

        actions.moveToElement(ekAPage.alleKategorienDropDown).
                moveToElement(ekAPage.autoRadBoot).perform();
//        ekAPage.autoRadBoot.click();
        ekAPage.autos.click();
       // Driver.getDriver().switchTo().alert().accept();
        //ekAPage.einLoggen.click();
        ekAPage.suchBox.sendKeys("Toyota Yaris");
        ekAPage.pltzOrtBox.sendKeys("Darmstadt");
        ekAPage.finden.click();










    }


}
