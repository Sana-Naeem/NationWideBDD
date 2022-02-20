package qa.nationwide.bdd.runner;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "features",
							glue = "qa.nationwide.bdd.steps",
							monochrome = true,
							dryRun= false,
							plugin = {"json:target/jsonReport.json", "junit:target/xmlReport.xml", "html:target/htmlReport.html"})
//features is our features class which contains the undefined steps
//glue is our step definitions class 
//monochrome if you put as true it removes the un- readable words on console and makes the console report more tidy.
//If you mark as false they will not be readable.
//By default monochrome is falseS
//dryRun- If you put as true it does not execute anything it just makes sure all the steps are defined. (by default it is false)
//Plug-ins- used for reporting purposes like- json report, xml report and html report)
public class TestRunner {

}
  