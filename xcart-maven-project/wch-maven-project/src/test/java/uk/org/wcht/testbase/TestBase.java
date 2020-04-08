package uk.org.wcht.testbase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import uk.org.wcht.basepage.BasePage;
import uk.org.wcht.browserselector.BrowserSelector;

import java.util.concurrent.TimeUnit;

public class TestBase extends BasePage {
    BrowserSelector browserSelector = new BrowserSelector();
    //create baseUrl veriable to which website to open
    String baseUrl = "https://www.wcht.org.uk";
    //this method will run before any test
    @BeforeMethod
    public void openBrowser() {
        browserSelector.selectBrowser("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get(baseUrl);
    }
    // this method will close after test finished
    @AfterMethod
    public void tearDown() {
        driver.quit();

    }
}
