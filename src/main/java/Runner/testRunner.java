package Runner;

import cucumber.api.CucumberOptions;

@RunWithCucumber(Cucumber.class)

@CucumberOptions(
	features="Feature"
	,glue("stepDefination")
		)



public class testRunner {

}
