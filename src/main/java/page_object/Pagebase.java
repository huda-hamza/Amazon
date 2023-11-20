package page_object;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Pagebase {

    protected WebDriver driver;
    WebDriverWait wait;
    Actions act;
    Select Selectvisible;

    public Pagebase(WebDriver driver) {
        this.driver = driver;
    }

    public void clickbtn(WebElement element) {

        element.click();
    }

    public void sendkeys(WebElement element, String value) {

        element.sendKeys(value);
    }

    public void waitingTillvisibility_click(WebElement element) {
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(element)).click();


    }

    public void movetoelement_Click(WebElement element) {
        act = new Actions(driver);
        act.moveToElement(element).click().perform();
    }

    public void SelectbVisible(WebElement element, String text) {
        Selectvisible = new Select(element);
        Selectvisible.selectByVisibleText(text);
    }


}
