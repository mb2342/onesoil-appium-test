package tk.mdogx.onesoil.appium.test;

import org.testng.annotations.*;
import tk.mdogx.onesoil.appium.screens.*;

public class AuthorizationTest extends BaseTest {

    @Test
    public void authorizationToNewApp() {
        OnboardScreen onboardScreen = new OnboardScreen(driver);
        onboardScreen.waitForSplashScreenToBeNotPresent();
    }

}