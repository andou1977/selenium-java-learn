package com.eliasnogueira.page.my;

import com.eliasnogueira.BaseWeb;
import com.eliasnogueira.page.booking.AccountPage;
import com.eliasnogueira.page.booking.DetailPage;
import com.eliasnogueira.page.booking.RoomPage;
import org.testng.annotations.Test;



public class andouTest extends BaseWeb {

    @Test(description = "mon test")
    public void andoulunch() throws InterruptedException {

       var accountPage = new AccountPage();
        accountPage.next();

        var roomPage = new RoomPage();
        roomPage.next();

        var detailPage = new DetailPage();

        detailPage.finish();




        var andou=new Andou();

      andou.klclicknow("Welcome to Paris");

        Thread.sleep(2000);


    }

}