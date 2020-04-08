package uk.co.barclays.testsuite;

import org.testng.Assert;
import org.testng.annotations.Test;
import uk.co.barclays.pages.HomePage;
import uk.co.barclays.pages.LoginPage;
import uk.co.barclays.testbase.TestBase;

public class MouseHoverTest extends TestBase {
    //create object to get the property of homepage class
    HomePage homePage = new HomePage();
    // LoginPage loginPage = new LoginPage();

    @Test
    public void verifyUserShouldNotClickToBorrow() {

        homePage.mouseHoverbankDropDownLink();
        homePage.mouseHoverBorrowAndclickOnDropDownLink();
        }
}
