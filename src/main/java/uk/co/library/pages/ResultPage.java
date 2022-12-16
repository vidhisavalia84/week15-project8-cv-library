package uk.co.library.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import uk.co.library.utility.Utility;

public class ResultPage extends Utility {
  /*  Locators - resultText
    Method - verifyTheResults(String expected)*/

    @CacheLookup
    @FindBy(xpath = "//h1[@class='search-header__title']")
    WebElement resultText;

    ////h1[@class='search-header__title']
    public boolean verifyTheResults(String expected) {
        Reporter.log("Verify the result" + resultText.toString());
        String text = getTextFromElement(resultText);
        if (text.equals(expected)) {
            return true;
        }
        return false;
    }

    public String verifyTheResult() {
        return getTextFromElement(resultText);
    }
}
