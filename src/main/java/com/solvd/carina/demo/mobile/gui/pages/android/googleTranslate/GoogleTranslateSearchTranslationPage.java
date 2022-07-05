package com.solvd.carina.demo.mobile.gui.pages.android.googleTranslate;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.solvd.carina.demo.mobile.gui.pages.common.googleTranslate.GoogleTranslateSearchTranslationPageBase;
import com.solvd.carina.demo.mobile.gui.pages.common.googleTranslate.GoogleTranslateTranslationPageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = GoogleTranslateSearchTranslationPageBase.class)
public class GoogleTranslateSearchTranslationPage extends GoogleTranslateSearchTranslationPageBase {

    @FindBy(id = "com.google.android.apps.translate:id/text_input_field")
    private ExtendedWebElement translationInputField;

    @FindBy(id = "com.google.android.apps.translate:id/text_output_field")
    private ExtendedWebElement translationOutputField;


    public GoogleTranslateSearchTranslationPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public GoogleTranslateTranslationPageBase searchTranslation(String input) {
        translationInputField.type(input);
        translationOutputField.click();
        return initPage(GoogleTranslateTranslationPageBase.class);
    }
}
