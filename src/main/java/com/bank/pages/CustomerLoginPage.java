package com.bank.pages;

import com.aventstack.extentreports.Status;
import com.bank.customlisteners.CustomListeners;
import com.bank.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class CustomerLoginPage extends Utility {
    public CustomerLoginPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//select[@id='userSelect']")
    WebElement nameDropDownMenu;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Login')]")
    WebElement loginBtn;


    @CacheLookup
    @FindBy(xpath = "//label[contains(text(),'Your Name :')]")
    WebElement yourNameText;


    public void selectNameFromDropDownMenu(String name) {
        selectByVisibleTextFromDropDown(nameDropDownMenu, name);
        CustomListeners.node.log(Status.PASS, "Select name from drop down '" + name + "'");
        Reporter.log("Select name from drop down '" + name + "'" + "<br>");
    }

    public void clickLoginButton() {
        clickOnElement(loginBtn);
        CustomListeners.node.log(Status.PASS, "Click on 'Login' Button");
        Reporter.log("Click on 'Login' Button" + "<br>");
    }

    public String getYourNameText(){
        String getYourNameText = getTextFromElement(yourNameText);
        String actualYourNameText= getYourNameText.substring(0,9);
        CustomListeners.node.log(Status.PASS, "Get Your Name text : " + actualYourNameText);
        Reporter.log("Get Your Name text : " + actualYourNameText + "<br>");
        return actualYourNameText;
    }

}
