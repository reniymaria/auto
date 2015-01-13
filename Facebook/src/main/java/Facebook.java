import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 1.	Переходим по адресу «http://www.facebook.com»
 2.	Вводим телефон или емейл в поле «Эл.адрес или телефон»
 3.	Вводим пароль в поле «Пароль»
 4.	Нажимаем кнопку «Вход»
 5.	Нажимаем на ссылку «Редактировать профиль»
 6.	Нажимаем на ссылку «Добавить место работы»
 7.	Вводим значение «Microsoft»
 8.	Выбираем значение «Microsoft» из выпадающего списка
 9.	Жмем кнопку «Сохранить»
 */

public class Facebook {
    public static void main(String[] args) throws Exception {
        WebDriver driver = new FirefoxDriver(); // Драйвер Firefox поддерживает javascript

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://www.facebook.com");  // Открываем Facebook

        WebElement elementLogin = driver.findElement(By.name("email")); // Находим по имени поле для ввода
        elementLogin.sendKeys("vestaltestacc@yandex.ru"); // Вводим логин

        WebElement elementPass = driver.findElement(By.name("pass"));
        elementPass.sendKeys("q1w2e3r4t5y6"); //пароль

        elementPass.submit(); // Отправляем форму в которой находится элемент
        // WebDriver сам найдет, в какой он форме.

         WebElement elementEditProfile = driver.findElement(By.xpath(".//*[@id='pagelet_welcome_box']/div/div/div/div[2]/a[2]"));
         elementEditProfile.click(); //Нажимаем на ссылку «Редактировать профиль»

        WebElement elementWork = driver.findElement(By.xpath("//span[@class='_21ok _50f5']"));
        elementWork.click(); //Нажимаем на ссылку «Добавить место работы»

        WebElement elementMess= driver.findElement(By.name("employer_name"));
        elementMess.sendKeys("Microsoft");//Вводим значение «Microsoft»

        WebElement elementChose = driver.findElement(By.xpath("//span[text()='Microsoft']"));
        elementChose.click(); //Выбираем значение «Microsoft» из выпадающего списка

        WebElement element = driver.findElement(By.name("__submit__")); //Жмем кнопку «Сохранить»
        element.click();

    }
}
