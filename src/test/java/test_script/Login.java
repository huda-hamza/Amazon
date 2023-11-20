package test_script;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import page_object.*;

public class Login extends Test_base {
    Menu_Page MenuObject;
    Home_Page HomeObject;
    VideosGame videoObject;
    ResultsPage_FreeAndNew resultObject;
    Product_list ProductObject;

    @DataProvider(name = "userdata")
    public Object[][] testdata() {

        return new Object[][]
                {
                        {"hamza.mhashem1509@gmail.com", "P@ssw0rd@1509"},
                };
    }

    @Test(dataProvider = "userdata", priority = 1)
    public void login(String email, String password) {
        HomeObject = new Home_Page(driver);
        HomeObject.Open_login_page(email, password);
    }

    @Test(dependsOnMethods = "login",priority = 2)
    public void open_hamburger() {
        MenuObject = new Menu_Page(driver);
        MenuObject.open_hambmenu();

    }

    @Test(dependsOnMethods = "open_hamburger",priority = 3)
    public void click_videogame() throws InterruptedException {
        MenuObject = new Menu_Page(driver);
        MenuObject.open_allvideo();

    }

    @Test(dependsOnMethods = "click_videogame")
    public void ClickFreeShipping() {
        videoObject = new VideosGame(driver);
        videoObject.click_Freeshipping();
        resultObject = new ResultsPage_FreeAndNew(driver);
        resultObject.selecthightolow();
    }

    @Test(dependsOnMethods = "ClickFreeShipping")
    public void Add_product() throws InterruptedException {
        ProductObject = new Product_list(driver);
        ProductObject.Cartload_less15K();
    }
}