package com.myautotest.suits;


import com.myautotest.screens.LoginPageScreen;
import com.myautotest.screens.VkStartScreen;
import com.myautotest.utils.WebDriverRunner;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class VkTest {

    public static final String MAIN_PAGE_HEADER_TEXT ="Добро пожаловать";
    public static final String LOGIN_NAME="Vesta Li2";


   @Test(description = "Verify text")
    public void checkText(){

        VkStartScreen vkStartScreen = new VkStartScreen();
        Assert.assertEquals(vkStartScreen.getMainPageText(), MAIN_PAGE_HEADER_TEXT,
                "Header text not match with expected value");
    }

    @Test(description = "Verify text after login", dependsOnMethods = "checkText")
    public void checkLoginPage(){
        VkStartScreen vkStartScreen = new VkStartScreen();
        vkStartScreen.loginToVkontacte();
        LoginPageScreen loginPageScreen = new LoginPageScreen();
        Assert.assertEquals(loginPageScreen.getLoginName(), LOGIN_NAME,
                "Header text not match with expected value");
    }


    @AfterTest
    public void tearDown() {
        //закрываем браузер. в этом случае обращаться к драйверу можно (но не напрямую, как видите)
        WebDriverRunner.stopWebDriver();
    }

}
