package com.solvd.carina.demo.gui.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class AmazonProductReviewsPage extends AmazonAbstractPage {

    @FindBy(xpath = "//h2[contains(text(),'Customer reviews')]")
    private ExtendedWebElement customerReviewsTitle;

    public AmazonProductReviewsPage(WebDriver driver) {
        super(driver);
    }

    public boolean isCustomerReviewsTitlePresent() {
        return customerReviewsTitle.isElementPresent();
    }
}
