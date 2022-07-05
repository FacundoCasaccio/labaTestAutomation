package com.solvd.carina.demo.mobile.gui.pages.common.googleTranslate;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class BasicGoogleTranslatePageBase extends AbstractPage {

    protected static final String NOT_IMPLEMENTED_FOR_IOS = "Method is not implemented on iOS";

    public BasicGoogleTranslatePageBase(WebDriver driver) {
        super(driver);
    }
}
