@enuygun
Feature: 001_Ucak_Bileti

  Scenario: www.enuygun.com adresinden ucak rezervasyonu yapma
    Given url_home_enuygun adresine giris yapilir
    And Ucak Bileti sekmesine tiklanir

    Scenario Outline: Lokasyon secilir
    And Nereden textbox'ina bir "<lokasyon>" girilir
      Examples:
      |lokasyon|
      |Londra  |

  Scenario Outline: Lokasyon secilir
    And Nereye textbox'ina bir "<lokasyon>" girilir
    Examples:
      |lokasyon|
      |Paris  |

  Scenario:
    And Gidis Tarihi textbox'ina uygun bir tarih girilir
    And Donus Tarihi textbox'ina uygun bir tarih girilir
    And Ucuz bilet bul butonuna tiklanir
    And Acilan sayfada ilk ucustaki sec butonuna tiklanir
    And E-posta adresiniz textbox'ina gecerli bir e-posta adresi girilir
    And Cep Telefonunuz textbox'ina gecerli bir gsm numarasi girilir
    And Ad textbox'ina bir ad girilir
    And Soyad textbox'ina bir soyad girilir
    And Dogum Tarihi dropdown'dan gun-ay-yil secilir
    And Odemeye ilerle butonuna tiklanir
    And Kart Numarasi textbox'ina kart numarasi girilir
    And Son Kullanma Tarihi dropdown'dan ay-yil secilir
    And CVC textbox'ina gecerli cvc no girilir
    And Acik Riza Metni butonuna tiklanir
    Then Satin Al butonuna tiklanir