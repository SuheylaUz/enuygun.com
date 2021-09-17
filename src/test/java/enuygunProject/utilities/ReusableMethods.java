package enuygunProject.utilities;

import enuygunProject.pages.EnuygunPage;
import io.cucumber.java.eo.Se;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class ReusableMethods {

    public static void waitFor(int sec) {
        try {
            Thread.sleep(sec * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void select (WebElement webElement, String text){
        WebElement selectElement = webElement;
        Select select = new Select(selectElement);
        select.selectByVisibleText(text);
    }


}
