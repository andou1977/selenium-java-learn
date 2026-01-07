package com.eliasnogueira.page.my;

import com.eliasnogueira.page.booking.common.NavigationPage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Andoufamily extends NavigationPage {

    @FindBy(name = "next")
    private WebElement clickablenow;

    @FindBy(xpath = "(//h4[@class='info-text'])[3]")
    private WebElement thetitle;


    @Step
    public void myclick(){
        clickablenow.click();
    }

    @Step
    public String mygettitle(){
       return thetitle.getText();
    }
}
