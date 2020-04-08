package com.letscodeit.learn.testsuite;

import com.letscodeit.learn.pages.HomePage;
import com.letscodeit.learn.testbase.TestBase;
import org.testng.annotations.Test;

public class LoginOnTab extends TestBase {
    //create an object to used of HomePage
    HomePage homePage = new HomePage();


    @Test
    //this method test get the reult below
    public void UserShouldNavigateToPracticeLoginAndSignUpSucessfully(){
        homePage.clickOnLoginTab();

    }

}

