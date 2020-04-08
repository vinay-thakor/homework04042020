package com.letscodeit.learn.pages;

import com.letscodeit.learn.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By login = By.xpath("//a[@class='navbar-link fedora-navbar-link']");


    public void clickOnLoginTab() {
        clickOnElement(login);
    }
}
