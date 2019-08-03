package com.BriteERP.pages;

import com.BriteERP.utilities.ConfigurationReader;
import com.BriteERP.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public WebDriver driver= Driver.getDriver();

    public LoginPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(id="login")
    public WebElement emailInput;// same as : driver.findElement(By.if("login");

    @FindBy(id="password")
    public WebElement passwordInput;

    @FindBy(css = "[type='submit']")
    public WebElement loginBtn;

    public void login(String email, String password) throws Exception {
        emailInput.sendKeys(ConfigurationReader.getProperty("email"));
        Thread.sleep(2000);
        passwordInput.sendKeys(ConfigurationReader.getProperty("password"));
        Thread.sleep(2000);

        loginBtn.click();
    }


}
