package com.eliasnogueira.page.my;

import com.eliasnogueira.BaseWeb;
import com.eliasnogueira.data.dynamic.BookingDataFactory;
import com.eliasnogueira.driver.DriverManager;
import com.eliasnogueira.page.booking.AccountPage;
import com.eliasnogueira.page.booking.DetailPage;
import com.eliasnogueira.page.booking.RoomPage;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


import java.time.Duration;

import static org.assertj.core.api.Assertions.assertThat;

public class andouTest extends BaseWeb {

    @Test(description = "mon test")
    public void andoulunch() throws InterruptedException {
//       var bookingInformation = BookingDataFactory.createBookingData();

       var accountPage = new AccountPage();
        accountPage.next();

        var roomPage = new RoomPage();
        roomPage.next();

        var detailPage = new DetailPage();

        detailPage.finish();




        var andou=new Andou();

      andou.klclicknow("descriptionjfkjfdlfsdlshdlhjlffggfgdfgdf@Step");

        Thread.sleep(5000);


    }

}