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
        LocatorsHomePage objHomePage = getLocatorsHomePage();

        // Cоответствие текста ответа7.
        objHomePage.question7Click();
        objHomePage.checkTextAnswer7();

        // Cоответствие текста ответа8.
        objHomePage.question7Click();
        objHomePage.checkTextAnswer7();

    }

    private LocatorsHomePage getLocatorsHomePage() {
        LocatorsHomePage objHomePage = new LocatorsHomePage(driver);

        // Cоответствие текста ответа1.
        objHomePage.question1Click();
        objHomePage.checkTextAnswer1();

        // Cоответствие текста ответа2.
        objHomePage.question2Click();
        objHomePage.checkTextAnswer2();

        // Cоответствие текста ответа3.
        objHomePage.question3Click();
        objHomePage.checkTextAnswer3();

        // Cоответствие текста ответа4.
        objHomePage.question4Click();
        objHomePage.checkTextAnswer4();

        // Cоответствие текста ответа5.
        objHomePage.question5Click();
        objHomePage.checkTextAnswer5();

        // Cоответствие текста ответа6.
        objHomePage.question6Click();
        objHomePage.checkTextAnswer6();
        return objHomePage;
    }

    @After
        public void teardown() {
            driver.quit();
    }

}
