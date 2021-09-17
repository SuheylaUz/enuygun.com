package enuygunProject.stepdefinitions;

import enuygunProject.pages.EnuygunPage;
import enuygunProject.utilities.ConfigReader;
import enuygunProject.utilities.Driver;
import enuygunProject.utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EnuygunStepdefinitions {

    WebDriver driver;
    EnuygunPage enuygunPage = new EnuygunPage();

    @Given("url_home_enuygun adresine giris yapilir")
    public void adresineGirisYapilir() {
        Driver.getDriver().get(ConfigReader.getProperty("url_home_enuygun"));
    }

    @And("Ucak Bileti sekmesine tiklanir")
    public void sekmesineTiklanir() {
        enuygunPage.ucakBiletiButonu.click();
    }

    @And("Nereden textbox'ina bir {string} girilir")
    public void neredenTextboxInaBirLokasyonGirilir(String lokasyon) {
        enuygunPage.neredenTextbox.sendKeys(lokasyon);
        enuygunPage.ilkSekmee.click();
    }

    @And("Nereye textbox'ina bir {string} girilir")
    public void nereyeTextboxInaBirLokasyonGirilir(String lokasyon) {
        enuygunPage.nereyeTextbox.sendKeys(lokasyon);
        enuygunPage.ilkSekme.click();
    }

    @And("Gidis Tarihi textbox'ina uygun bir tarih girilir")
    public void gidisTarihiTextboxInaUygunBirTarihGirilir() {
        enuygunPage.gidisTarihiDropdown.click();
        enuygunPage.dinamikTarihBulma(ConfigReader.getProperty("gidis_tarihi"));
    }


    @And("Donus Tarihi textbox'ina uygun bir tarih girilir")
    public void donusTarihiTextboxInaUygunBirTarihGirilir() {
        enuygunPage.donusTarihiDropdown.click();
        enuygunPage.dinamikTarihBulma(ConfigReader.getProperty("donus_tarihi"));
    }

    @And("Ucuz bilet bul butonuna tiklanir")
    public void ucuzBiletBulButonunaTiklanir() {
        enuygunPage.ucuzBiletBulButonu.click();
        ReusableMethods.waitFor(5);
    }

    @And("Acilan sayfada ilk ucustaki sec butonuna tiklanir")
    public void acilanSayfadaIlkUcustakiSecButonunaTiklanir() {
        enuygunPage.secButonu.click();
    }

    @And("E-posta adresiniz textbox'ina gecerli bir e-posta adresi girilir")
    public void ePostaAdresinizTextboxInaGecerliBirEPostaAdresiGirilir() {
        enuygunPage.emailTextbox.sendKeys(ConfigReader.getProperty("email"));
        enuygunPage.emailDogrulama.click();
    }

    @And("Cep Telefonunuz textbox'ina gecerli bir gsm numarasi girilir")
    public void cepTelefonunuzTextboxInaGecerliBirGsmNumarasiGirilir() {
        enuygunPage.phoneTextbox.sendKeys(ConfigReader.getProperty("telefon_no"));
    }

    @And("Ad textbox'ina bir ad girilir")
    public void adTextboxInaBirAdGirilir() {
        enuygunPage.adTextbox.sendKeys(ConfigReader.getProperty("ad"));
    }

    @And("Soyad textbox'ina bir soyad girilir")
    public void soyadTextboxInaBirSoyadGirilir() {
        enuygunPage.soyadTextbox.sendKeys(ConfigReader.getProperty("soyad"));
    }

    @And("Dogum Tarihi dropdown'dan gun-ay-yil secilir")
    public void dogumTarihiDropdownDanGunAyYilSecilir() {

        enuygunPage.dogumGunDropdown.click();
        ReusableMethods.select(enuygunPage.dogumGunDropdown,"25");

        enuygunPage.dogumAyDropdown.click();
        ReusableMethods.select(enuygunPage.dogumAyDropdown, "Mart");

        enuygunPage.dogumYilDropdown.click();
        ReusableMethods.select(enuygunPage.dogumYilDropdown, "2000");
    }

    @And("Odemeye ilerle butonuna tiklanir")
    public void odemeyeIlerleButonunaTiklanir() {
        enuygunPage.odemeyeIlerleButonu.click();
        ReusableMethods.waitFor(5);

    }


    @And("Kart Numarasi textbox'ina kart numarasi girilir")
    public void kartNumarasiTextboxInaKartNumarasiGirilir() {
        enuygunPage.kartNoTextbox.sendKeys(ConfigReader.getProperty("kart_no"));
    }

    @And("Son Kullanma Tarihi dropdown'dan ay-yil secilir")
    public void sonKullanmaTarihiDropdownDanAyYilSecilir() {

        enuygunPage.creditCardMonthDropdown.click();
        ReusableMethods.select(enuygunPage.creditCardMonthDropdown, "01");

        enuygunPage.creditCardYearDropdown.click();
        ReusableMethods.select(enuygunPage.creditCardYearDropdown, "2026");

    }

    @And("CVC textbox'ina gecerli cvc no girilir")
    public void cvcTextboxInaGecerliCvcNoGirilir() {
        enuygunPage.cvcTextbox.sendKeys(ConfigReader.getProperty("cvc"));

    }

    @And("Acik Riza Metni butonuna tiklanir")
    public void acikRizaMetniButonunaTiklanir() {
        enuygunPage.rizaMetniButonu.click();

    }

    @Then("Satin Al butonuna tiklanir")
    public void satinAlButonunaTiklanir() {
        enuygunPage.satinAlButonu.click();
    }
}
