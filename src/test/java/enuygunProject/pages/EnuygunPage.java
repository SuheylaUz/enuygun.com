package enuygunProject.pages;

import enuygunProject.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class EnuygunPage {

    public EnuygunPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "#flight-from-tab")
    public WebElement ucakBiletiButonu;

    @FindBy(css = "#OriginInput")
    public WebElement neredenTextbox;

    @FindBy(id = "react-autowhatever-1-section-0-item-0")
    public WebElement ilkSekmee;

    @FindBy(css = "#DestinationInput")
    public WebElement nereyeTextbox;

    @FindBy(xpath = "//div[@class='city_info'][1]")
    public WebElement ilkSekme;

    @FindBy(css = "#DepartureDate")
    public WebElement gidisTarihiDropdown;

    @FindBy(css = "#ReturnDate")
    public WebElement donusTarihiDropdown;

    public void dinamikTarihBulma(String gidisTarih) {

        WebElement dateWidget = Driver.getDriver().findElement(By.xpath("(//table[@class='CalendarMonth_table CalendarMonth_table_1'])[2]"));
        List<WebElement> columns = dateWidget.findElements(By.tagName("td"));

        for (WebElement cell : columns) {
            if (cell.getText().equals(gidisTarih)) {
                cell.click();
                break;
            }
        }
    }

    @FindBy(xpath = "//button[@class='primary-btn block']")
    public WebElement ucuzBiletBulButonu;

    @FindBy(id = "tooltipTarget_0")
    public WebElement secButonu;

    @FindBy(css = "#contact_email")
    public WebElement emailTextbox;

    @FindBy(id = "ui-id-1")
    public WebElement emailDogrulama;

    @FindBy(css = "#contact_cellphone")
    public WebElement phoneTextbox;

    @FindBy(css = "#firstName_0")
    public WebElement adTextbox;

    @FindBy(css = "#lastName_0")
    public WebElement soyadTextbox;

    @FindBy(css = "#birthDateDay_0")
    public WebElement dogumGunDropdown;

    @FindBy(css = "#birthDateMonth_0")
    public WebElement dogumAyDropdown;

    @FindBy(css = "#birthDateYear_0")
    public WebElement dogumYilDropdown;

    @FindBy(xpath = "//button[@class=' btn btn-success btn-lg tr  js-reservation-btn']")
    public WebElement odemeyeIlerleButonu;

    @FindBy(xpath = "//*[@id='cardnumber']")
    public WebElement kartNoTextbox;

    @FindBy(xpath = "//*[@id='cvc']")
    public WebElement cvcTextbox;

    @FindBy(css = "#creditCardMonth")
    public WebElement creditCardMonthDropdown;

    @FindBy(css = "#creditCardYear")
    public WebElement creditCardYearDropdown;

    @FindBy(xpath = "//input[@class='accept-store-card custom-control-input']")
    public WebElement rizaMetniButonu;

    @FindBy(xpath = "(//button[@class='btn btn-success btn-lg btn-block js-payment-btn visibility-check tr'])[1]")
    public WebElement satinAlButonu;

}