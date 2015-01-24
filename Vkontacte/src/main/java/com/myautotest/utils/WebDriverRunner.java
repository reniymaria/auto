package com.myautotest.utils;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;

public class WebDriverRunner {
    private static final Logger log = LoggerFactory.getLogger(WebDriverRunner.class);
    private static FirefoxDriver driver;

    WebDriverRunner() {
        try {
            driver = new FirefoxDriver();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        } catch (Exception e) {
            log.error("Error while creating Web Driver", e);
        }
    }

    public static FirefoxDriver getDriver() {

        if (driver == null) {
            new WebDriverRunner();
        }
        return driver;
    }

    public static void stopWebDriver() {
        driver.quit();
    }
}
