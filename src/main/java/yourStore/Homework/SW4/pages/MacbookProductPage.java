package yourStore.Homework.SW4.pages;

import org.openqa.selenium.By;
import yourStore.Homework.SW4.utilities.Utility;

public class MacbookProductPage extends Utility {
    By path3 = By.xpath("//h1[contains(text(),'Shopping Cart')]");
    By cartButton = By.xpath("//button[@id='button-cart']");
    By path2 = By.xpath("//div[@class='alert alert-success alert-dismissible']");

    public void addToCart() {

        clickOnElement(cartButton);
    }

    public String getMessage1() {

        return getTextFromElement(path2);
    }

    public String getMessage2() {
        return
                getTextFromElement(path3);
    }
}


