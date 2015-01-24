package com.myautotest.screens;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class VkStartScreen extends MainScreenVk {

    //урл и локаторы
    private static final String URL = "http://vk.com/";
    private static final String MAIN_PAGE_TEXT_XPATH = "//*[@id = 'title']";
    private static final String LOGIN_NAME_XPATH="//*[@name='email']";
    private static final String LOGIN_NAME ="vestaltestacc@yandex.ru";
    private static final String PASSWORD_XPATH ="//*[@name='pass']";
    private static final String PASSWORD = "q1w2e3r4t5y6";



    public VkStartScreen() {

        driver.get(URL);}

    public String getMainPageText () {
            String resultText = driver.findElementByXPath(MAIN_PAGE_TEXT_XPATH).getText();
            return resultText;
        }

    private VkStartScreen enterLogin() {

        WebElement elementLogin = driver.findElement(By.xpath(LOGIN_NAME_XPATH)); // Находим по имени поле для ввода
        elementLogin.sendKeys(LOGIN_NAME); // Вводим логин
        return this;
    }

    private VkStartScreen enterPassword(){
        WebElement elementPass = driver.findElement(By.xpath(PASSWORD_XPATH));
        elementPass.sendKeys(PASSWORD); //пароль
        elementPass.submit(); // Отправляем форму в которой находится элемент
        return this;
    }

   public LoginPageScreen loginToVkontacte(){
       enterLogin();
       enterPassword();
    return new LoginPageScreen();
}

}



