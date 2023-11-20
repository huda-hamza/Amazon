package page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Menu_Page extends Pagebase {

    public Menu_Page(WebDriver driver) {
        super(driver);

    }

    private By hamburgermenu = By.id("nav-hamburger-menu");

    private By SeeAll_btn = By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']");
    private By videoGame = By.xpath("//a[@data-menu-id='16']");
    private By Allvideogames = By.xpath("//a[@class='hmenu-item' and text()='All Video Games']");


    public void open_hambmenu() {
        clickbtn(driver.findElement(hamburgermenu));

    }

    public void open_allvideo() throws InterruptedException {
        waitingTillvisibility_click(driver.findElement(SeeAll_btn));
        waitingTillvisibility_click(driver.findElement(videoGame));
        movetoelement_Click(driver.findElement(Allvideogames));

    }
}
