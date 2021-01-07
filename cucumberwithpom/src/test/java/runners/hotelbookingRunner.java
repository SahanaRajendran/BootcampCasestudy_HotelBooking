package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src//main//resources//features",
		glue= {"stepdefs"},
				monochrome=true,
				plugin= {"pretty"}
		)

public class hotelbookingRunner {

}
