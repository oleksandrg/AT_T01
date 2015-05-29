package tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pages.GmailHomePage;
import pages.GmailLoginPage;

import java.util.concurrent.TimeUnit;

/**
 * Created by aleksandrg on 5/28/2015.
 */
public class TestLoginGmail {
    WebDriver driver;

    @Before
    public void setup(){
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().to("https://mail.google.com/");
    }


    @Test
    public void AloginIn(){
        GmailLoginPage loginPage = new GmailLoginPage(driver);
        GmailHomePage homePage = loginPage.logIn("at.test.ag", "test13test");
        Assert.assertTrue(homePage.getUserNameVisible());
        homePage.sendEmail("test@test.com", "text", "text2");
    }



    @After
    public void end() throws Exception{
        //Thread.sleep(5000);
        //driver.quit();
    }
}
