package co.com.choucair.certification.proyectobase.runners;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features="src/test/resources/features/form_International_Inventsments_modify.feature",
        glue="co.com.choucair.certification.proyectobase.stepdefinitions",

        snippets= SnippetType.CAMELCASE)

public class Test4Modify {
}
