package com.solvd.carina.demo.gui.components.amazon;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import com.solvd.carina.demo.gui.pages.amazon.AmazonProductPostPage;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class AmazonTodaysDealsProductCard extends AbstractUIObject {

    @FindBy(xpath = ".//img")
    private ExtendedWebElement productImage;

    public AmazonTodaysDealsProductCard(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public AmazonProductPostPage clickProductImage() {
        productImage.click();
        return new AmazonProductPostPage(driver);
    }
}
