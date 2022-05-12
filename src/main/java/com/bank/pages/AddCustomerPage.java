package com.bank.pages;

import com.aventstack.extentreports.Status;
import com.bank.customlisteners.CustomListeners;
import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class AddCustomerPage extends Utility {
    public AddCustomerPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Home')]")
    WebElement homeBtn;

    @CacheLookup
    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/input[1]")
    WebElement firstNameField;

    @CacheLookup
    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/input[1]")
    WebElement lastNameField;

    @CacheLookup
    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[3]/input[1]")
    WebElement postCodeField;

    @CacheLookup
    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/button[1]")
    WebElement addCustomerBtn;


    public void clickHomeButton(){
        clickOnElement(homeBtn);
        CustomListeners.node.log(Status.PASS, "Click on 'Home' Button");
        Reporter.log("Click on 'Home' Button" + "<br>");
    }

    public void enterFirstName(String firstname) {
        sendTextToElement(firstNameField, firstname);
        CustomListeners.node.log(Status.PASS, "Enter First Name '" + firstname + "' to First Name field : "
                + firstNameField.getText());
        Reporter.log("Enter First Name " + firstname + " to First Name field " + firstNameField.getText() + "<br>");
    }

    public void enterLastName(String lastname) {
        sendTextToElement(lastNameField, lastname);
        CustomListeners.node.log(Status.PASS, "Enter Last Name '" + lastname + "' to Last Name field : "+ lastNameField.getText());
        Reporter.log("Enter Last Name " + lastname + " to Last Name field " + lastNameField.getText() + "<br>");
    }

    public void enterPostCode(String postcode) {
        sendTextToElement(postCodeField, postcode);
        CustomListeners.node.log(Status.PASS, "Enter Postcode '" + postcode + "' to Postcode field : " + postCodeField.getText());
        Reporter.log("Enter Postcode " + postcode + " to Postcode field " + postCodeField.getText() + "<br>");
    }

    public void clickAddCustomerButton(){
        clickOnElement(addCustomerBtn);
        CustomListeners.node.log(Status.PASS, "Click on 'Add Customer' Button");
        Reporter.log("Click on 'Add Customer' Button" + "<br>");
    }

    public String textFromAlert(){
        String successfullyAddedMessage = getTextFromAlert();
        String actualSuccessfullyAddedMessage = successfullyAddedMessage.substring(0,27);
        CustomListeners.node.log(Status.PASS, "Get Customer added successfully text : " + actualSuccessfullyAddedMessage);
        Reporter.log("Get Customer added successfully text : " + actualSuccessfullyAddedMessage + "<br>");
        return actualSuccessfullyAddedMessage;
    }

    public void clickOkOnAlert(){
        acceptAlert();
    }

}
