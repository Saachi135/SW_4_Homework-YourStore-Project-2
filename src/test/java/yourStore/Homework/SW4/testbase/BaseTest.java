package yourStore.Homework.SW4.testbase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import yourStore.Homework.SW4.propertyreader.PropertyReader;
import yourStore.Homework.SW4.utilities.Utility;

public class BaseTest extends Utility {
    String browser = PropertyReader.getInstance().getProperty("browser");

    @BeforeMethod
    public void setUp() {
        selectBrowser(browser);
    }

    @AfterMethod
    public void tearDown() {
        closeBrowser();
    }

}
