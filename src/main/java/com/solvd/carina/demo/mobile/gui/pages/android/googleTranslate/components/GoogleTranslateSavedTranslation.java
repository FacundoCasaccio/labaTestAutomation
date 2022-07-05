package com.solvd.carina.demo.mobile.gui.pages.android.googleTranslate.components;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.solvd.carina.demo.mobile.gui.pages.common.googleTranslate.components.GoogleTranslateSavedTranslationBase;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = GoogleTranslateSavedTranslationBase.class)
public class GoogleTranslateSavedTranslation extends GoogleTranslateSavedTranslationBase {

    @FindBy(xpath = "./android.widget.ImageButton[@content-desc='Remove from phrasebook']")
    private ExtendedWebElement removeFromSavedStarButton;

    public GoogleTranslateSavedTranslation(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    @Override
    public void removeTranslationFromSaved() {
        removeFromSavedStarButton.click();
    }
}
