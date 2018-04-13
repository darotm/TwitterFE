package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

    @RunWith(Cucumber.class)
    @CucumberOptions(features = "C:\\Users\\dtulimowski\\Downloads\\TwitterFE\\Feature\\login.feature"
            ,glue= {"step.definition"}
            ,format= {"pretty", "html:test-outout"}
    )

    public class TestRunner {

    }
