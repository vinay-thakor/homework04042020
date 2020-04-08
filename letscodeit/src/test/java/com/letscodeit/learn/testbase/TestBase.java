package com.letscodeit.learn.testbase;

import com.letscodeit.learn.basepage.BasePage;
import com.letscodeit.learn.browserselector.BrowserSelector;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase extends BasePage {
    BrowserSelector browserSelector = new BrowserSelector();
    String baseUrl = "https://learn.letskodeit.com/";

    @BeforeMethod
    public void openBrowser() throws InterruptedException {
        browserSelector.selectBrowser("chrome");
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(baseUrl);
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}



