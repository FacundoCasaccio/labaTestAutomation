package com.solvd.carina.demo.gui.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class AmazonPuzzlePage extends AmazonAbstractPage{

    @FindBy(xpath = "//span[contains(text(),'Solve this puzzle to protect your account')]")
    private ExtendedWebElement puzzlePageInstructions;

    public AmazonPuzzlePage(WebDriver driver) {
        super(driver);
    }

    public boolean puzzlePageInstructionsAreShowed() {
        return puzzlePageInstructions.isElementPresent();
    }
}
