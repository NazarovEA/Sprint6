import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LocatorsOrderPage {
    private WebDriver driver;

    private By name = By.xpath(".//input[@placeholder='* Имя']");
    private By surname = By.xpath(".//input[@placeholder='* Фамилия']");
    private By address = By.xpath(".//input[@placeholder='* Адрес: куда привезти заказ']");
    private By underground = By.xpath(".//input[@placeholder='* Станция метро']");
    private By mobile = By.xpath(".//input[@placeholder='* Телефон: на него позвонит курьер']");
    private By buttonNext = By.xpath(".//button[text()='Далее']");
    private By when = By.xpath(".//input[@placeholder='* Когда привезти самокат']");
    private By deadlines = By.xpath(".//div[@class='Dropdown-placeholder']");
    private By comment = By.xpath(".//input[@placeholder='Комментарий для курьера']");
    private By buttonOrder = By.xpath(".//div[contains(@class,'Order_Buttons')]/button[text()='Заказать']");
    private By orderYesButton = By.xpath(".//button[text()='Да']");

}
