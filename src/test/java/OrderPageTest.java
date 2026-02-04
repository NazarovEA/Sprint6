import PageObject.LocatorsHomePage;
import PageObject.LocatorsOrderPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class OrderPageTest {
    private WebDriver driver;
@BeforeEach
void setUp() {
// Создаём драйвер для браузера Chrome
    ChromeOptions options = new ChromeOptions();
    options.addArguments("--no-sandbox", "--headless", "--disable-dev-shm-usage");
    driver = new ChromeDriver(options);
    // Открой страницу тестового стенда
    driver.get("https://qa-scooter.praktikum-services.ru/");
}
@Test
        public void openPageHeaderButton() {
      // Создаем объект класса HomePage
    LocatorsHomePage objHomePage = new LocatorsHomePage(driver);
    // Нажать на первую кнопку Заказать
    objHomePage.clickOneButton();
    // Создаем объект класса OrderPage
    LocatorsOrderPage objOrderPage = new LocatorsOrderPage(driver);
    // Проверить, что открылась страница заказа
    objOrderPage.PageOpenHeader(objOrderPage.getOrderHeader() , LocatorsOrderPage.orderHeader);
    }
    @Test
    public void openPageTwoButton() {
        // Создаем объект класса HomePage
        LocatorsHomePage objHomePage = new LocatorsHomePage(driver);
        // Нажать на первую кнопку Заказать
        objHomePage.clickTwoButton();
        // Создаем объект класса OrderPage
        LocatorsOrderPage objOrderPage = new LocatorsOrderPage(driver);
        // Проверить, что открылась страница заказа
        objOrderPage.PageOpenHeader(objOrderPage.getOrderHeader() , LocatorsOrderPage.orderHeader);
    }
    @AfterEach
    void teardown() {
        driver.quit();
    }
}
