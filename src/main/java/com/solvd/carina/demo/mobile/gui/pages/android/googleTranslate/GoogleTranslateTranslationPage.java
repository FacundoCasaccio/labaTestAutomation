package com.solvd.carina.demo.mobile.gui.pages.android.googleTranslate;


import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.solvd.carina.demo.mobile.gui.pages.common.googleTranslate.GoogleTranslateHomePageBase;
import com.solvd.carina.demo.mobile.gui.pages.common.googleTranslate.GoogleTranslateTranslationPageBase;
import com.solvd.carina.demo.mobile.gui.pages.common.googleTranslate.components.GoogleTranslateTranslationKebabMenuBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = GoogleTranslateTranslationPageBase.class)
public class GoogleTranslateTranslationPage extends GoogleTranslateTranslationPageBase {

    @FindBy(xpath = "//android.widget.ImageButton[@content-desc='Navigate up']")
    private ExtendedWebElement goBackArrowButton;

    @FindBy(xpath = "//android.widget.ImageView[@content-desc='More options']")
    private ExtendedWebElement kebabMenuButton;

    @FindBy(id = "com.google.android.apps.translate:id/original_text")
    private ExtendedWebElement originalTextInput;

    @FindBy(id = "com.google.android.apps.translate:id/translated_text")
    private ExtendedWebElement translatedTextOutput;

    public GoogleTranslateTranslationPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public GoogleTranslateTranslationKebabMenuBase tapKebabMenuIcon() {
        kebabMenuButton.click();
        return initPage(GoogleTranslateTranslationKebabMenuBase.class);
    }

    @Override
    public void tapSaveTranslationStarIcon() {

    }

    @Override
    public boolean inputAndOutputMatches(String input, String output) {
        return originalTextInput.getText().equalsIgnoreCase(input) && translatedTextOutput.getText().equalsIgnoreCase(output);
    }

    @Override
    public GoogleTranslateHomePageBase tapGoBackArrowButton() {
        goBackArrowButton.click();
        return initPage(GoogleTranslateHomePageBase.class);
    }
}
