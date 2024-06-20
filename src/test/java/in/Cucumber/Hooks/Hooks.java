package in.Cucumber.Hooks;

import in.Cucumber.BaseClass.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	BaseClass base=new BaseClass();
	@Before
	public void launchBrowser() {
		base.browserLaunch();
	}
	@After
	public void closeBrowser() {
		base.browserClose();
	}

}
