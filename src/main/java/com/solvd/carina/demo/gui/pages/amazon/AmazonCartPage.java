package com.solvd.carina.demo.gui.pages.amazon;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class AmazonCartPage extends AmazonAbstractPage {

    @FindBy(xpath = "//span[contains(text(),'Sign in to your account')]")
    private ExtendedWebElement signInToYourAccountButton;

    public AmazonCartPage(WebDriver driver) {
        super(driver);
    }

    public AmazonSignInPage clickSignInToYourAccountButton() {
        signInToYourAccountButton.click();
        return new AmazonSignInPage(driver);
    }

    public boolean isCartPageTitleCorrect() {
        return getTitle().equalsIgnoreCase("Amazon.com Shopping Cart");
    }
}
