package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features="src/test/resources/features",
        glue="com.Multi",
        plugin="pretty"
        , tags="@scenario1"
)

public class UiTestSuite {

}
