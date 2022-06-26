package com.solvd.carina.demo.gui.pages;

import com.solvd.carina.demo.gui.components.AmazonTodaysDealsProductCard;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AmazonTodaysDealsPage extends AmazonAbstractPage {

    @FindBy(css = ".a-image-container")
    private List<AmazonTodaysDealsProductCard> todaysDealsProductCards;

    public AmazonTodaysDealsPage(WebDriver driver) {
        super(driver);
    }

    public boolean isPageTitleCorrect() {
        return getTitle().equalsIgnoreCase("Amazon.com - Today's Deals");
    }

    public AmazonProductPostPage navigateToProductPage(int productPositionInGrid) {
        return todaysDealsProductCards.get(productPositionInGrid)
                .clickProductImage();
    }
}
