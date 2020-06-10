package org.stepdefintion2;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;



public class JvmReport {
	
	public static void generateJvmReport(String json) {
		
		File f=new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Report\\JvmReport");
		
		Configuration con=new Configuration(f, "AdactinPage");
		con.addClassifications("Platform", "Windows");
		con.addClassifications("Browser", "Chrome");
		con.addClassifications("Browser version", "83.0");
		con.addClassifications("Sprint","22" );
		
		
		List<String> jsonFiles=new ArrayList<String>();
		jsonFiles.add(json);
		
		ReportBuilder r=new ReportBuilder(jsonFiles, con);
		r.generateReports();
		
		

	}

}
