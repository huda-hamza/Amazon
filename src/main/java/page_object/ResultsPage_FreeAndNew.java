package page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ResultsPage_FreeAndNew extends Pagebase {

    private By sort = By.id("s-result-sort-select");

    public ResultsPage_FreeAndNew(WebDriver driver) {
        super(driver);
    }

    public void selecthightolow() {
        SelectbVisible((driver.findElement(sort)), "Price: High to Low");
    }
}
