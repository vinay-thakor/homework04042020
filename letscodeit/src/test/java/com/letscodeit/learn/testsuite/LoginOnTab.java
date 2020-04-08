package com.letscodeit.learn.testsuite;

import com.letscodeit.learn.pages.HomePage;
import com.letscodeit.learn.testbase.TestBase;
import org.testng.annotations.Test;

public class LoginOnTab extends TestBase {
    HomePage homePage = new HomePage();


    @Test
    public void UserShouldNavigateToPracticeLoginAndSignUpSucessfully(){
       // homePage.mouseHoverOnLoginTab();
       // homePage.mouseHoverOnSignUpTab();
        homePage.clickOnLoginTab();

    }

}

