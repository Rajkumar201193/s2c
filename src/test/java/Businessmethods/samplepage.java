package Businessmethods;

import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.codoid.products.exception.FilloException;

import ObjectRepository.Objrepo;
import Utilities.Commonmethods;
import Utilities.DataProvider;

public class samplepage {
	public static WebDriver driver;
	public static DataProvider d=new DataProvider();
	

	public static void main(String[] args) throws FilloException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://s2b.standardchartered.com/unifiedlogin/login/index.html?source=classic");
		System.out.println("URL Lauched");
	//	DataProvider.excelHashMapValues.put("testCaseID", "TC01");
		DataProvider.excelHashMapValues = d.extractExcelData("TC01", "Sheet1");
		//data.extractExcelData(arg1, "Sheet1");
		String uname = DataProvider.excelHashMapValues.get("UserName");
		String group = DataProvider.excelHashMapValues.get("Groupid");
		System.out.println(group);
		System.out.println(uname);
		
		Commonmethods.sendKeys(driver.findElement(Objrepo.user),uname);
		Commonmethods.sendKeys(driver.findElement(Objrepo.grpid),group);
		//Commonmethods.GetText(driver.findElement(Objrepo.lan));
		driver.findElement(By.xpath("//*[@id='dropdown-ember378']/span[1]")).click();
		 List<WebElement> list = driver.findElements(By.xpath("//ul[@class='dropdown-content active']/li"));
		for (WebElement webElement : list) {
			String text = webElement.getText();
			if()
			System.out.println(text);
		}
		 
	}

}
