package Runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/resources/featureFile/MyFeature.feature",glue="StepDefinition",
dryRun=false,
monochrome=true
		)
public class DataTable {

}
