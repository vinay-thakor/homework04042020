package com.orangehrm.testsuite;

import com.orangehrm.pages.HomePage;
import com.orangehrm.testbase.TestBase;
import org.testng.annotations.Test;

public class ClickOnFeaTab extends TestBase {
    //create an object to use the property of HomePage
    HomePage homepage = new HomePage();

    @Test
    //create a method to action on it
    public void userSholdClickOnFeatureTabSuccessfully() {
        homepage.clickOnfeatureTab();

    }
}
