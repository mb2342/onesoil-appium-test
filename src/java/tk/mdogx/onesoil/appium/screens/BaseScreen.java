package tk.mdogx.onesoil.appium.screens;

import io.appium.java_client.AppiumDriver;
import tk.mdogx.onesoil.appium.utils.WaitUtils;


public class BaseScreen {

    protected final AppiumDriver driver;
    WaitUtils waitUtils;

    protected BaseScreen(AppiumDriver driver) {
        this.driver = driver;
        waitUtils = new WaitUtils();
    }

}
