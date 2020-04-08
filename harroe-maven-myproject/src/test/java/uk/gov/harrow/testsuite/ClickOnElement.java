package uk.gov.harrow.testsuite;

import org.testng.annotations.Test;
import uk.gov.harrow.pages.HomePage;
import uk.gov.harrow.tasebase.TestBase;

public class ClickOnElement extends TestBase {
    HomePage homePage = new HomePage();


@Test
public void UserShouldNavigateAndClickOnRegister(){
    homePage.clickonElementLoginOrRegisterlink();
}
}