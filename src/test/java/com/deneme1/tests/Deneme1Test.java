package com.deneme1.tests;

import com.deneme1.pages.Deneme1Page;
import com.deneme1.utilities.ConfigReader;
import com.deneme1.utilities.Driver;
import org.testng.annotations.Test;

public class Deneme1Test {

    Deneme1Page deneme1Page=new Deneme1Page();


    @Test(priority = 2,dependsOnMethods = "resultMethod")
    public void googleDenemeTest(){

       Driver.getDriver().get("https://www.google.com/");
      // Driver.getDriver().get(ConfigReader.getProperty("google_url"));
        //Resit bey den degisiklikler!


        deneme1Page.gmailLink.click();

        Driver.getDriver().navigate().back(); //get("https://www.google.com/");
        deneme1Page.searchBoxgmail.sendKeys("Almanya");
        deneme1Page.searchBoxgmail.submit();
        deneme1Page.videos.click();
        deneme1Page.almanyaVideosu1.click();
        System.out.println("ikinci  sirada calisacagim  googletest");

     }

      @Test(priority = 1,dependsOnMethods = "search")

    public void youtubeDenemeTest() throws InterruptedException {


        Driver.getDriver().get("https://www.youtube.com/");
        deneme1Page.youtubeSearchBox.sendKeys("java");
        Thread.sleep(3000);
        deneme1Page.youtubeClick.click();
          System.out.println("Birinci  sirada calisacagim youtube test");

      }

      @Test(priority = 3)
    public void search(){
          System.out.println("Ucuncu sirada calisacagim  .search method .....");
      }

      @Test(priority = 4)
    public void resultMethod(){
          System.out.println("Dorduncu siraca  calisacagim resultMethod   ");
      }


}
