package com.deneme1.pages;

import com.deneme1.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DenemeDropDownPage {
    public DenemeDropDownPage (){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//input[@type='text'])[1]")
    public WebElement firstName;
    @FindBy(xpath = "(//input[@type='text'])[2]")
    public WebElement lastName;
    @FindBy(xpath = "//input[@value='male']")
    public WebElement genderButton;
    @FindBy(xpath = "//select")
    public WebElement select;
    @FindBy(xpath = "(//input[@type='text'])[3]")
    public WebElement adress1;
    @FindBy(xpath = "(//input[@type='text'])[4]")
    public WebElement adress2;
    @FindBy(xpath = "(//input[@type='text'])[5]")
    public WebElement city;
    @FindBy(xpath = "(//input[@type='text'])[6]")
    public WebElement contact1;
    @FindBy(xpath = "(//input[@type='text'])[7]")
    public WebElement contact2;
    @FindBy(xpath = "//input[@type='checkbox']")
    public WebElement checkBox;
    @FindBy(xpath = "//input[@type='submit']")
    public WebElement registerButton;


    //DropDown Test Case
// testNG'de;
// 1. DenemeDropDownPage ve DenemeDropDownTest adinda iki class olustur.
// 2. http://techcanvass.com/examples/register.html sayfasina git
// 3. First Name ve Last Name locate et ve veri gonder
// 4. Select Your Gender
// 5. Choose the name of the model:
// 6. Address1 and Address2 locate et ve veri gonder
// 7. Contact1 ve Contact2 locate et ve veri gonder
// 8. check button sec
// 9. REGISTER yap.

}
