package com.eliasnogueira.page.my;

import com.eliasnogueira.page.booking.common.NavigationPage;
import io.qameta.allure.Step;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;


public class Andou extends NavigationPage {
   @FindBy(css = "textarea#description:not([style*='display:none'])")
    private WebElement firstclickdescription;



    @Step
    public void klclicknow(String mymessage) {
        firstclickdescription.sendKeys(mymessage);

    }

}
