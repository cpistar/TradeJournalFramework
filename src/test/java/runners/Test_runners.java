package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty", "html:Reports/htmlReport.html",
				"json:Reports/jsonReport.json"},
		features="./src/test/resources/feature",
		glue="step_definition",
		dryRun=false,
		tags="@TradeJournalUpdate"
		)
public class Test_runners {

}
