package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by aleksandrg on 5/26/2015.
 */
public class ToDoPage {
    WebDriver driver;

    @FindBy(id = "new-todo")
    WebElement newToDo;

    public ToDoPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterTodo(String toDoName){
        newToDo.sendKeys(toDoName);
    }

    public void submitTodo(){
        newToDo.sendKeys(Keys.ENTER);
    }

    public void addToDo(String toDoName){
        this.enterTodo(toDoName);
        this.submitTodo();
    }

}
