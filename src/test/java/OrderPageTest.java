import org.junit.After;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class OrderPageTest {
    private WebDriver driver;

@Test
        public void OpenPageHeaderButton() {
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
    }
    @After
    public void teardown() {
        driver.quit();
    }
}
