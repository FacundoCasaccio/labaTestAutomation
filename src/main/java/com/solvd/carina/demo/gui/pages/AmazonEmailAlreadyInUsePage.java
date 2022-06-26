package com.solvd.carina.demo.gui.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class AmazonEmailAlreadyInUsePage extends AmazonAbstractPage {

    @FindBy(xpath = "//h4[contains(text(),'Email address already in use')]")
    private ExtendedWebElement emailAlreadyInUseAlert;

    public AmazonEmailAlreadyInUsePage(WebDriver driver) {
        super(driver);
    }

    public boolean isEmailAlreadyInUseAlertPresent() {
        return emailAlreadyInUseAlert.isElementPresent();
    }
}
