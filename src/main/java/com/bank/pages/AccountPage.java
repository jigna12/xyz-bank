package com.bank.pages;

import com.aventstack.extentreports.Status;
import com.bank.customlisteners.CustomListeners;
import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class AccountPage extends Utility {
    public AccountPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Home')]")
    WebElement homeBtn;

    @CacheLookup
    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[3]/button[1]")
    WebElement transactionsBtn;

    @CacheLookup
    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[3]/button[2]")
    WebElement depositBtn;

    @CacheLookup
    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[3]/button[3]")
    WebElement withdrawalBtn;

    @CacheLookup
    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[4]/div[1]/form[1]/div[1]/input[1]")
    WebElement enterDepositAmount;

    @CacheLookup
    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[4]/div[1]/form[1]/button[1]")
    WebElement smallDepositButton;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Deposit Successful')]")
    WebElement depositSuccessText;

    @CacheLookup
    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[4]/div[1]/form[1]/div[1]/input[1]")
    WebElement enterWithdrawalAmount;

    @CacheLookup
    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[4]/div[1]/form[1]/button[1]")
    WebElement smallWithdrawButton;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Transaction successful')]")
    WebElement withdrawalSuccessText;


    public void clickHomeButton() {
        clickOnElement(homeBtn);
        CustomListeners.node.log(Status.PASS, "Click on 'Home' Button");
        Reporter.log("Click on 'Home' Button" + "<br>");
    }

    public void clickTransactionsButton() {
        clickOnElement(transactionsBtn);
        CustomListeners.node.log(Status.PASS, "Click on 'Transactions' Button");
        Reporter.log("Click on 'Transactions' Button" + "<br>");
    }

    public void clickDepositButton() {
        clickOnElement(depositBtn);
        CustomListeners.node.log(Status.PASS, "Click on 'Deposit' Button");
        Reporter.log("Click on 'Deposit' Button" + "<br>");
    }

    public void clickWithdrawalButton() {
        clickOnElement(withdrawalBtn);
        CustomListeners.node.log(Status.PASS, "Click on 'Withdrawal' Button");
        Reporter.log("Click on 'Withdrawal' Button" + "<br>");
    }

    public void enterDepositAmount(String depositAmount) {
        sendTextToElement(enterDepositAmount, depositAmount);
        CustomListeners.node.log(Status.PASS, "Enter Deposit Amount '" + depositAmount + "' to Deposit Amount field : " + enterDepositAmount.getText());
        Reporter.log("Enter Deposit Amount " + depositAmount + " to Deposit Amount field " + enterDepositAmount.getText() + "<br>");
    }

    public void clickSmallDepositButton() {
        clickOnElement(smallDepositButton);
        CustomListeners.node.log(Status.PASS, "Click on 'Deposit' Button");
        Reporter.log("Click on 'Deposit' Button" + "<br>");
    }

    public String verifyDepositSuccessfulText(){
        String depositSuccessfulMessage = getTextFromElement(depositSuccessText);
        CustomListeners.node.log(Status.PASS, "Find Deposit Successful Message : " + depositSuccessfulMessage);
        Reporter.log("Find Deposit Successful Message : " + depositSuccessfulMessage + "<br>");
        return depositSuccessfulMessage;
    }

    public void enterWithdrawalAmount(String withdrawalAmount) throws InterruptedException {
        Thread.sleep(2000);
        sendTextToElement(enterWithdrawalAmount, withdrawalAmount);
        CustomListeners.node.log(Status.PASS, "Enter Withdrawal Amount '" + withdrawalAmount + "' to Withdrawal Amount field : " + enterWithdrawalAmount.getText());
        Reporter.log("Enter Withdrawal Amount " + withdrawalAmount + " to Withdrawal Amount field " + enterWithdrawalAmount.getText() + "<br>");
    }

    public void clickSmallWithdrawalButton() {
        clickOnElement(smallWithdrawButton);
        CustomListeners.node.log(Status.PASS, "Click on 'Withdrawal' Button");
        Reporter.log("Click on 'Withdrawal' Button" + "<br>");
    }

    public String verifyWithdrawalSuccessfulText(){
        String withdrawalSuccessfulMessage = getTextFromElement(withdrawalSuccessText);
        CustomListeners.node.log(Status.PASS, "Find Withdrawal Successful Message : " + withdrawalSuccessfulMessage);
        Reporter.log("Find Withdrawal Successful Message : " + withdrawalSuccessfulMessage + "<br>");
        return withdrawalSuccessfulMessage;
    }

}
