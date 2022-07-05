package com.solvd.carina.demo.mobile.gui.pages.ios.googleTranslate;

import com.qaprosoft.carina.core.foundation.exception.NotSupportedOperationException;
import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.solvd.carina.demo.mobile.gui.pages.common.googleTranslate.GoogleTranslateSearchTranslationPageBase;
import com.solvd.carina.demo.mobile.gui.pages.common.googleTranslate.GoogleTranslateTranslationPageBase;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = GoogleTranslateSearchTranslationPageBase.class)
public class GoogleTranslateSearchTranslationPage extends GoogleTranslateSearchTranslationPageBase {

    public GoogleTranslateSearchTranslationPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public GoogleTranslateTranslationPageBase searchTranslation(String input) {
        throw new NotSupportedOperationException(NOT_IMPLEMENTED_FOR_IOS);
    }
}
