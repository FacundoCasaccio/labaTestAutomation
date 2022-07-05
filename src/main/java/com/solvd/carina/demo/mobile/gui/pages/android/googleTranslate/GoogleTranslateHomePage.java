package com.solvd.carina.demo.mobile.gui.pages.android.googleTranslate;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.solvd.carina.demo.mobile.gui.pages.common.googleTranslate.GoogleTranslateHomePageBase;
import com.solvd.carina.demo.mobile.gui.pages.common.googleTranslate.GoogleTranslateSavedPageBase;
import com.solvd.carina.demo.mobile.gui.pages.common.googleTranslate.GoogleTranslateSearchTranslationPageBase;
import com.solvd.carina.demo.mobile.gui.pages.common.googleTranslate.GoogleTranslateTranslationPageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = GoogleTranslateHomePageBase.class)
public class GoogleTranslateHomePage extends GoogleTranslateHomePageBase {

    @FindBy(id = "com.google.android.apps.translate:id/enter_text_label")
    private ExtendedWebElement textInputField;

    @FindBy(xpath = "//android.widget.Button[@content-desc='Saved']")
    private ExtendedWebElement savedStarButton;

    public GoogleTranslateHomePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public GoogleTranslateSearchTranslationPageBase tapTranslationInputField() {
        textInputField.click();
        return initPage(GoogleTranslateSearchTranslationPageBase.class);
    }

    @Override
    public GoogleTranslateSavedPageBase tapSavedTranslationsStarIcon() {
        savedStarButton.click();
        return initPage(GoogleTranslateSavedPageBase.class);
    }
}

