package com.solvd.carina.demo.mobile.gui.pages.common.googleTranslate;

import org.openqa.selenium.WebDriver;

public abstract class GoogleTranslateSavedPageBase extends BasicGoogleTranslatePageBase {

    public GoogleTranslateSavedPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract void removeSavedTranslations();

    public abstract boolean isSavedTranslationsListEmpty();
}
