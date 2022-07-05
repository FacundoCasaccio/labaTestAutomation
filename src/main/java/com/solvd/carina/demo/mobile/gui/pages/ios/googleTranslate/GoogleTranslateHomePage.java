package com.solvd.carina.demo.mobile.gui.pages.ios.googleTranslate;

import com.qaprosoft.carina.core.foundation.exception.NotSupportedOperationException;
import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.solvd.carina.demo.mobile.gui.pages.common.googleTranslate.GoogleTranslateHomePageBase;
import com.solvd.carina.demo.mobile.gui.pages.common.googleTranslate.GoogleTranslateSavedPageBase;
import com.solvd.carina.demo.mobile.gui.pages.common.googleTranslate.GoogleTranslateSearchTranslationPageBase;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = GoogleTranslateHomePageBase.class)
public class GoogleTranslateHomePage extends GoogleTranslateHomePageBase {

    public GoogleTranslateHomePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public GoogleTranslateSearchTranslationPageBase tapTranslationInputField() {
        throw new NotSupportedOperationException(NOT_IMPLEMENTED_FOR_IOS);
    }

    @Override
    public GoogleTranslateSavedPageBase tapSavedTranslationsStarIcon() {
        throw new NotSupportedOperationException(NOT_IMPLEMENTED_FOR_IOS);
    }
}
