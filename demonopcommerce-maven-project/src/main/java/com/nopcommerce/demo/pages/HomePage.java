package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    //find the all the element links and store in the variable
    By loginlink = By.linkText("Log in");
    By registerlink = By.xpath("//a[@class='ico-register']");
    By computerlink = By.linkText("Compute");

    //create method to what to do with the above link
    public void clickOnLoginLink(){
        clickOnElement(loginlink);
    }

    public void clickOnRegisterLink(){
        clickOnElement(registerlink);
    }


    public void clickOnComputerLink() {
        clickOnElement(computerlink);
    }

}