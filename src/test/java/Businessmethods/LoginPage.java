package Businessmethods;

import org.openqa.selenium.WebDriver;

import ObjectRepository.Objrepo;
import Utilities.Commonmethods;
import Utilities.DataProvider;

public class LoginPage  {
	
	public static  WebDriver driver;
	public static DataProvider data=new DataProvider();
	
	
	public void login(String arg1) throws Throwable, Throwable {
	DataProvider.excelHashMapValues.put("testCaseID", arg1);
	DataProvider.excelHashMapValues = data.extractExcelData(arg1, "Sheet1");
	//data.extractExcelData(arg1, "Sheet1");
	String uname = DataProvider.excelHashMapValues.get("UserName");
	String group = DataProvider.excelHashMapValues.get("Groupid");
	System.out.println(group);
	System.out.println(uname);
	System.out.println(group);
	System.out.println(uname);
	System.out.println(group);
	System.out.println(uname);
	System.out.println(group);
	System.out.println(uname);
	Thread.sleep(10000);
	Commonmethods.sendKeys(driver.findElement(Objrepo.user),uname);
	Commonmethods.sendKeys(driver.findElement(Objrepo.grpid),group);
	
	
	
			
	
}}
