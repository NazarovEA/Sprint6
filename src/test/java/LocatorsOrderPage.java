import org.hamcrest.MatcherAssert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static java.awt.SystemColor.text;
import static org.hamcrest.core.Is.is;

public class LocatorsOrderPage {
    private WebDriver driver;

    private By nameField = By.xpath(".//input[@placeholder='* Имя']");
    // Метод поля name
    public void getName(String name) {
        driver.findElement(nameField).sendKeys(name);}

    private By surnameField = By.xpath(".//input[@placeholder='* Фамилия']");
    // Метод фамилии
    public void getSurname(String surname) {
        driver.findElement(surnameField).sendKeys(surname);}

    private By addressField = By.xpath(".//input[@placeholder='* Адрес: куда привезти заказ']");
    // Адрес
    public void getAddress(String address) {
        driver.findElement(addressField).sendKeys(address);}

    private By undergroundField = By.xpath(".//input[@placeholder='* Станция метро']");
    // Метро
    public void getUnderground(String underground) {
        driver.findElement(undergroundField).click();
        driver.findElement(By.xpath(".//div[text()='"+underground+"']")).click();}

    private By mobileField = By.xpath(".//input[@placeholder='* Телефон: на него позвонит курьер']");
    // mobile
    public void getMobile(String mobile) {
        driver.findElement(mobileField).sendKeys(mobile);}

    private By buttonNext = By.xpath(".//button[text()='Далее']");
    // переход на orderPage
    public void clickButtonNext() {
    driver.findElement(buttonNext).click();}

    private By whenField = By.xpath(".//input[@placeholder='* Когда привезти самокат']");
    // когда поле
    public void getWhen(String when) {
    driver.findElement(whenField).sendKeys(when);}

    private By OrderHeaderTwo = By.xpath(".//div[text()='Про аренду']");
    private By deadlinesField = By.xpath(".//div[@class='Dropdown-placeholder']");
    // срок аренды
    public void getDeadlines(String deadlinesField) {
    driver.findElement(OrderHeaderTwo).click();
    driver.findElement(By.id(deadlinesField)).click();
    driver.findElement(By.xpath(".//div[text()='"+deadlinesField+"']")).click();}

    // цвет
    public void getColor(String color) {
        driver.findElement(By.xpath(".//label[text()='"+color+"']")).click();}

    private By commentField = By.xpath(".//input[@placeholder='Комментарий для курьера']");
    // коммент
    public void getComment(String comment) {
    driver.findElement(commentField).sendKeys(comment);}

    private By buttonOrder = By.xpath(".//div[contains(@class,'Order_Buttons')]/button[text()='Заказать']");
    // подтверждение заказа
    public void clickButtonOrder() {
    driver.findElement(buttonOrder).click();}

    private By orderYesButton = By.xpath(".//button[text()='Да']");
    // Метод для подтверждения заказа
    public void clickOrderYesButton() {
    driver.findElement(orderYesButton).click();}

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