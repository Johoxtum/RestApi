package co.com.adquirencia.runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        tags = "@Getkey",
        features = "src/test/resources/features/consultapostburo.feature",
        glue = {"co.com.adquirencia.stepdefinitions.hook",
                "co.com.adquirencia.stepdefinitions"
        }
)
public class ConsultaRunner {
}
