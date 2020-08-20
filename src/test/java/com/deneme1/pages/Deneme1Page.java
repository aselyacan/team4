package com.deneme1.pages;

import com.deneme1.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Deneme1Page {

    public Deneme1Page(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@name='q']")
    public WebElement googleSearchBox;

    @FindBy(partialLinkText = "mail")
    public WebElement gmailLink;

    @FindBy(xpath = "//input[@name='q']")
    public  WebElement searchBoxgmail;

    @FindBy(xpath = "//a[@data-sc='V']")
    public WebElement videos;

    @FindBy(partialLinkText = "Willkommen in Deutschland")
    public WebElement almanyaVideosu1;

    @FindBy(xpath = "//input[@id='search']")
   // @FindBy(id = "search")
    public  WebElement youtubeSearchBox;

    @FindBy(id = "search-icon-legacy")
    public WebElement youtubeClick;

    @FindBy(id = "searchDropdownBox")
    public WebElement amazonDropDownBox;
    @FindBy(id = "twotabsearchtextbox")
    public WebElement amazonSearchBox;
    @FindBy(xpath = "//*[@id=\"p_76/419122031\"]/span/a/div/label/i")
    public WebElement amazonPrimeCheckBOX;

    @FindBy(css = "span[class='icp-nav-link-inner']")
    public WebElement amazonRadioButton;

    @FindBy(xpath = "(//span[@class='a-label a-radio-label'])[5]")
    public WebElement choiceButton;

    @FindBy(xpath = "//input[@class='a-button-input']")
    public WebElement saveButton;




}
