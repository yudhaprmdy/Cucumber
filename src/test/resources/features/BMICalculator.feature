Feature: Kalkulator BMI

  Scenario: Menghitung BMI dengan data valid

    Given saya mengisi field berat badan dengan 70 kg

    And saya mengisi field tinggi badan dengan 1.75 m

    When saya menekan tombol Hitung BMI

    Then saya mendapatkan hasil BMI 22.86

    And saya mendapatkan kategori "Normal"

