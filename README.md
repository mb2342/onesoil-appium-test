# onesoil-appium-test
Test appium project for OneSoil

## Getting started
1. Install Appium, Android SDK and emulator e.g. Genymotion.
2. Connect an android device or setup an emulator and update configuration.properties.
3. Run the test.

## Features:
- Implemented a test for onboard screens, login to an existing account and sign out.
- Screen of the device is recorded while performing tests to mp4 file.
- Implemented Page object models for onboard, login, map, profile screens and menu panel.
- Test and devices settings are placed in a properties file.
- Added support for Android and iOS devices and emulators.

## TODO:
- change screen locators strategy from xpath to id (source code change is required).
- add parallel tests execution support.
- add logger support.
