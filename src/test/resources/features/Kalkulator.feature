Feature: Kalkulator App


  Scenario: Menjumlahkan dua angka positif
    Given saya memiliki angka 5
    And saya memiliki angka kedua 3
    When saya menjumlahkan kedua angka tersebut
    Then hasil penjumlahan harus 8

  Scenario: Menjumlahkan dua angka negatif
    Given saya memiliki angka -4
    And saya memiliki angka kedua -6
    When saya menjumlahkan kedua angka tersebut
    Then hasil penjumlahan harus -10

  Scenario: Menjumlahkan angka positif dan negatif
    Given saya memiliki angka 7
    And saya memiliki angka kedua -2
    When saya menjumlahkan kedua angka tersebut
    Then hasil penjumlahan harus 5


  Scenario: Pengurangan dua angka positif
    Given saya memiliki angka- 15
    And saya memiliki angka kedua- 7
    When saya mengurangi angka pertama dengan angka kedua
    Then hasil pengurangan harus 8

  Scenario: Pengurangan dua angka negatif
    Given saya memiliki angka- -10
    And saya memiliki angka kedua- -5
    When saya mengurangi angka pertama dengan angka kedua
    Then hasil pengurangan harus -5

  Scenario: Pengurangan angka positif dengan angka negatif
    Given saya memiliki angka- 8
    And saya memiliki angka kedua- -3
    When saya mengurangi angka pertama dengan angka kedua
    Then hasil pengurangan harus 11