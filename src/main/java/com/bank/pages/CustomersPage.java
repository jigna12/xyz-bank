package com.bank.pages;

import com.aventstack.extentreports.Status;
import com.bank.customlisteners.CustomListeners;
import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class CustomersPage extends Utility {
    public CustomersPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/div[1]/button[2]")
    WebElement logoutBtn;


    public String verifyLogoutButton(){
        String logoutMessage = logoutBtn.getAttribute("ng-show");
        CustomListeners.node.log(Status.PASS, "Find Logout Button : " + logoutMessage);
        Reporter.log("Find Logout Button : " + logoutMessage + "<br>");
        return logoutMessage;
    }

    public void clickLogoutButton() {
        clickOnElement(logoutBtn);
        CustomListeners.node.log(Status.PASS, "Click on 'Logout' Button");
        Reporter.log("Click on 'Logout' Button" + "<br>");
    }


}
