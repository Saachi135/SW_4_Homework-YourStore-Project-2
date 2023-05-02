package yourStore.Homework.SW4.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import yourStore.Homework.SW4.utilities.Utility;

import java.util.List;

public class ComponentsPage extends Utility {
    By path = By.xpath("//nav[@id='menu']//ul/li[contains(@class, 'open')]/div/child::*");

    public void selectMenu(String menu) {
        List<WebElement> topMenuList = getListOfElements(path);
        try {
            for (WebElement element : topMenuList) {
                if (element.getText().equalsIgnoreCase(menu)) {
                    element.click();
                }
            }
        } catch (StaleElementReferenceException e) {
            topMenuList = getListOfElements(path);
        }
    }

}
