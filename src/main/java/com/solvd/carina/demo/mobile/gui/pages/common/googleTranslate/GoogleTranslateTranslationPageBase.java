package com.solvd.carina.demo.mobile.gui.pages.common.googleTranslate;

import com.solvd.carina.demo.mobile.gui.pages.common.googleTranslate.components.GoogleTranslateTranslationKebabMenuBase;
import org.openqa.selenium.WebDriver;

public abstract class GoogleTranslateTranslationPageBase extends BasicGoogleTranslatePageBase {

    public GoogleTranslateTranslationPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract GoogleTranslateTranslationKebabMenuBase tapKebabMenuIcon();

    public abstract void tapSaveTranslationStarIcon();

    public abstract boolean inputAndOutputMatches(String input, String output);

    public abstract GoogleTranslateHomePageBase tapGoBackArrowButton();

}
