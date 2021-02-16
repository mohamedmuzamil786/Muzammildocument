package org.testrunner;



import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources",glue="org.stepdefination",tags= {"@smoke","@sanity"},dryRun=false,monochrome=true,
plugin= {"html:target","json:target//Muzamil.json"})



public class TestRunnerClass {
	
}
