import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LocatorsHomePage {
    private WebDriver driver;


// Вопрос1. Сколько это стоит? И как оплатить?
    private final By question1 = By.xpath(".//div[@class = 'accordion__heading-24']");
// Нажать на вопрос
    public void question1Click(){driver.findElement(question1).click();}
// Ответ1. Сутки — 400 рублей. Оплата курьеру — наличными или картой.
    private By  answer1 = By.id("accordion__panel-24");
// Текст ответа getText
    public String getAnswer1() {return driver.findElement(answer1).getText();}


// Вопрос2.Хочу сразу несколько самокатов! Так можно?
    private final By question2 = By.xpath(".//div[@class = 'accordion__heading-25']");
// Нажать на вопрос
    public void question2Click(){driver.findElement(question2).click();}
// Ответ2. Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим..
    private By  answer2 = By.id("accordion__panel-25");
// Текст ответа getText
    public String getAnswer2() {return driver.findElement(answer2).getText();}


// Вопрос3.Как рассчитывается время аренды?
   private final By question3 = By.xpath(".//div[@class = 'accordion__heading-26']");
// Нажать на вопрос
    public void question3Click(){driver.findElement(question3).click();}
// Ответ3.
    private By  answer3 = By.id("accordion__panel-26");
// Текст ответа getText
    public String getAnswer3() {return driver.findElement(answer3).getText();}


// Вопрос4.Можно ли заказать самокат прямо на сегодня?
    private final By question4 = By.xpath(".//div[@class = 'accordion__heading-27']");
    // Нажать на вопрос
    public void question4Click(){driver.findElement(question4).click();}
    // Ответ3.
    private By  answer4 = By.id("accordion__panel-27");
    // Текст ответа getText
    public String getAnswer4() {return driver.findElement(answer4).getText();}


// Вопрос5.Можно ли продлить заказ или вернуть самокат раньше?
private final By question5 = By.xpath(".//div[@class = 'accordion__heading-28']");
    // Нажать на вопрос
    public void question5Click(){driver.findElement(question5).click();}
    // Ответ3.
    private By  answer5 = By.id("accordion__panel-28");
    // Текст ответа getText
    public String getAnswer5() {return driver.findElement(answer5).getText();}


// Вопрос6.Вы привозите зарядку вместе с самокатом?
private final By question6 = By.xpath(".//div[@class = 'accordion__heading-29']");
    // Нажать на вопрос
    public void question6Click(){driver.findElement(question6).click();}
    // Ответ3.
    private By  answer6 = By.id("accordion__panel-29");
    // Текст ответа getText
    public String getAnswer6() {return driver.findElement(answer6).getText();}


// Вопрос7.Можно ли отменить заказ?
private final By question7 = By.xpath(".//div[@class = 'accordion__heading-30']");
    // Нажать на вопрос
    public void question7Click(){driver.findElement(question7).click();}
    // Ответ3.
    private By  answer7 = By.id("accordion__panel-30");
    // Текст ответа getText
    public String getAnswer7() {return driver.findElement(answer7).getText();}


// Вопрос8.Я жизу за МКАДом, привезёте?
private final By question8 = By.xpath(".//div[@class = 'accordion__heading-31']");
    // Нажать на вопрос
    public void question8Click(){driver.findElement(question8).click();}
    // Ответ3.
    private By  answer8 = By.id("accordion__panel-31");
    // Текст ответа getText
    public String getAnswer8() {return driver.findElement(answer8).getText();}
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