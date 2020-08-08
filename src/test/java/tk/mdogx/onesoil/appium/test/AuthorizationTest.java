package tk.mdogx.onesoil.appium.test;

import org.testng.annotations.*;
import tk.mdogx.onesoil.appium.screens.*;
import tk.mdogx.onesoil.appium.screens.onboard.*;

public class AuthorizationTest extends BaseTest {

    @Parameters ({"os" , "android"})
    @Test
    public void authorizationToNewApp() {
        SplashScreen splashScreen = new SplashScreen(driver);
        splashScreen.tapOnLogoImage();

        OnboardScreen1 onboardScreen1 = new OnboardScreen1(driver);
        onboardScreen1.tapOnNextButton();

        OnboardScreen2 onboardScreen2 = new OnboardScreen2(driver);
        onboardScreen2.tapOnNextButton();

        OnboardScreen3Usertype onboardScreen3 = new OnboardScreen3Usertype(driver);
        onboardScreen3.enterOtherValue("a tester");
        onboardScreen3.tapOnNextButton();

        OnboardScreen4UVegetationIndexUpdate onboardScreen4 = new OnboardScreen4UVegetationIndexUpdate(driver);
        onboardScreen4.tapOnNotNowButton();

        OnboardScreen5AddFirstField onboardScreen5 = new OnboardScreen5AddFirstField(driver);
        onboardScreen5.tapOnSignInButton();

        LoginScreen loginScreen = new LoginScreen(driver);
        loginScreen.enterValidCredentials();
        loginScreen.tapOnSignInButton();

        MapScreen mapScreen = new MapScreen(driver);
        mapScreen.getMenu().tapOnProfileButton();

        ProfileScreen profileScreen = new ProfileScreen(driver);
        profileScreen.tapOnSignOutButton();
    }

}