package com.solvd.carina.demo.mobile.gui.pages.common.googleTranslate;

import org.openqa.selenium.WebDriver;

public abstract class GoogleTranslateSearchTranslationPageBase extends BasicGoogleTranslatePageBase{

    public GoogleTranslateSearchTranslationPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract GoogleTranslateTranslationPageBase searchTranslation(String input);
}
