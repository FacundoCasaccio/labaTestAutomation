package com.solvd.carina.demo.gui.pages;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.solvd.carina.demo.gui.components.AmazonFooter;
import com.solvd.carina.demo.gui.components.AmazonNavBar;
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
