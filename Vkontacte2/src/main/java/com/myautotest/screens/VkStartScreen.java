package com.myautotest.screens;


public class VkStartScreen extends MainScreenVk {

    //урл и локаторы
    private static final String URL = "http://vk.com/";
    private static final String MAIN_PAGE_TEXT_XPATH = "//*[@id = 'title']";

    public VkStartScreen(){

        driver.get(URL);

    }

    public String getMainPageText(){
        String result = driver.findElementByXPath(MAIN_PAGE_TEXT_XPATH).getText();
        return result;
    }

}
