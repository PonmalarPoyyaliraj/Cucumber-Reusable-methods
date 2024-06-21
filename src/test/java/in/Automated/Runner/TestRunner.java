package in.Automated.Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features ="C:\\Users\\balap\\eclipse-workspace\\browser\\Cucumber\\src\\test\\resources\\Feature",
                   glue= {"in.Redbus.StepDefinition","in.Cucumber.Hooks"},
                   tags="@sanity or @smoke",
                   dryRun=false,
                   monochrome=true,
                   plugin= "html:target//cucumber//report.html"
                     )
public class TestRunner {
          
}

