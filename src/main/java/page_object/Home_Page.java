package page_object;

import net.bytebuddy.implementation.bind.annotation.Super;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home_Page extends Pagebase {

    public Home_Page(WebDriver driver) {
        super(driver);

    }

    private By loginbtn = By.id("nav-link-accountList-nav-line-1");

    private By email = By.id("ap_email");
    private By continuButton = By.id("continue");
    private By password = By.id("ap_password");
    private By signinbutton = By.id("signInSubmit");


    public void Open_login_page(String emailname, String Pw) {
        clickbtn(driver.findElement(loginbtn));
        sendkeys(driver.findElement(email), emailname);
        clickbtn(driver.findElement(continuButton));
        sendkeys(driver.findElement(password), Pw);
        clickbtn(driver.findElement(signinbutton));

    }


}
