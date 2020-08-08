package tk.mdogx.onesoil.appium.screens;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import tk.mdogx.onesoil.appium.utils.WaitUtils;


public class BaseScreen{

    protected final AppiumDriver driver;
    protected WaitUtils waitUtils;

    protected BaseScreen(AppiumDriver driver) {
        this.driver = driver;
        waitUtils = new WaitUtils();
    }

    public void waitUntilDisplayed(WebElement element){
        waitUtils.waitForElementToBeVisible(element, driver);
        System.out.println(this.getClass().getSimpleName() + " is displayed");
    }
}
