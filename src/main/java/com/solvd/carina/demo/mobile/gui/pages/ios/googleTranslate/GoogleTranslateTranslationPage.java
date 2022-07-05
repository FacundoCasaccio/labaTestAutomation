package com.solvd.carina.demo.mobile.gui.pages.ios.googleTranslate;


import com.qaprosoft.carina.core.foundation.exception.NotSupportedOperationException;
import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.solvd.carina.demo.mobile.gui.pages.common.googleTranslate.GoogleTranslateHomePageBase;
import com.solvd.carina.demo.mobile.gui.pages.common.googleTranslate.GoogleTranslateTranslationPageBase;
import com.solvd.carina.demo.mobile.gui.pages.common.googleTranslate.components.GoogleTranslateTranslationKebabMenuBase;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = GoogleTranslateTranslationPageBase.class)
public class GoogleTranslateTranslationPage extends GoogleTranslateTranslationPageBase {

    public GoogleTranslateTranslationPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public GoogleTranslateTranslationKebabMenuBase tapKebabMenuIcon() {
        throw new NotSupportedOperationException(NOT_IMPLEMENTED_FOR_IOS);
    }

    @Override
    public void tapSaveTranslationStarIcon() {
        throw new NotSupportedOperationException(NOT_IMPLEMENTED_FOR_IOS);
    }

    @Override
    public boolean inputAndOutputMatches(String input, String output) {
        throw new NotSupportedOperationException(NOT_IMPLEMENTED_FOR_IOS);
    }

    @Override
    public GoogleTranslateHomePageBase tapGoBackArrowButton() {
        throw new NotSupportedOperationException(NOT_IMPLEMENTED_FOR_IOS);
    }
}
