package com.eliasnogueira.page.my;

import com.eliasnogueira.BaseWeb;
import com.eliasnogueira.page.booking.AccountPage;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class andoufamilyTest extends BaseWeb {


    @Test(description = "mon test")
    public void andoulunch() throws InterruptedException {

        var accountPage = new AccountPage();
        accountPage.next();



        var andoufamilynow=new Andoufamily();
        andoufamilynow.myclick();

        assertThat(andoufamilynow.mygettitle()).isEqualTo("Drop us a small description.");


    }



}