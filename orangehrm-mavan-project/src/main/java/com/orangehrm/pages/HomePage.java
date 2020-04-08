package com.orangehrm.pages;

import com.orangehrm.basepage.BasePage;
import com.orangehrm.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By feature = By.className("link");


    public void clickOnfeatureTab(){
        clickOnElement(feature);
    }
}
