package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features="src/test/resources/features",
        plugin={"html:target/cucumber-html-report", "json:target/cucumber.json",
                "pretty:target/cucumber-pretty.txt","usage:target/cucumber-usage.json",
                "junit:target/cucumber-results.xml"}, monochrome = true,
        format = {"json:target/cucumber.json"}
        , tags="@scenario1"
)

public class UiTestSuite {

}
