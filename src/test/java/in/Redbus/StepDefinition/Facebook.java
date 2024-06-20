package in.Redbus.StepDefinition;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.Select;

import in.Cucumber.BaseClass.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook extends BaseClass{
	//public static WebDriver driver;
	public static BaseClass base = new BaseClass();


	@Given("user launch the facebook application {string}")
	public void user_launch_the_facebook_application(String url) throws IOException {
//		WebDriverManager.edgedriver().setup();
//	    EdgeOptions options = new EdgeOptions();
//	    options.addArguments("disable-notifications");
//	    options.addArguments("disable-popups");
//	    options.addArguments("start-maximized");
//	    driver = new EdgeDriver(options);
//	    driver.get(string);
		//base.browserLaunch(url);
		File f=new File("C:\\Users\\balap\\eclipse-workspace\\browser\\Cucumber\\src\\test\\resources\\Utilities.property");
		FileInputStream f1=new FileInputStream(f);
		Properties prop=new Properties();
		prop.load(f1);
		String file=prop.getProperty("file");
		String urll=prop.getProperty("url");
		System.out.println(file+ " and "+urll);
		FileOutputStream fo=new FileOutputStream(f);
		prop.setProperty("urlQa","https://www.facebook.com.qa");
		prop.save(fo, "Updated QA URL");
		System.out.println(file + " and "+ urll);
		base.launchApplication(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


	}

	@Given("user click create new account")
	public void user_click_create_new_account() {
		 WebElement vkl= driver.findElement(By.xpath("//a[text()='Create new account']"));
		 base.button(vkl);
	}

	@When("User pass the value in first name box {string}")
	public void user_pass_the_value_in_first_name_box(String string) {
	   WebElement v= driver.findElement(By.xpath("//input[starts-with(@class,'inputtext') and @name='firstname']"));
	   base.button(v);
	   base.inputKeys(v,string);
	   
	}

	@When("User pass the value in surname box {string}")
	public void user_pass_the_value_in_surname_box(String string) {
		   WebElement b= driver.findElement(By.xpath("//input[@name=\"lastname\"]"));
		   base.button(b);
		   base.inputKeys(b,string); 
	}

	@When("User pass the value in mobile number box {string}")
    public void User_pass_the_value_in_mobile_number_box (String string) throws InterruptedException {
		   Thread.sleep(2000);
		   WebElement xb= driver.findElement(By.xpath("//input[@name=\"reg_email__\"]"));
		   base.inputKeys(xb,string);
	
	}

	@When("User pass the value in New password box {string}")
	public void user_pass_the_value_in_New_password_box(String string) {
		   WebElement xbz= driver.findElement(By.xpath("//input[@data-type=\"password\"]"));
		   base.inputKeys(xbz,string);
	}

	@When("User select a date {string}")
	public void user_select_a_date(String string) {
		WebElement user_birthday = driver.findElement(By.xpath("//select[@aria-label='Day']"));
	       Select s = new Select(user_birthday);
	       base.valueSelect(user_birthday,string);
	}
	@When("User select a month {string}")
	public void user_select_a_month(String string) {
		WebElement user_birthmonth = driver.findElement(By.xpath("//select[@aria-label='Month']"));
	       Select s = new Select(user_birthmonth);
	       base.visibleTextSelect(user_birthmonth,string); 
	}

	

	@When("User select a year {string}")
	public void user_select_a_year(String string) {
		WebElement user_birthyear = driver.findElement(By.xpath("//select[@aria-label='Year']"));
	       Select s = new Select(user_birthyear);
	       s.selectByVisibleText(string);
	}

	@When("User select the gender")
	public void user_select_the_gender() {
		 WebElement t = driver.findElement(By.xpath("//label[text()='Male']"));
		 base.button(t);
	}
	@Then("user click the signup {string}")
	public void user_click_the_signup(String string) throws IOException {
		 WebElement lo = driver.findElement(By.xpath("//button[@name=\"websubmit\"]"));
		 base.button(lo);
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			String fb =string;
			TakesScreenshot tk = (TakesScreenshot)driver;
			File src = tk.getScreenshotAs(OutputType.FILE);
			File trg = new File("C:\\Users\\balap\\eclipse-workspace\\browser\\Cucumber\\target\\Screenshots"+fb+".png");
			FileUtils.copyFile(src, trg);
			
    			
	}
	

}
