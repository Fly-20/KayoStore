package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features="src/test/resources/featureFile",
        glue="com.Multi",
        monochrome = true,
        format={"json:target/Destination/cucumber.json"},
        tags={"@scenario1"}
)

public class UiTestSuite {

}
