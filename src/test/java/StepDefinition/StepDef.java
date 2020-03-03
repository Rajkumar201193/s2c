package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Businessmethods.LoginPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef {
	public static LoginPage l= new LoginPage();
	
	@Given("^User is StoB login page$")
	public void user_is_StoB_login_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://s2b.standardchartered.com/unifiedlogin/login/index.html?source=classic");
		 
		System.out.println("URL Lauched");  
	}

	@When("^User enter the username,groupid and password from excel \"([^\"]*)\"$")
	public void user_enter_the_username_groupid_and_password_from_excel(String arg1) throws Throwable {
		l.login(arg1);
	}

	@Then("^click the login button$")
	public void click_the_login_button() throws Throwable {
	   System.out.println("browser closed");
	}

}