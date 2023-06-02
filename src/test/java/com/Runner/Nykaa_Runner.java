package com.Runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.BaseClassMethods.Base;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\FeatureFile\\nykaa.feature", glue = "com\\StepDefinition")

public class Nykaa_Runner extends Base {
	public static WebDriver driver;

	@BeforeClass
	public static void browserLaunchMethod() {
		driver = browserLaunch("Chrome");
		webDriverWait(20);
		maximize();
	}

	@AfterClass

	public static void browserCloseMethod() {
		close();
	}
}
