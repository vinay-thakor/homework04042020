package com.letscodeit.learn.pages;

import com.letscodeit.learn.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    // find the element and store in the veriable
    By login = By.xpath("//a[@class='navbar-link fedora-navbar-link']");

    //this method will use the above link
    public void clickOnLoginTab() {
        clickOnElement(login);
    }
}
