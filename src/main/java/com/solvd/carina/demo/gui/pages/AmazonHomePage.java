package com.solvd.carina.demo.gui.pages;

import com.qaprosoft.carina.core.foundation.utils.Configuration;
import com.qaprosoft.carina.core.foundation.utils.R;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.solvd.carina.demo.gui.components.AmazonItemsShippedToToast;
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
        setPageAbsoluteURL(R.CONFIG.get(Configuration.Parameter.URL.getKey()));
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
