package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.annotations.Test;

public class ComputerTest extends TestBase {
    //create copmterpage object to use of property of that class
    ComputerPage computerPage = new ComputerPage();


    @Test
    //create method to Build Computer and Add to cart
    public void UserShouldBuildComputeAndAddToCartSuccessfully() {
        computerPage.clickOnComputeTeg();
        computerPage.clickOnDesktopTag();
        computerPage.clickOnBuildYourOwnComputer();
        computerPage.clickOn400GbHD();
        computerPage.clickOnAddToCart();
    }
}

