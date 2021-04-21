package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

		features = "src/test/resources/features", 
		glue = "testes", 
		tags = "@executa", 
		dryRun = false, 
		monochrome = true, 
		plugin = {"pretty", "html:target/report.html", "jason:target/report.jason" }

)

public class Executa {

}
