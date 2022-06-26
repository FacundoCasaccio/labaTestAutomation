package com.solvd.carina.demo;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.solvd.carina.demo.gui.pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AmazonTest implements IAbstractTest {

    @Test
    public void testConditionsOfUseLink() {
        AmazonHomePage homePage = new AmazonHomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened());

        AmazonConditionsOfUsePage conditionsOfUsePage = homePage.navigateToConditionsOfUsePage();
        Assert.assertTrue(conditionsOfUsePage.isConditionsOfUseTitlePresent());
    }

    @Test
    public void testAccountCreationPuzzlePage() {
        AmazonHomePage homePage = new AmazonHomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened());
        homePage.scrollToBottom();

        AmazonCreateAccountPage createAccountPage = homePage.clickStartHereLink();
        Assert.assertTrue(createAccountPage.isCreateAccountTitlePresent());
        createAccountPage.typeCustomerName();
        createAccountPage.typeEmailRandom();
        createAccountPage.typePassword();
        createAccountPage.typeReEnterPassword();

        AmazonPuzzlePage puzzlePage = createAccountPage.clickContinueButton();
        Assert.assertTrue(puzzlePage.puzzlePageInstructionsAreShowed());
    }

    @Test
    public void testEmailAlreadyInUseValidation() {
        AmazonHomePage homePage = new AmazonHomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened());
        homePage.scrollToBottom();

        AmazonCreateAccountPage createAccountPage = homePage.clickStartHereLink();
        Assert.assertTrue(createAccountPage.isCreateAccountTitlePresent());
        createAccountPage.typeCustomerName();
        createAccountPage.typeEmail();
        createAccountPage.typePassword();
        createAccountPage.typeReEnterPassword();

        AmazonEmailAlreadyInUsePage emailAlreadyInUsePage = createAccountPage.clickVerifyEmailButton();
        Assert.assertTrue(emailAlreadyInUsePage.isEmailAlreadyInUseAlertPresent());
    }

    @Test
    public void testCustomerReviewsForTodaysDealsProduct() {
        AmazonHomePage homePage = new AmazonHomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened());

        AmazonTodaysDealsPage todaysDealsPage = homePage.navigateToTodaysDealsPage();
        Assert.assertTrue(todaysDealsPage.isPageTitleCorrect());

        AmazonProductPostPage productPostPage = todaysDealsPage.navigateToProductPage(0);
        Assert.assertTrue(productPostPage.isProductTitlePresent());

        AmazonProductReviewsPage productReviewsPage = productPostPage.clickSeeAllReviewsLink();
        Assert.assertTrue(productReviewsPage.isCustomerReviewsTitlePresent());
    }

    @Test
    public void testSignInPageViaCart() {
        AmazonHomePage homePage = new AmazonHomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened());

        AmazonCartPage cartPage = homePage.navigateToCartPage();
        Assert.assertTrue(cartPage.isCartPageTitleCorrect(), "Cart page didn't open correctly");

        AmazonSignInPage signInPage = cartPage.clickSignInToYourAccountButton();
        Assert.assertTrue(signInPage.isSignInTitlePresent());
    }
}
