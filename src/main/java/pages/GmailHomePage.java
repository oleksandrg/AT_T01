package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by aleksandrg on 5/28/2015.
 */
public class GmailHomePage {

    WebDriver driver;

    @FindBy (css = "div[gh='cm']")
    WebElement composeButton;

    @FindBy (name = "to")
    WebElement toLine;

    @FindBy (css = "div[aria-label='Message Body']")
    WebElement emailText;

    @FindBy (css = "div[data-tooltip='Send ‪(Ctrl-Enter)‬']")
    WebElement sendButton;

    @FindBy (name = "subjectbox")
    WebElement subject;

    @FindBy (css = "[href*='/profiles.google.com/?hl=en']")
    WebElement userName;

    public GmailHomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public Boolean getUserNameVisible() {
        return  userName.isDisplayed();
    }

    public void pressCompose(){
        composeButton.sendKeys(Keys.ENTER);
    }

    public void enterEmail(String email){
        toLine.sendKeys(email);
    }

    public void enterSubject(String subjectText){
        subject.sendKeys(subjectText);
    }

    public void enterEmailTesxt(String text){
        emailText.sendKeys(text);
    }

    public void pressSend(){
        sendButton.sendKeys(Keys.ENTER);
    }

    public void sendEmail(String to, String subject, String text){
        this.pressCompose();
        this.enterEmail(to);
        this.enterSubject(subject);
        this.enterEmailTesxt(text);
        this.pressSend();
    }
}
