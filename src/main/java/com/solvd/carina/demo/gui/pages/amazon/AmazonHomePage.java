package com.solvd.carina.demo.gui.pages.amazon;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.solvd.carina.demo.gui.components.amazon.AmazonItemsShippedToToast;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class AmazonHomePage extends AmazonAbstractPage {

    @FindBy(css = ".glow-toaster-footer")
    private AmazonItemsShippedToToast itemsShippedToToast;

    @FindBy(css = ".sign-in-tooltip-link")
    private ExtendedWebElement startHereLink;

    @FindBy(css = ".navLeftFooter")
    private ExtendedWebElement footerContainer;

    public AmazonHomePage(WebDriver driver) {
        super(driver);
        setPageURL("");
    }

    public AmazonTodaysDealsPage navigateToTodaysDealsPage() {
        if (itemsShippedToToast.isToastPresent()) {
            itemsShippedToToast.dismissToast();
        }
        return navBar.clickTodaysDealsItem();
    }

    public AmazonCartPage navigateToCartPage() {
        return navBar.clickCartIcon();
    }

    public AmazonConditionsOfUsePage navigateToConditionsOfUsePage() {
        return footer.clickConditionsOfUseLink();
    }

    public AmazonCreateAccountPage clickStartHereLink() {
        startHereLink.click();
        return new AmazonCreateAccountPage(driver);
    }

    public void scrollToBottom() {
        slide(footerContainer,0,0);
    }
}
