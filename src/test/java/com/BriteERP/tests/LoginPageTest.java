package com.BriteERP.tests;

import com.BriteERP.pages.*;
import com.BriteERP.utilities.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {

    LoginPage loginPage = new LoginPage();

    @Test
    public void loginTest() throws Exception { //why 73?
        loginPage.login("email", "password");
        Thread.sleep(3000);
        Assert.assertTrue(driver.findElement(By.className("oe_menu_text")).isDisplayed());
    }



}
