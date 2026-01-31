import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LocatorsHomePage {
    private WebDriver driver;


// Вопрос1. Сколько это стоит? И как оплатить?
    private final By question = By.xpath(".//div[@class = 'accordion__heading-24']");
// Нажать на вопрос
    public void questionClick(){driver.findElement(question).click();}
// Ответ1. Сутки — 400 рублей. Оплата курьеру — наличными или картой.
    private By  answer = By.id("accordion__panel-24");
// Текст ответа getText
    public String getAnswer() {return driver.findElement(answer).getText();}



// 2.Хочу сразу несколько самокатов! Так можно?
// 3.Как рассчитывается время аренды?
// 4.Можно ли заказать самокат прямо на сегодня?
// 5.Можно ли продлить заказ или вернуть самокат раньше?
// 6.Вы привозите зарядку вместе с самокатом?
// 7.Можно ли отменить заказ?
// 8.Я жизу за МКАДом, привезёте?
}

// Главная страница
// https://qa-scooter.praktikum-services.ru/
// Кнопка «заказать» первая
// https://qa-scooter.praktikum-services.ru/order
// Поле имя
// Поле Фамиля
// Адрес
// Станция метро
// Телефон
// Кнопка далее
// Когда привезут самокат
// Срок аренды
// Цвет
// Комментарий
// Кнопка заказать
// Хотите оформить заказ?
// Кнопка да
// окно Заказ оформлен




// создание драйвера
// WebDriver driver = new ChromeDriver();
// WebDriver driver = new FireFoxDriver();

// Найди поле "Email" и заполни его
//        driver.findElement(By.id("email")).sendKeys("nazarov_54@gmail.com");
// Найди поле "Пароль" и заполни его
//       driver.findElement(By.id("password")).sendKeys("12345");
// Найди кнопку "Войти" и кликни по ней
//        driver.findElement(By.xpath(".//button[@class='auth-form__button']")).click();


//import org.openqa.selenium.By;
//private By signInButton = By.class("Button_Button__ra12g");
//private nameField = By.class("Input_Input__1iN_Z Input_Error__1Tx5d Input_Responsible__1jDKN");