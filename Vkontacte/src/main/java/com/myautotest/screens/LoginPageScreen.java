package com.myautotest.screens;


public class LoginPageScreen extends MainScreenVk {

    private static final String LOGIN_NAME_XPATH="//div[@class='page_name fl_l ta_l']";

public LoginPageScreen(){}



    public String getLoginName(){

        String result = driver.findElementByXPath(LOGIN_NAME_XPATH).getText();

        return result;

    }

}
