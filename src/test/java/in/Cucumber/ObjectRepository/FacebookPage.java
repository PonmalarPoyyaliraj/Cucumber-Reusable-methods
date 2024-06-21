package in.Cucumber.ObjectRepository;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import in.Cucumber.BaseClass.BaseClass;

public class FacebookPage extends BaseClass{
	public FacebookPage() {
		PageFactory.initElements(driver, this);
	}
   @FindBy(xpath = "//a[text()='Create new account']")
   private WebElement vkl;
   
   @FindBy(xpath = "//input[starts-with(@class,'inputtext') and @name='firstname']")
   private WebElement v;
   
   @FindBy(xpath = "//input[starts-with(@class,'inputtext') and @name='lastname']")
   private WebElement b;
   
   @FindBy(xpath = "//input[@aria-label='Mobile number or email address']")
   private WebElement xb;
   
   @FindBy(xpath = "//input[@data-type='password']")
   private WebElement xbz;
   
   @FindBy(xpath = "//select[@aria-label='Day']")
   private WebElement user_birthday;
   
   @FindBy(xpath = "//select[@aria-label='Month']")
   private WebElement user_birthmonth;
   
   @FindBy(xpath = "//select[@aria-label='Year']")
   private WebElement user_birthyear;
   
   @FindBy(xpath = "//label[text()='Male']")
    private WebElement t;
   
   @FindBy(xpath = "//button[text()='Sign Up' and @name='websubmit']")
   private WebElement lo;

    public WebElement getVkl() {
	return vkl;
   }

   public WebElement getV() {
   return v;
  }

   public WebElement getB() {
   return b;
  }

  public WebElement getXb() {
  return xb;
 }

  public WebElement getXbz() {
  return xbz;
 }

  public WebElement getUser_birthday() {
  return user_birthday;
  }

  public WebElement getUser_birthmonth() {
  return user_birthmonth;
  }

public WebElement getUser_birthyear() {
	return user_birthyear;
}

public WebElement getT() {
	return t;
}

public WebElement getLo() {
	return lo;
}
@FindBy(xpath = "//input[@placeholder='From']")
private WebElement user_from;


@FindBy(xpath = "//input[@placeholder='To']")
private WebElement user_to;


@FindBy(xpath = "//input[@type='checkbox']")
private WebElement user_click;


@FindBy(xpath = "//button[text()='Search Trains']")
private WebElement user_search;


public WebElement getUser_from() {
	return user_from;
}


public WebElement getUser_to() {
	return user_to;
}

public WebElement getUser_click() {
	return user_click;
}

public WebElement getUser_search() {
	return user_search;
}


   
}
