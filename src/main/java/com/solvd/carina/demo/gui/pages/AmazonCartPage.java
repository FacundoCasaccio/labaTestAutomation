package com.solvd.carina.demo.gui.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class AmazonCartPage extends AmazonAbstractPage {

    @FindBy(id = "a-autoid-0-announce")
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
