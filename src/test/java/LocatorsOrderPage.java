import org.hamcrest.MatcherAssert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static java.awt.SystemColor.text;
import static org.hamcrest.core.Is.is;

public class LocatorsOrderPage {
    private WebDriver driver;

    private By nameField = By.xpath(".//input[@placeholder='* Имя']");
    private By surnameField = By.xpath(".//input[@placeholder='* Фамилия']");
    private By addressField = By.xpath(".//input[@placeholder='* Адрес: куда привезти заказ']");
    private By undergroundField = By.xpath(".//input[@placeholder='* Станция метро']");
    private By mobileField = By.xpath(".//input[@placeholder='* Телефон: на него позвонит курьер']");
    private By buttonNextField = By.xpath(".//button[text()='Далее']");
    private By whenField = By.xpath(".//input[@placeholder='* Когда привезти самокат']");
    private By deadlinesField = By.xpath(".//div[@class='Dropdown-placeholder']");
    private By commentField = By.xpath(".//input[@placeholder='Комментарий для курьера']");
    private By buttonOrderField = By.xpath(".//div[contains(@class,'Order_Buttons')]/button[text()='Заказать']");
    private By orderYesButtonField = By.xpath(".//button[text()='Да']");

    public LocatorsOrderPage(WebDriver driver) {
        this.driver = driver;
    }
    public static final String orderHeader = "Для кого самокат";
    // Открытие окна после нажатия заказать
    public String getOrderHeader() {
        return driver.findElement(By.id(orderHeader)).getText();
    }
        // проверка названия окна после нажатия кнопки Заказать
        public void PageOpenHeader (String orderHeader, String text){
            MatcherAssert.assertThat(orderHeader, is(text));
        }
    }