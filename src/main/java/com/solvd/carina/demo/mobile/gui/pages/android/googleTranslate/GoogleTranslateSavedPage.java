package com.solvd.carina.demo.mobile.gui.pages.android.googleTranslate;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.solvd.carina.demo.mobile.gui.pages.android.googleTranslate.components.GoogleTranslateSavedTranslation;
import com.solvd.carina.demo.mobile.gui.pages.common.googleTranslate.GoogleTranslateSavedPageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = GoogleTranslateSavedPageBase.class)
public class GoogleTranslateSavedPage extends GoogleTranslateSavedPageBase {

    @FindBy(xpath = "//android.widget.ListView/android.widget.LinearLayout")
    private List<GoogleTranslateSavedTranslation> savedTranslationsList;

    public GoogleTranslateSavedPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void removeSavedTranslations() {
        for (int i = 0; i < savedTranslationsList.size() ; i++) {
            savedTranslationsList.get(i).removeTranslationFromSaved();
        }
//        for (GoogleTranslateSavedTranslation translation: savedTranslationsList) {
//            translation.removeTranslationFromSaved();
//        }
    }

    @Override
    public boolean isSavedTranslationsListEmpty() {
        return savedTranslationsList.isEmpty();
    }
}
