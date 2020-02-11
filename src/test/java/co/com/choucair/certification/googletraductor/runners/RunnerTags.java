package co.com.choucair.certification.googletraductor.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = {"src/test/resources/features/google_traductor.feature"},
        tags = {"@Tag0"},
        glue = {"co.com.choucair.certification.googletraductor.stepdefinitions"},
        snippets = SnippetType.CAMELCASE
)
public class RunnerTags {
}
