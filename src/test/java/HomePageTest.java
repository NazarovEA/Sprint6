import org.junit.After;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HomePageTest {
    private WebDriver driver;

    @Test
    public void accordanceAnswerTest() {
        // Создаём драйвер для браузера Chrome
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox", "--headless", "--disable-dev-shm-usage");
        driver = new ChromeDriver(options);
        // Открой страницу тестового стенда
        driver.get("https://qa-scooter.praktikum-services.ru/");
        // Прокрутить скролл до кнопке "Сколько это стоит? И как оплатить?"
        WebElement element = driver.findElement(By.cssSelector(".accordion"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
        // Объект класса HomePage
        LocatorsHomePage objHomePage = new LocatorsHomePage(driver);

        // Cоответствие текста ответа1.
        objHomePage.question1Click();
        objHomePage.checkTextAnswer1(objHomePage.getAnswer1(), LocatorsHomePage.text1);
    }
        @After
        public void teardown() {
            driver.quit();
    }

}
