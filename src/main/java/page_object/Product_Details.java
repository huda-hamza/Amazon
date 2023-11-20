package page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Product_Details extends Pagebase {
    public Product_Details(WebDriver driver) {
        super(driver);
    }

    private By Addtocart = By.id("add-to-cart-button");


    public void add_cart() {
        clickbtn(driver.findElement(Addtocart));
    }
}
