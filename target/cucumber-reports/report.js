$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/stories/Login.feature");
formatter.feature({
  "line": 1,
  "name": "Doc990 GP Login page Verification",
  "description": "",
  "id": "doc990-gp-login-page-verification",
  "keyword": "Feature"
});
formatter.scenario({
  "comments": [
    {
      "line": 3,
      "value": "#Unsuccessful Login using invalid username and valid password"
    }
  ],
  "line": 4,
  "name": "Unsuccessful Login using invalid username and valid password",
  "description": "",
  "id": "doc990-gp-login-page-verification;unsuccessful-login-using-invalid-username-and-valid-password",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "Open the browser and launch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Enter a invalid Username \"ExampleUsername\" and valid password \"Test@123\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Click on Sign in Button",
  "keyword": "And "
});
formatter.match({
  "location": "SignupSteps.open_the_browser_and_launch_the_url()"
});
formatter.result({
  "duration": 11749959200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ExampleUsername",
      "offset": 26
    },
    {
      "val": "Test@123",
      "offset": 63
    }
  ],
  "location": "LoginSteps.enter_a_invalid_Username_and_valid_password(String,String)"
});
formatter.result({
  "duration": 5828490600,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.click_LogIn()"
});
formatter.result({
  "duration": 113283500,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 8,
      "value": "#   Then Verify Error Message in invalid username and valid password"
    },
    {
      "line": 10,
      "value": "#Unsuccessful Login using valid username and invalid Password"
    }
  ],
  "line": 11,
  "name": "Unsuccessful Login using valid username and invalid Password",
  "description": "",
  "id": "doc990-gp-login-page-verification;unsuccessful-login-using-valid-username-and-invalid-password",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 12,
  "name": "Open the browser and launch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "Enter a valid username \"AdminUser\" and invalid password \"ExamplePassword\"",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "Click on Sign in Button",
  "keyword": "And "
});
formatter.match({
  "location": "SignupSteps.open_the_browser_and_launch_the_url()"
});
formatter.result({
  "duration": 5244037200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "AdminUser",
      "offset": 24
    },
    {
      "val": "ExamplePassword",
      "offset": 57
    }
  ],
  "location": "LoginSteps.enter_a_valid_username_and_invalid_password(String,String)"
});
formatter.result({
  "duration": 5225129100,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.click_LogIn()"
});
formatter.result({
  "duration": 67387400,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 15,
      "value": "#  Then Verify Error Message in valid username and invalid Password"
    },
    {
      "line": 17,
      "value": "#Empty username with password"
    }
  ],
  "line": 18,
  "name": "Empty username with password",
  "description": "",
  "id": "doc990-gp-login-page-verification;empty-username-with-password",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 19,
  "name": "Open the browser and launch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "Enter empty username \" \" and password \"Test@123\"",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "Click on Sign in Button",
  "keyword": "And "
});
formatter.match({
  "location": "SignupSteps.open_the_browser_and_launch_the_url()"
});
formatter.result({
  "duration": 5056103600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": " ",
      "offset": 22
    },
    {
      "val": "Test@123",
      "offset": 39
    }
  ],
  "location": "LoginSteps.enter_empty_username_and_password_Test(String,String)"
});
formatter.result({
  "duration": 5163419100,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.click_LogIn()"
});
formatter.result({
  "duration": 48339800,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 22,
      "value": "#  Then Verify Error Message in Empty username with password"
    },
    {
      "line": 24,
      "value": "#Empty password and Username"
    }
  ],
  "line": 25,
  "name": "Empty password and Username",
  "description": "",
  "id": "doc990-gp-login-page-verification;empty-password-and-username",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 26,
  "name": "Open the browser and launch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 27,
  "name": "Enter empty Password \"Test@123\" and Username \"\"",
  "keyword": "When "
});
formatter.step({
  "line": 28,
  "name": "Click on Sign in Button",
  "keyword": "And "
});
formatter.match({
  "location": "SignupSteps.open_the_browser_and_launch_the_url()"
});
formatter.result({
  "duration": 5120324400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Test@123",
      "offset": 22
    },
    {
      "val": "",
      "offset": 46
    }
  ],
  "location": "LoginSteps.enter_empty_Password_and_Username(String,String)"
});
formatter.result({
  "duration": 5142871200,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.click_LogIn()"
});
formatter.result({
  "duration": 55995600,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 29,
      "value": "#  Then Verify Error Message in Empty Password with Username"
    },
    {
      "line": 31,
      "value": "#Empty Username and Empty Password"
    }
  ],
  "line": 32,
  "name": "Empty Username and Empty Password",
  "description": "",
  "id": "doc990-gp-login-page-verification;empty-username-and-empty-password",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 33,
  "name": "Open the browser and launch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 34,
  "name": "Enter empty Username \"\" and Password \"\"",
  "keyword": "When "
});
formatter.step({
  "line": 35,
  "name": "Click on Sign in Button",
  "keyword": "And "
});
formatter.match({
  "location": "SignupSteps.open_the_browser_and_launch_the_url()"
});
formatter.result({
  "duration": 5122130500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 22
    },
    {
      "val": "",
      "offset": 38
    }
  ],
  "location": "LoginSteps.enter_empty_Username_and_Password(String,String)"
});
formatter.result({
  "duration": 3101129600,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.click_LogIn()"
});
formatter.result({
  "duration": 59022900,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 36,
      "value": "#  Then Verify Error Message in Empty Username and Empty Password"
    },
    {
      "line": 38,
      "value": "#Check on the Click eye icon entered password should be visible in a readable format"
    }
  ],
  "line": 39,
  "name": "Verify the Click eye icon entered password should be visible in a readable format",
  "description": "",
  "id": "doc990-gp-login-page-verification;verify-the-click-eye-icon-entered-password-should-be-visible-in-a-readable-format",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 40,
  "name": "Open the browser and launch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 41,
  "name": "Enter a valid Username \"AdminUser\" and valid \"Test@123\"",
  "keyword": "When "
});
formatter.step({
  "line": 42,
  "name": "Click on eye icon",
  "keyword": "Then "
});
formatter.step({
  "line": 43,
  "name": "Click on Sign in Button",
  "keyword": "And "
});
formatter.match({
  "location": "SignupSteps.open_the_browser_and_launch_the_url()"
});
formatter.result({
  "duration": 5117551000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "AdminUser",
      "offset": 24
    },
    {
      "val": "Test@123",
      "offset": 46
    }
  ],
  "location": "LoginSteps.enter_a_valid_Username_and_valid(String,String)"
});
formatter.result({
  "duration": 3160657600,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.click_on_eye_icon()"
});
formatter.result({
  "duration": 5052699200,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.click_LogIn()"
});
formatter.result({
  "duration": 45437300,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 45,
      "value": "#loging in to the BAP project in registered user"
    }
  ],
  "line": 46,
  "name": "Verification of successful log In",
  "description": "",
  "id": "doc990-gp-login-page-verification;verification-of-successful-log-in",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 47,
  "name": "Open the browser and launch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 48,
  "name": "Enter for login as \"AdminUser\"",
  "keyword": "When "
});
formatter.step({
  "line": 49,
  "name": "Enter for password as \"Test@123\"",
  "keyword": "And "
});
formatter.step({
  "line": 50,
  "name": "Click on Sign in Button",
  "keyword": "And "
});
formatter.match({
  "location": "SignupSteps.open_the_browser_and_launch_the_url()"
});
formatter.result({
  "duration": 5142728600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "AdminUser",
      "offset": 20
    }
  ],
  "location": "LoginSteps.enter_for_login_as(String)"
});
formatter.result({
  "duration": 30078739400,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//input[@data-placeholder\u003d\u0027Username\u0027]\"}\n  (Session info: chrome\u003d122.0.6261.95)\nFor documentation on this error, please visit: https://www.selenium.dev/documentation/webdriver/troubleshooting/errors#no-such-element-exception\nBuild info: version: \u00274.11.0\u0027, revision: \u0027040bc5406b\u0027\nSystem info: os.name: \u0027Windows 11\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002711.0.21\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCommand: [083311ce0a59dc32013601c103742d1d, findElement {using\u003dxpath, value\u003d//input[@data-placeholder\u003d\u0027Username\u0027]}]\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 122.0.6261.95, chrome: {chromedriverVersion: 122.0.6261.94 (880dbf29479c..., userDataDir: C:\\Users\\SUNETH~1\\AppData\\L...}, fedcm:accounts: true, goog:chromeOptions: {debuggerAddress: localhost:51074}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: windows, proxy: Proxy(), se:cdp: ws://localhost:51074/devtoo..., se:cdpVersion: 122.0.6261.95, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}\nSession ID: 083311ce0a59dc32013601c103742d1d\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:200)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:133)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:52)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:191)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.invokeExecute(DriverCommandExecutor.java:196)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:171)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:518)\r\n\tat org.openqa.selenium.remote.ElementLocation$ElementFinder$2.findElement(ElementLocation.java:165)\r\n\tat org.openqa.selenium.remote.ElementLocation.findElement(ElementLocation.java:59)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:355)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:349)\r\n\tat com.wavenet.pages.Login.enter_for_login_as(Login.java:75)\r\n\tat com.wavenet.stepDefinition.LoginSteps.enter_for_login_as(LoginSteps.java:20)\r\n\tat ✽.When Enter for login as \"AdminUser\"(src/test/resources/stories/Login.feature:48)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "Test@123",
      "offset": 23
    }
  ],
  "location": "LoginSteps.enter_for_password_as(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginSteps.click_LogIn()"
});
formatter.result({
  "status": "skipped"
});
});