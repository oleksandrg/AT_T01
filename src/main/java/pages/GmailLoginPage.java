package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by aleksandrg on 5/28/2015.
 */
public class GmailLoginPage {

    WebDriver driver;

    @FindBy (name = "Email")
    WebElement userEmail;

    @FindBy (id = "next")
    WebElement nextButton;

    @FindBy (id = "signIn")
    WebElement signInButton;

    @FindBy (name = "Passwd")
    WebElement userPasswd;

    public GmailLoginPage(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterUserEmail(String email){
        userEmail.sendKeys(email);
    }

    public void pressNext(){
        nextButton.sendKeys(Keys.ENTER);
    }


    public void pressSignIn(){
        signInButton.sendKeys(Keys.ENTER);
    }

    public void enterPassword(String password){
        userPasswd.sendKeys(password);
    }

    public GmailHomePage logIn(String login, String password){
        this.enterUserEmail(login);
        this.pressNext();
        this.enterPassword(password);
        this.pressSignIn();
        return new GmailHomePage(this.driver);
    }
}
