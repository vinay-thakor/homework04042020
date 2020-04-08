package uk.co.barclays.testbase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import uk.co.barclays.basepage.BasePage;
import uk.co.barclays.browserselector.BrowserSelector;

import java.util.concurrent.TimeUnit;

public class TestBase extends BasePage {
    BrowserSelector browserSelector = new BrowserSelector();
    String baseUrl = "https://www.barclays.co.uk/";

    @BeforeMethod
    public void openBrowser(){
        browserSelector.selectBrowser("chrome");

        driver .manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(baseUrl);
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
