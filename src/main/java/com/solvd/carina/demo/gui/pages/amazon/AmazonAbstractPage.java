package com.solvd.carina.demo.gui.pages.amazon;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.solvd.carina.demo.gui.components.amazon.AmazonFooter;
import com.solvd.carina.demo.gui.components.amazon.AmazonNavBar;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public abstract class AmazonAbstractPage extends AbstractPage {

    @FindBy(id = "navbar-main")
    protected AmazonNavBar navBar;

    @FindBy(id = "navFooter")
    protected AmazonFooter footer;

    public AmazonAbstractPage(WebDriver driver) {
        super(driver);
    }
}
