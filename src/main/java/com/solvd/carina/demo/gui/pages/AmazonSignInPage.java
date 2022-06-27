package com.solvd.carina.demo.gui.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class AmazonSignInPage extends AmazonAbstractPage {

    @FindBy(xpath = "//h1[contains(text(),'Sign-In')]")
    private ExtendedWebElement signInTitle;

    public AmazonSignInPage(WebDriver driver) {
        super(driver);
    }

    public boolean isSignInTitlePresent() {
        return signInTitle.isElementPresent();
    }
}
