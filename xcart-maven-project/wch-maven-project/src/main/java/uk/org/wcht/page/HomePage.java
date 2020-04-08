package uk.org.wcht.page;

import org.openqa.selenium.By;
import uk.org.wcht.utility.Utility;

public class HomePage extends Utility {
    // get web element path store in By
    By yourHome = By.linkText("Your home");
    By aboutUs = By.linkText("About us");

    //for action create method to use it
    public void mouseHoverOnYour(){
        mouseHoverToElement(yourHome);
    }
    //for action create method to use it
    public void mouseHoverOnAboutUs(){
        mouseHoverToElement(aboutUs);
    }

}