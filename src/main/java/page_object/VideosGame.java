package page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static java.awt.SystemColor.window;

public class VideosGame extends Pagebase {

    private By Freeshipping = By.id("apb-browse-refinements-checkbox_2");
    private By newcondition = By.xpath("//span[@class='a-size-base a-color-base' and text()='New']");

    public VideosGame(WebDriver driver) {
        super(driver);
    }


    public void click_Freeshipping() {

        movetoelement_Click(driver.findElement(Freeshipping));
        movetoelement_Click(driver.findElement(newcondition));
    }

}
