package com.belajarcucumber.definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class BMICalculatorDefinition {
        private double weight;
        private double height;
        private double  bmiActual;

        @Given("saya mengisi field berat badan dengan {double} kg")
        public void haveAWeight(double weight){
                this.weight = weight;
        }

        @Given("saya mengisi field tinggi badan dengan {double} m")
        public void haveAHeight(double height){
                this.height = height;
        }

        @When("saya menekan tombol Hitung BMI")
        public void calculateBMI(){
                this.bmiActual = weight / (height * height);
        }

        @Then("saya mendapatkan hasil BMI {double}")
        public void myBMI (double bmiExpected){
                Assert.assertEquals(bmiActual,bmiExpected,0.01);
        }

        @And("saya mendapatkan kategori {string}")
        public void myCatBMI(String catExpected){
                String Category;
                if (bmiActual < 18.5) {
                        Category = "Underweight";
                } else if (bmiActual < 25) {
                        Category = "Normal";
                } else if (bmiActual < 30) {
                        Category = "Overweight";
                } else {
                        Category = "Obese";
                }

                System.out.println(Category);
                Assert.assertEquals(catExpected,Category);
        }


}
