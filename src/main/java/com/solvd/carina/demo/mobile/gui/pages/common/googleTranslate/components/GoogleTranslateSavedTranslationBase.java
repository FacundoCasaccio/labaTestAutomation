package com.solvd.carina.demo.mobile.gui.pages.common.googleTranslate.components;

import com.qaprosoft.carina.core.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;

public abstract class GoogleTranslateSavedTranslationBase extends AbstractUIObject {
    protected static final String NOT_IMPLEMENTED_FOR_IOS = "Method is not implemented on iOS";

    public GoogleTranslateSavedTranslationBase(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public abstract void removeTranslationFromSaved();
}
