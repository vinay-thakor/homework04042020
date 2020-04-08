package uk.gov.harrow.pages;

import org.openqa.selenium.By;

import uk.gov.harrow.Utility.Utilites;


public class HomePage extends Utilites {
    By loginRegistlink = By.className("icon-fallback");

    public void  clickonElementLoginOrRegisterlink()
    {
        clickOnElement(loginRegistlink);
    }


}
