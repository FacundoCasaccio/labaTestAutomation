package com.solvd.carina.demo.gui.pages;

import com.qaprosoft.carina.core.foundation.utils.R;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.Random;

public class AmazonCreateAccountPage extends AmazonAbstractPage {

    @FindBy(xpath = "//h1[contains(text(),'Create account')]")
    private ExtendedWebElement createAccountTitle;

    @FindBy(name = "customerName")
    private ExtendedWebElement yourNameInputBox;

    @FindBy(name = "email")
    private ExtendedWebElement emailInputBox;

    @FindBy(name = "password")
    private ExtendedWebElement passwordInputBox;

    @FindBy(name = "passwordCheck")
    private ExtendedWebElement reEnterPasswordInputBox;

    @FindBy(id = "continue")
    private ExtendedWebElement continueSubmitButton;

    public AmazonCreateAccountPage(WebDriver driver) {
        super(driver);
    }

    public boolean isCreateAccountTitlePresent() {
        return createAccountTitle.isElementPresent();
    }

    public void typeCustomerName() {
        yourNameInputBox.type(R.TESTDATA.get("customername"));
    }

    public void typeEmailRandom() {
        emailInputBox.type("randomtestemail" + new Random().nextInt() + "@gmail.com");
    }

    public void typeEmail() {
        emailInputBox.type(R.TESTDATA.get("email"));
    }

    public void typePassword() {
        passwordInputBox.type(R.TESTDATA.get("password"));
    }

    public void typeReEnterPassword() {
        reEnterPasswordInputBox.type(R.TESTDATA.get("password"));
    }

    public AmazonPuzzlePage clickContinueButton() {
        continueSubmitButton.click();
        return new AmazonPuzzlePage(driver);
    }

    public AmazonEmailAlreadyInUsePage clickVerifyEmailButton() {
        continueSubmitButton.click();
        return new AmazonEmailAlreadyInUsePage(driver);
    }

    public AmazonPuzzlePage createAccountWithUnregisteredEmail() {
        typeCustomerName();
        typeEmailRandom();
        typePassword();
        typeReEnterPassword();
        return clickContinueButton();
    }

    public AmazonEmailAlreadyInUsePage createAccountWithRegisteredEmail() {
        typeCustomerName();
        typeEmail();
        typePassword();
        typeReEnterPassword();
        return clickVerifyEmailButton();
    }
}
