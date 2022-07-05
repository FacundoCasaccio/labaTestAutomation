package com.solvd.carina.demo;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.solvd.carina.demo.mobile.gui.pages.common.googleTranslate.GoogleTranslateHomePageBase;
import com.solvd.carina.demo.mobile.gui.pages.common.googleTranslate.GoogleTranslateSavedPageBase;
import com.solvd.carina.demo.mobile.gui.pages.common.googleTranslate.GoogleTranslateSearchTranslationPageBase;
import com.solvd.carina.demo.mobile.gui.pages.common.googleTranslate.GoogleTranslateTranslationPageBase;
import com.solvd.carina.demo.mobile.gui.pages.common.googleTranslate.components.GoogleTranslateTranslationKebabMenuBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTranslateTest implements IAbstractTest {

    @Test
    public void reverseTranslateTest() {
        GoogleTranslateHomePageBase homePage = initPage(GoogleTranslateHomePageBase.class);
        GoogleTranslateSearchTranslationPageBase searchTranslationPage = homePage.tapTranslationInputField();
        GoogleTranslateTranslationPageBase translationPage = searchTranslationPage.searchTranslation("Hello World");
        Assert.assertTrue(translationPage.inputAndOutputMatches("Hello World", "Hola Mundo"), "Fields don't match");

        GoogleTranslateTranslationKebabMenuBase kebabMenu = translationPage.tapKebabMenuIcon();
        kebabMenu.tapReverseTranslate();
        Assert.assertTrue(translationPage.inputAndOutputMatches("Hola Mundo", "Hello World"), "Fields don't match");
    }

    @Test
    public void saveAndRemoveTranslationTest() {
        GoogleTranslateHomePageBase homePage = initPage(getDriver(), GoogleTranslateHomePageBase.class);
        GoogleTranslateSearchTranslationPageBase searchTranslationPage = homePage.tapTranslationInputField();
        GoogleTranslateTranslationPageBase translationPage = searchTranslationPage.searchTranslation("Hello World");
        Assert.assertTrue(translationPage.inputAndOutputMatches("Hello World", "Hola Mundo"), "Fields don't match");

        GoogleTranslateTranslationKebabMenuBase kebabMenu = translationPage.tapKebabMenuIcon();
        kebabMenu.tapAddToPhrasebook();
        homePage = translationPage.tapGoBackArrowButton();

        GoogleTranslateSavedPageBase savedTranslation = homePage.tapSavedTranslationsStarIcon();
        Assert.assertFalse(savedTranslation.isSavedTranslationsListEmpty(), "No saved translations found");

        savedTranslation.removeSavedTranslations();
        Assert.assertTrue(savedTranslation.isSavedTranslationsListEmpty(), "Saved translations list is not empty");
    }
}
