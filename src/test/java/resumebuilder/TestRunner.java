package resumebuilder;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/RpnCalc.feature", tags = "~@login")
public class TestRunner {

}
