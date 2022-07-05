package com.solvd.carina.demo.mobile.gui.pages.ios.googleTranslate.components;

import com.qaprosoft.carina.core.foundation.exception.NotSupportedOperationException;
import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.solvd.carina.demo.mobile.gui.pages.common.googleTranslate.components.GoogleTranslateSavedTranslationBase;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = GoogleTranslateSavedTranslationBase.class)
public class GoogleTranslateSavedTranslation extends GoogleTranslateSavedTranslationBase {


    public GoogleTranslateSavedTranslation(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    @Override
    public void removeTranslationFromSaved() {
        throw new NotSupportedOperationException(NOT_IMPLEMENTED_FOR_IOS);
    }
}
