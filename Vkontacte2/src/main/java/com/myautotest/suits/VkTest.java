package com.myautotest.suits;


import com.myautotest.screens.VkStartScreen;
import com.myautotest.utils.WebDriverRunner;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class VkTest {

    public static final String MAIN_PAGE_HEADER_TEXT ="Добро пожаловать";


    @Test(description = "Verify text")
    public void checkText(){

        VkStartScreen vkStartScreen = new VkStartScreen();
        Assert.assertEquals(vkStartScreen.getMainPageText(), MAIN_PAGE_HEADER_TEXT,
                "Header text not match with expected value");
    }


    @AfterTest
    public void tearDown() {
        //закрываем браузер. в этом случае обращаться к драйверу можно (но не напрямую, как видите)
        WebDriverRunner.stopWebDriver();
    }

}
