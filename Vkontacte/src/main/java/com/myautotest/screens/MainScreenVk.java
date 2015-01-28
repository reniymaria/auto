package com.myautotest.screens;


import org.openqa.selenium.firefox.FirefoxDriver;

import com.myautotest.utils.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainScreenVk {

    protected FirefoxDriver driver;
    protected final Logger log = LoggerFactory.getLogger(MainScreenVk.class);

    public MainScreenVk() {
        driver = WebDriverRunner.getDriver();
    }

    public void closePage() {
        log.debug("Закрываем браузер.");
        WebDriverRunner.stopWebDriver();
    }
}

