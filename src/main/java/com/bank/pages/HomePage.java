package com.bank.pages;

import com.aventstack.extentreports.Status;
import com.bank.customlisteners.CustomListeners;
import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class HomePage extends Utility {
   public HomePage(){
       PageFactory.initElements(driver,this);
   }
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Home')]")
    WebElement homeBtn;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Customer Login')]")
    WebElement customerLoginBtn;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Bank Manager Login')]")
    WebElement bankManagerLoginBtn;


    public void clickHomeButton() {
        clickOnElement(homeBtn);
        CustomListeners.node.log(Status.PASS, "Click on 'Home' Button");
        Reporter.log("Click on 'Home' Button" + "<br>");
    }

    public void clickCustomerLoginBtnButton() {
        clickOnElement(customerLoginBtn);
        CustomListeners.node.log(Status.PASS, "Click on 'Customer Login' Button");
        Reporter.log("Click on 'Customer Login' Button" + "<br>");
    }


    public void clickBankManagerLoginButton() {
        clickOnElement(bankManagerLoginBtn);
        CustomListeners.node.log(Status.PASS, "Click on 'Bank Manager Login' Button");
        Reporter.log("Click on 'Bank Manager Login' Button" + "<br>");
    }
}
