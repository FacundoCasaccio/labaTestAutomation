package com.solvd.carina.demo.gui.components.amazon;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class AmazonItemsShippedToToast extends AbstractUIObject {

    @FindBy(css = ".glow-toaster-button-dismiss")
    private ExtendedWebElement dontChangeButton;

    public AmazonItemsShippedToToast(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public void dismissToast() {
        dontChangeButton.click();
    }

    public boolean isToastPresent() {
        return dontChangeButton.isElementPresent();
    }
}
