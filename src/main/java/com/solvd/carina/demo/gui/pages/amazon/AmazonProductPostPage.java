package com.solvd.carina.demo.gui.pages.amazon;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class AmazonProductPostPage extends AmazonAbstractPage {

    @FindBy(id = "title")
    private ExtendedWebElement productTitle;

    @FindBy(xpath = "//a[contains(text(),\"See all reviews\")]")
    private ExtendedWebElement seeAllReviewsLink;

    public AmazonProductPostPage(WebDriver driver) {
        super(driver);
    }

    public boolean isProductTitlePresent() {
        return productTitle.isElementPresent();
    }

    public AmazonProductReviewsPage clickSeeAllReviewsLink() {
        seeAllReviewsLink.click();
        return new AmazonProductReviewsPage(driver);
    }
}
