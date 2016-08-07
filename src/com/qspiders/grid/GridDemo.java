package com.qspiders.grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class GridDemo {
	
	@Test
	public void test() throws MalformedURLException
	{
		//System.setProperty("webdriver.chrome.driver", "./exe/chromedriver.exe");
		URL remoteAddress = new URL("http://10.10.4.56:4444/wd/hub");
		//URL remoteAddress = new URL("http://10.10.4.98:4455/wd/hub");
		//WebDriver driver = new RemoteWebDriver(remoteAddress,DesiredCapabilities.firefox());
		//WebDriver driver = new RemoteWebDriver(remoteAddress,DesiredCapabilities.chrome());
		WebDriver driver = new RemoteWebDriver(remoteAddress,DesiredCapabilities.internetExplorer());
		driver.get("https://www.google.co.in/");
		Reporter.log("Openend Google Page",true);
		driver.close();
		Reporter.log("Closed Google Page",true);
		
	}

}
