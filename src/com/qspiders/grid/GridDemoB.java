package com.qspiders.grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.xml.XmlTest;

public class GridDemoB {
	
	@Test
	public void test(XmlTest x) throws MalformedURLException
	{
		//System.setProperty("webdriver.chrome.driver", "./exe/chromedriver.exe");

		//Remote machine
		//URL remoteAddress = new URL("http://10.10.4.56:4444/wd/hub");
		
		//Local Machine
		String browser = x.getParameter("browser"); //get the browser name from the testNG xml
		Reporter.log(browser, true);
		
		//URL remoteAddress = new URL("http://10.10.4.56:4444/wd/hub");
		URL remoteAddress = new URL(x.getParameter("url")); //get the remote machine URL from testNG xml
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setBrowserName(browser);
		//dc.setVersion("47"); //it will not consider the version installed
		
		WebDriver driver = new RemoteWebDriver(remoteAddress,dc);
		driver.get("https://www.google.co.in/");
		Reporter.log("Openend Google Page",true);
		driver.close();
		Reporter.log("Closed Google Page",true);
		
	}

}
