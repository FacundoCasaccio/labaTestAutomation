package com.solvd.carina.demo.mobile.gui.pages.android.googleTranslate.components;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.solvd.carina.demo.mobile.gui.pages.common.googleTranslate.components.GoogleTranslateTranslationKebabMenuBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = GoogleTranslateTranslationKebabMenuBase.class)
public class GoogleTranslateTranslationKebabMenu extends GoogleTranslateTranslationKebabMenuBase {

    @FindBy(xpath = "//android.widget.TextView[@text = 'Add to phrasebook']")
    private ExtendedWebElement addToPhrasebookButton;

    @FindBy(xpath = "//android.widget.TextView[@text = 'Reverse translate']")
    private ExtendedWebElement reverseTranslateButton;

    public GoogleTranslateTranslationKebabMenu(WebDriver driver) {
        super(driver);
    }

    @Override
    public void tapReverseTranslate() {
        reverseTranslateButton.click();
    }

    @Override
    public void tapAddToPhrasebook() {
        addToPhrasebookButton.click();
    }
}
