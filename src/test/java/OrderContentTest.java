import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

@RunWith(Parameterized.class)
public class OrderContentTest {
    private WebDriver driver;
    private final String name;
    private final String surname;
    private final String address;
    private final String underground;
    private final String mobile;
    private final String when;
    private final String deadlines;
    private final String color;
    private final String comment;

    public OrderContentTest(String name, String surname, String address, String underground, String mobile, String when, String deadlines, String color, String comment) {
    this.name = name;
    this.surname = surname;
    this.address = address;
    this.underground = underground;
    this.mobile = mobile;
    this.when = when;
    this.deadlines = deadlines;
    this.color = color;
    this.comment = comment;
    }
    @Parameterized.Parameters
    public static Object[][] getOrder() {
    return new Object[][] {
    {"Сергей", "Шмидт", "г. Москва, ул. Борисовские пруды, д.9", "Каширская", "79639237788", "10.10.2027", "двое суток", "чёрный жемчуг", "Без домофона"},
    {"Сергей", "Шмидтт", "г. Москва, ул. Борисовские пруды, д.10", "Коломенское", "79639237789", "10.10.2027", "двое суток", "чёрный жемчуг", "Без домофона"},
    };
    }

    @Test
    public void OrderPositiveTest() {
        // Создаём драйвер для браузера Chrome
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox", "--headless", "--disable-dev-shm-usage");
        driver = new ChromeDriver(options);
        // Открой страницу тестового стенда
        driver.get("https://qa-scooter.praktikum-services.ru/");
        // Создаем объект класса HomePage
        LocatorsHomePage objHomePage = new LocatorsHomePage(driver);
        // Нажать на первую кнопку Заказать
        objHomePage.clickOneButton();
        // Создаем объект класса OrderPage
        LocatorsOrderPage objOrderPage = new LocatorsOrderPage(driver);
        // Проверить, что открылась страница заказа
        objOrderPage.PageOpenHeader(objOrderPage.getOrderHeader() , LocatorsOrderPage.orderHeader);

        // Шаги воспроизведения создания заявки
        objOrderPage.getName(name);
        objOrderPage.getSurname(surname);
        objOrderPage.getAddress(address);
        objOrderPage.getUnderground(underground);
        objOrderPage.getMobile(mobile);
        objOrderPage.clickButtonNext();
        objOrderPage.getWhen(when);
        objOrderPage.getDeadlines(deadlines);
        objOrderPage.getColor(color);
        objOrderPage.getComment(comment);
        objOrderPage.clickButtonOrder();
        objOrderPage.clickOrderYesButton();
    }
}
