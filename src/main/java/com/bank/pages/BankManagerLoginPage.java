package com.bank.pages;

import com.aventstack.extentreports.Status;
import com.bank.customlisteners.CustomListeners;
import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class BankManagerLoginPage extends Utility {
    public BankManagerLoginPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Home')]")
    WebElement homeBtn;

    @CacheLookup
    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[1]/button[1]")
    WebElement addCustomerBtn;

    @CacheLookup
    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[1]/button[2]")
    WebElement openAccountBtn;

    @CacheLookup
    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[1]/button[3]")
    WebElement customerBtn;



    public void clickHomeButton(){
        clickOnElement(homeBtn);
        CustomListeners.node.log(Status.PASS, "Click on 'Home' Button");
        Reporter.log("Click on 'Home' Button" + "<br>");
    }

    public void clickAddCustomerButton(){
        clickOnElement(addCustomerBtn);
        CustomListeners.node.log(Status.PASS, "Click on 'Add Customer' Button");
        Reporter.log("Click on 'Add Customer' Button" + "<br>");
    }

    public void clickOpenAccountButton(){
        clickOnElement(openAccountBtn);
        CustomListeners.node.log(Status.PASS, "Click on 'Open Account' Button");
        Reporter.log("Click on 'Open Account' Button" + "<br>");
    }

    public void clickCustomerButton(){
        clickOnElement(customerBtn);
        CustomListeners.node.log(Status.PASS, "Click on 'Customer' Button");
        Reporter.log("Click on 'Customer' Button" + "<br>");
    }
}
