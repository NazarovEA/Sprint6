import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.By;


public class AccordionTest {
    private WebDriver driver;

    @Test
    void test() {
        // Создаём драйвер для браузера Chrome
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox", "--headless", "--disable-dev-shm-usage");
        driver = new ChromeDriver(options);
        // Открой страницу тестового стенда
        driver.get("https://qa-scooter.praktikum-services.ru/");
        // Найди кнопку "Войти" и кликни по ней
        driver.findElement(By.xpath(".//button[@class='Button_Button__ra12g']")).click();
    }

    @AfterEach
    void teardown() {
        // Закрой браузер
        driver.quit();
    }
}
