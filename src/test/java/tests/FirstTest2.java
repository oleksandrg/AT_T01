package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.ToDoPage;

import java.util.concurrent.TimeUnit;

/**
 * Created by aleksandrg on 5/27/2015.
 */
public class FirstTest2 {

    WebDriver driver;

    ToDoPage objTodo;


    @Before
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application");
        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://todomvc.com/examples/troopjs_require/#/");

    }

    @Test
    public void createTask(){
        objTodo = new ToDoPage(driver);
        objTodo.addToDo("testnew");

    }

    @After
    public void close() throws Exception{
        driver.quit();
    }
}
