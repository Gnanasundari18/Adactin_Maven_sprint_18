package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.stepdefintion2.JvmReport;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\SIVA\\eclipse-workspace\\Day1cumer\\src\\test\\resources"
		+ "\\featurefolder\\adactin1.feature",
         glue ="org.stepdefintion2", monochrome=true, dryRun = false,
         plugin= {"pretty",
				  "html:src\\test\\resources\\Report\\HtmlReport",
				  "junit:src\\test\\resources\\Report\\XmlReport\\adactin.xml",
           		  "json:src\\test\\resources\\Report\\JsonReport\\adactinpage.json"})
public class TestRunnerClass {
	
	@AfterClass
	public static void jvmReportGeneration() {
		
		JvmReport.generateJvmReport(System.getProperty("user.dir")+"\\src\\test\\resources\\Report\\JsonReport\\adactinpage.json");

	}
	

}
