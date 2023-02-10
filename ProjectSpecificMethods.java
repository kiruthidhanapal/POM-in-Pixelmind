package com.leaftaps.UI.base;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
//import com.leaftaps.UI.base.utility.ReadExcelData;

import com.leaftaps.UI.base.utility.ReadExcelData;

//import io.cucumber.messages.types.Duration;
//import io.cucumber.messages.types.Duration;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ProjectSpecificMethods {


	public static  RemoteWebDriver driver;
	public String excelFileName;
	@Parameters({"browser","url"})
			@BeforeMethod
			public void StartBrowsers(String browserName,String url) {

			if (browserName.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();

	}       else if(browserName.equalsIgnoreCase("Edge")) {
		    WebDriverManager.edgedriver().setup();
		   driver= new EdgeDriver();

			}
	driver.manage().window().maximize();
	driver.get(url);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
/*	@AfterMethod
	public void endBrowser()
	{
		driver.close();
		}*/


	@DataProvider(name="getData")
	public String[][] getData() throws IOException{
		return ReadExcelData.readData(excelFileName);

	}
	}







