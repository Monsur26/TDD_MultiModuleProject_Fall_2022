package Homepage;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static WebElementsHomePage.WebElements.*;

public class Homepage extends WebAPI {

    //Getting all the WebElemnts Ready
    @FindBy (how = How.XPATH, using = ENMousehoverXpath) public WebElement ENMouseHover;
    @FindBy(how = How.XPATH, using = ESMouseHoverXpath ) public WebElement ESMouseHover;
    @FindBy(how = How.XPATH, using = ENRadioButtonXpath ) public WebElement ENRadioButton;
    @FindBy(how = How.XPATH, using = ESRadioButtonXpath ) public WebElement ESRadioButton;
    @FindBy(css = amazonSearchBarCSS) public WebElement amazonSearchBarLocator;

    // This is the same thing as WebElement element=driver.findElement(By.CSS(""));


    //All the steps associated with diffferent test cases
     public void languageENHover(){mouseHover(ENMouseHover);}
     public void ESRadioButtonClick(){ESRadioButton.click();}
     public void languageESHover(){mouseHover(ESMouseHover);}
     public void ENRadioButtonClick(){ENRadioButton.click();}
     public void enterProductNameonSearchBar(String productName){amazonSearchBarLocator.sendKeys(productName);}
     public void submitForSearchResult(){amazonSearchBarLocator.submit();}


     //Test Cases
    /**
     *
     */
    public void mouseHoverLanguageMenu(){
        // Hovering over language menu option where it says EN(means language is English)
       // mouseHover(ENMouseHover);
        languageENHover();

        // After mover Radio button option pops up, we aare chosing Spanish language Radio Button
        ESRadioButtonClick();

        // After that we are hovering over the language menu again where it says ES(Spnanish)
        languageESHover();

        //Changing language by clicking English Radio Button
        ENRadioButtonClick();
    }

    /**
     * This is a test case for searching a product from the search bar of amazon homepage
     */
    public void searching_a_Product_in_AmazonSearchBar(){
        // entering product name in the search bar
        enterProductNameonSearchBar("Chair");

        // searching for the product
        submitForSearchResult();
    }

}
