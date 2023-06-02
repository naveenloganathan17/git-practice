package com.Runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.BaseClassMethods.Base;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\FeatureFile\\nykaa.feature", 
glue = "com\\StepDefinitionNykaa",
monochrome = true, dryRun = false)
//tags = ("@ExistingUserLogin, @AddToCart, @PlaceOrder"),
//plugin = {"html:ReportFolder/html_Report.html", "pretty", "json:ReportFolder/json_Report.json",
//		"com.cucumber.listener.ExtentCucumberFormatter:Reports/ExtentReport.html"}) 

public class Nykaa_Project_Runner extends Base	{
public static WebDriver driver;
	@BeforeClass
	public static void basicStep() {
		driver=browserLaunch("Chrome");
		webDriverWait(30);
	}
	@AfterClass
	public static void ending() {
		close();
	}
	
}
