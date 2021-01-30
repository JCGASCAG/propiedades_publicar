package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import java.util.logging.Level;
import java.util.logging.Logger;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features/",
        glue = {"seleniumgluecode"}//,
        //plugin = {"json:test/report/cucumber_report.json"},
        //snippets = SnippetType.CAMELCASE,
        //tags = {"~@browser", "~@backend"}
)

public class Testrunner {
    /*
     * punto de partida donde se van a empezar
     * a ejecutar todas las automatizaciones
     * */


}
