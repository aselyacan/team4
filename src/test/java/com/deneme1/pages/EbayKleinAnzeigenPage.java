package com.deneme1.pages;

import com.deneme1.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class EbayKleinAnzeigenPage {

    public EbayKleinAnzeigenPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "gdpr-banner-accept")
    public WebElement akzeptieren;
    @FindBy(id = "srch-ctgry-inpt")//srch-ctgry-inpt
    public WebElement alleKategorienDropDown;
    @FindBy(linkText = "Auto, Rad & Boot")
    public WebElement  autoRadBoot;
    @FindBy(linkText= "Autos")
    public WebElement autos;
    @FindBy(xpath = "//ul[@class='dropdown-list multiselectbox-list']")
    public List<WebElement> allSubLink;
    @FindBy(linkText = "Einloggen")
    public WebElement einLoggen;
    @FindBy(id = "site-search-query")
    public WebElement suchBox;
    @FindBy(id = "site-search-area")
    public  WebElement pltzOrtBox;
    @FindBy(id = "site-search-submit")
    public  WebElement finden;

}
