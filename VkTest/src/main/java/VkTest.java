import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
1.	Переходим по адресу «http://www.vk.com»
2.	Вводим телефон или емейл в поле «Телефон или емейл»
3.	Вводим пароль в поле «Пароль»
4.	Нажимаем кнопку «Войти»
5.	Открываем список друзей, перейдя по ссылке «Мои друзья»
6.	Нажимаем отправить сообщение для любого друга
7.	Вводим в окне текст сообщения
8.	Нажимаем кнопку «Отправить»
 **/

public class VkTest {
    public static void main(String[] args) throws Exception {
        WebDriver driver = new FirefoxDriver(); // Драйвер Firefox
        driver.get("http://www.vk.com");  // Открываем VK

        WebElement elementLogin = driver.findElement(By.name("email")); // Находим по имени поле для ввода
        elementLogin.sendKeys("vestaltestacc@yandex.ru"); // Вводим логин

        WebElement elementPass = driver.findElement(By.name("pass"));
        elementPass.sendKeys("q1w2e3r4t5y6"); //пароль

        elementPass.submit(); // Отправляем форму в которой находится элемент
        // WebDriver сам найдет, в какой он форме.

        driver.get("http://vk.com/friends"); // Открываем список друзей, перейдя по ссылке «Мои друзья»

        WebElement elementMess= driver.findElement(By.xpath(".//*[@id='user_block10183213']/div[3]/a[1]"));
        elementMess.click(); //Нажимаем отправить сообщение для любого друга

        WebElement elementField = driver.findElement(By.id("mail_box_editable"));
        elementField.sendKeys("Сообщение пользователю!"); // Вводим в окне текст сообщения

        WebElement element = driver.findElement(By.id("mail_box_send"));
        element.click(); // Нажимаем кнопку «Отправить»

    }
}
