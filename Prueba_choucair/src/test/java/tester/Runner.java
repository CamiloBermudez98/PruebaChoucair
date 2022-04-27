package tester;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "classpath:features/Escenario.feature",
		glue={"Pasos_test"},	
		monochrome=true,
	    strict = true,
		dryRun = false) 
		
	    
public class Runner {
// Corre el test del programa 
	
}
