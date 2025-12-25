package com.eliasnogueira.page.my;

import com.eliasnogueira.driver.DriverManager;
import com.eliasnogueira.page.booking.common.NavigationPage;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Andou extends NavigationPage {
   @FindBy(css = "textarea#description:not([style*='display:none'])")
    private WebElement firstclickdescription;



    @Step
    public void klclicknow(String mymessage) {


        firstclickdescription.sendKeys(mymessage);

    }

}
