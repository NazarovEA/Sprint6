import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.By;


public class HomePageTest {
    private WebDriver driver;

    @Test
    void test() {
        // Создаём драйвер для браузера Chrome
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox", "--headless", "--disable-dev-shm-usage");
        driver = new ChromeDriver(options);
        // Открой страницу тестового стенда
        driver.get("https://qa-scooter.praktikum-services.ru/");
        // Прокрутить скролл до кнопке "Сколько это стоит? И как оплатить?"
        WebElement element = driver.findElement(By.cssSelector(".accordion"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        // Кликни по кнопке "Сколько это стоит? И как оплатить?"
        driver.findElement(By.xpath(".//div[@id='accordion__heading-24']")).click();
        // Найди кнопку и получи её текст
        String text = driver.findElement(By.className("accordion__panel")).getText();
        System.out.println("Текст кнопки: " + text);
        Assertions.assertEquals("Сутки — 400 рублей. Оплата курьеру — наличными или картой.", text, "Текст кнопки не совпадает с ожидаемым");
    }
    Important questions
    @AfterEach
    void teardown() {
        // Закрой браузер
        driver.quit();
    }
}
