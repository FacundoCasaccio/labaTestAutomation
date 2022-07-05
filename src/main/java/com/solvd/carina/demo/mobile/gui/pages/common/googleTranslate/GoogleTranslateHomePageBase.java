package com.solvd.carina.demo.mobile.gui.pages.common.googleTranslate;

import org.openqa.selenium.WebDriver;

public abstract class GoogleTranslateHomePageBase extends BasicGoogleTranslatePageBase {
    public GoogleTranslateHomePageBase(WebDriver driver) {
        super(driver);
    }

    public abstract GoogleTranslateSearchTranslationPageBase tapTranslationInputField();

    public abstract GoogleTranslateSavedPageBase tapSavedTranslationsStarIcon();
}
