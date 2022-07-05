package com.solvd.carina.demo.mobile.gui.pages.ios.googleTranslate.components;

import com.qaprosoft.carina.core.foundation.exception.NotSupportedOperationException;
import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.solvd.carina.demo.mobile.gui.pages.common.googleTranslate.components.GoogleTranslateTranslationKebabMenuBase;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = GoogleTranslateTranslationKebabMenuBase.class)
public class GoogleTranslateTrasnslationKebabMenu extends GoogleTranslateTranslationKebabMenuBase {

    public GoogleTranslateTrasnslationKebabMenu(WebDriver driver) {
        super(driver);
    }

    @Override
    public void tapReverseTranslate() {
        throw new NotSupportedOperationException(NOT_IMPLEMENTED_FOR_IOS);
    }

    @Override
    public void tapAddToPhrasebook() {
        throw new NotSupportedOperationException(NOT_IMPLEMENTED_FOR_IOS);
    }
}
