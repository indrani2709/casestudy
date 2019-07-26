package skeleton;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/skeleton",glue="casestudy",tags={"@Smoke"},
plugin={"pretty","json:target/cucumber.json","html:target/cucumber-htmlreport.html"})
public class Runner1 {
	
}
