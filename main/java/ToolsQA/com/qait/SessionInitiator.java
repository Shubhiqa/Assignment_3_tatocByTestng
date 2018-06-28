package ToolsQA.com.qait;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SessionInitiator {
	
	protected WebDriver driver;
	
	protected Action action;
	
	public SessionInitiator()
	{
		startsession();
	}
	
	
	public void startsession()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shubhinigam\\eclipse-workspace\\TATOC\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		initiatePage();
	}
	
	public void initiatePage() {
		action = new Action(driver);
	}
	
	public void launchurl()
	{
		driver.get("http://10.0.1.86/tatoc");
	}
	
}
