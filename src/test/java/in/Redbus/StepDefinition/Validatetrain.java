package in.Redbus.StepDefinition;

import java.time.Duration;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import in.Cucumber.BaseClass.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Validatetrain extends BaseClass {
	//public static WebDriver driver;
	public static BaseClass base = new BaseClass();

	@Given("user launch the browser and application {string}")
	public void user_launch_the_browser_and_application(String url) {
//		WebDriverManager.edgedriver().setup();
//	    EdgeOptions options = new EdgeOptions();
//	    options.addArguments("disable-notifications");
//	    options.addArguments("disable-popups");
//	    options.addArguments("start-maximized");
//	    driver = new EdgeDriver(options);
//	    driver.get(string);
		base.launchApplication(url);
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	    
	}

	@When("user enters the value in from place")
	public void user_enters_the_value_in_from_place(io.cucumber.datatable.DataTable dataTable) {
		List<String> datas = dataTable.asList();
	    String fromLoc = datas.get(0);
		WebElement user_from = driver.findElement(By.xpath("//input[@placeholder='From']"));
		base.button(user_from);
		base.inputKeys(user_from,fromLoc);
		 //WebElement user_loc = base.waits().until(ExpectedConditions.elementToBeClickable(By.id("(//div[text()='\"+fromLoc+\"' and @class='stn_city_name'])[last()]")));
        WebElement user_loc = driver.findElement(By.xpath("(//div[text()='"+fromLoc+"' and @class='stn_city_name'])[last()]"));
        base.button(user_loc);
	}

	@When("user enters the value in to place")
	public void user_enters_the_value_in_to_place(io.cucumber.datatable.DataTable dataTable) {
		Map<String, String> datas = dataTable.asMap(String.class, String.class);
		 String toLoc = datas.get("Location1");
	     WebElement user_to = driver.findElement(By.xpath("//input[@placeholder='To']"));
	     base.button(user_to);
	     base.inputKeys(user_to,toLoc);
		 WebElement user_loco = driver.findElement(By.xpath("(//div[text()='"+toLoc+"' and @class='stn_city_name'])[last()]"));
		 base.button(user_loco);  
	}

	@When("user selects a date")
	public void user_selects_a_date() {
		LocalDate today = LocalDate.now();
        LocalDate tomorrow = today.plusDays(1);
        String day = String.format("%02d", tomorrow.getDayOfMonth());
       // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement user_date = base.waits().until(ExpectedConditions.elementToBeClickable(By.id("txtOnwardCalendar")));
        base.button(user_date);
        WebElement dateInput = base.waits().until(ExpectedConditions.elementToBeClickable(By.xpath("(//li[@data-date='" + day + "'])[2]")));
        base.button(dateInput);
	    
	}

	@When("user clicks on free cancellation")
	public void user_clicks_on_free_cancellation() {
		WebElement user_click = driver.findElement(By.xpath("//input[@type='checkbox']"));
		 base.button(user_click);
	   
	}

	@When("user clicks on search train")
	public void user_clicks_on_search_train() {
		WebElement user_search = driver.findElement(By.xpath("//button[text()='Search Trains']"));
		base.button(user_search);
	   
	}

	@Then("validate the train displayed in the UI")
	public void validate_the_train_displayed_in_the_UI() {
		List<WebElement> train_name =driver.findElements(By.xpath("//span[@class='srp_train_name']"));
		List<WebElement> dep_time = driver.findElements(By.xpath("//span[@class='srp_departure_time']"));
		List<WebElement> arr_time = driver.findElements(By.xpath("//span[@class='srp_arrival_time']"));
		for (int i = 0; i < train_name.size(); i++) {
			String trainName = train_name.get(i).getText();
			String depTime = dep_time.get(i).getText();
			String arrTime = arr_time.get(i).getText();
			System.out.println("Train Name: "+trainName+"Departure Time: "+depTime+"Arrival Time: "+arrTime+"Departure Location: ");
		}
	  
	}



}
