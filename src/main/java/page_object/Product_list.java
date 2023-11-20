package page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Product_list extends Pagebase {
    public Product_list(WebDriver driver) {
        super(driver);
    }

    private By products = By.cssSelector(".s-card-container .a-price-whole");
    private By Nextbtn = By.xpath("//a[text()='Next']");
    private By Maxpage = By.cssSelector("[class='s-pagination-item s-pagination-disabled']");

    public void Cartload_less15K() throws InterruptedException {
        int lastPage = Integer.parseInt(driver.findElement(Maxpage).getText());
        for (int pageIndex = 0; pageIndex < lastPage; pageIndex++) {
            List<WebElement> elements = driver.findElements(products);
            for (int i = 0 ; i < elements.size(); i++) {
                //for (WebElement e : elements){
                WebElement element = elements.get(i);
                wait = new WebDriverWait(driver, Duration.ofSeconds(10));
                wait.until(ExpectedConditions.visibilityOf(element));
                int price = Integer.parseInt(element.getText().replaceAll(",", ""));
                if (price < 15000) {
                    System.out.println(price);
                    //list.add(e.getAttribute("href"));
                    System.out.println(element.getAttribute("href"));
                }
            }
            if (pageIndex < lastPage - 1) {
                movetoelement_Click(driver.findElement(Nextbtn));
            }
        }

        
    }
}





