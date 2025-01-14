package com.wavenet.util;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.concurrent.TimeUnit;

public class InitializeDriver {
    public static WebDriver driver;
    public static InitializeDriver initializeDriver;
    private Config config = new Config();
    String osVersion = config.getOsVersion();

    private InitializeDriver() {getInitializeDriver();}

    public static InitializeDriver getInstance() {
        if (initializeDriver == null) {
            initializeDriver = new InitializeDriver();
        }
        return initializeDriver;
    }

    private void getInitializeDriver() {

//        String userDir = System.getProperty("user.dir");
//        System.setProperty("webdriver.chrome.driver",userDir + "/src/main/resources/Drivers/chromedriver");
//        driver = new ChromeDriver();
//        driver.getCurrentUrl();

//                String userDir = System.getProperty("user.dir");
//                System.setProperty("webdriver.chrome.driver",userDir + "/src/main/resources/Drivers/chromedriver");
//                driver = new ChromeDriver();

        switch (osVersion) {
            case "windows":
                String userDir = System.getProperty("user.dir");
                //System.setProperty("webdriver.chrome.driver",userDir + "/src/main/resources/Drivers/chromedriver.exe");
                WebDriverManager.chromedriver().setup();
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("----headless");
                driver = new ChromeDriver();
                DesiredCapabilities dc = new DesiredCapabilities();
                dc.setCapability(CapabilityType.UNHANDLED_PROMPT_BEHAVIOUR, UnexpectedAlertBehaviour.IGNORE);
                driver.manage().window().maximize();
                //driver = new ChromeDriver(dc);
                System.out.println("Initialize Browser : Browser is initialized");

                break;
            case "linux":
                //  System.setProperty("webdriver.chrome.driver", userDir + "/src/main/resources/Drivers/linux/chromedriver");
                System.setProperty("webdriver.chrome.driver","resources/Drivers/linux/chromedriver.exe");
                ChromeOptions chromeOption = new ChromeOptions();
                chromeOption.addArguments("--headless");
                //driver = new ChromeDriver();
                System.out.println("Initialize Browser: Browser is initalized");
                break;
        }


    }

    public WebDriver getDriver() {
        return driver;
    }

    @Before
    public void openBrowser() {

        // driver.get(url);
        driver.switchTo().alert().accept();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println("openBrowser: Browser is opened");
    }

    @After
    public void closeBrowser() {
        driver.switchTo().alert().accept();
        driver.quit();
        System.out.println("closeBrowser: Browser is closed");
    }
}

