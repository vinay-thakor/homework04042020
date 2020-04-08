package uk.org.wcht.testsuite;

import org.testng.annotations.Test;
import uk.org.wcht.page.HomePage;
import uk.org.wcht.testbase.TestBase;

public class MouseHoverOnYourHomeAndAboutUs extends TestBase {
    //create object of HomePage to get the property of the class
    HomePage homePage = new HomePage();

    @Test
    //create a method to action on it, it will mouse hover your home
    public void mouseHovOnYourHome() {
        homePage.mouseHoverOnYour();

    }
    //create a method to action on it, it will mouse hover on about us
    public void MouseHovOnAboutUs(){
        homePage.mouseHoverOnAboutUs();
    }
}