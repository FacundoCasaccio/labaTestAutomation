package com.solvd.carina.demo.mobile.gui.pages.ios.googleTranslate;

import com.qaprosoft.carina.core.foundation.exception.NotSupportedOperationException;
import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.solvd.carina.demo.mobile.gui.pages.common.googleTranslate.GoogleTranslateSavedPageBase;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = GoogleTranslateSavedPageBase.class)
public class GoogleTranslateSavedPage extends GoogleTranslateSavedPageBase {

    public GoogleTranslateSavedPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void removeSavedTranslations() {
        throw new NotSupportedOperationException(NOT_IMPLEMENTED_FOR_IOS);
    }

    @Override
    public boolean isSavedTranslationsListEmpty() {
        throw new NotSupportedOperationException(NOT_IMPLEMENTED_FOR_IOS);
    }
}
