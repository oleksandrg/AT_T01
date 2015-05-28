package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by aleksandrg on 5/28/2015.
 */
public class GmailHomePage {

    WebDriver driver;

    @FindBy (css = "[href*='/profiles.google.com/?hl=en']")
    WebElement userName;

    public GmailHomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public Boolean  getUserNameVisible() {
        return  userName.isDisplayed();
    }

}
