package com.solvd.carina.demo.gui.components;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import com.solvd.carina.demo.gui.pages.AmazonCartPage;
import com.solvd.carina.demo.gui.pages.AmazonTodaysDealsPage;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class AmazonNavBar extends AbstractUIObject {

    @FindBy(xpath = ".//a[contains(text(),\"Today's Deals\")]")
    private ExtendedWebElement todaysDealsItem;

    @FindBy(id = "nav-cart")
    private ExtendedWebElement cartIcon;

    public AmazonNavBar(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public AmazonCartPage clickCartIcon() {
        cartIcon.click();
        return new AmazonCartPage(driver);
    }

    public AmazonTodaysDealsPage clickTodaysDealsItem() {
        todaysDealsItem.click();
        return new AmazonTodaysDealsPage(driver);
    }

}
