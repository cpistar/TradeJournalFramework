package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="./src/test/resources/features",
		glue="step_definitions",
		dryRun=false,
		tags="@AddTradeFieldsValidTest"
		)
public class TestRunner {

}
/*
 * In the top right corner of any page, click your username.
On your profile page, click the Repositories tab, then click the name of your repository.
In your repository's right sidebar, click Settings.
Click the "Collaborators" tab.
Start typing the collaborator's username.
Select the user from the drop-down menu.
Click Add.
 * */
 