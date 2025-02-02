package com.belajarcucumber.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {
                "src/test/resources/features/Persegi.feature",
                "src/test/resources/features/Kalkulator.feature",
                "src/test/resources/features/BMICalculator.feature"
        },
        glue = {
                "com.belajarcucumber.definitions",
        }
)
public class RunnerTest extends AbstractTestNGCucumberTests {
}