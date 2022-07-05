package com.solvd.carina.demo.gui.components.amazon;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import com.solvd.carina.demo.gui.pages.amazon.AmazonConditionsOfUsePage;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class AmazonFooter extends AbstractUIObject {

    @FindBy(xpath = ".//a[contains(text(),'Conditions of Use')]")
    private ExtendedWebElement conditionsOfUseLink;


    public AmazonFooter(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public AmazonConditionsOfUsePage clickConditionsOfUseLink() {
        conditionsOfUseLink.click();
        return new AmazonConditionsOfUsePage(driver);
    }
}
