package com.orangehrm.testsuite;

import com.orangehrm.pages.HomePage;
import com.orangehrm.testbase.TestBase;
import org.testng.annotations.Test;

public class ClickOnFeaTab extends TestBase {

    HomePage homepage = new HomePage();

    @Test
    public void userSholdClickOnFeatureTabSuccessfully() {
        homepage.clickOnfeatureTab();

    }
}
