package com.solvd.carina.demo.mobile.gui.pages.common.googleTranslate.components;

import com.solvd.carina.demo.mobile.gui.pages.common.googleTranslate.BasicGoogleTranslatePageBase;
import org.openqa.selenium.WebDriver;

public abstract class GoogleTranslateTranslationKebabMenuBase extends BasicGoogleTranslatePageBase {

    public GoogleTranslateTranslationKebabMenuBase(WebDriver driver) {
        super(driver);
    }

    public abstract void tapReverseTranslate();

    public abstract void tapAddToPhrasebook();
}
