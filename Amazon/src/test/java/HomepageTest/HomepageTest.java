package HomepageTest;

import Homepage.Homepage;
import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class HomepageTest extends WebAPI {
    static Homepage homepage;

    public static void getInitElements() {
        homepage = PageFactory.initElements(driver, Homepage.class);
    }

    @Test()
    public void TestLanguageMouseHoverandLanguageSelection(){
        getInitElements();
        homepage.mouseHoverLanguageMenu();

    }
    @Test()
    public void testAmazonSearchProduct(){
        getInitElements();
        homepage.searching_a_Product_in_AmazonSearchBar();
    }

}
