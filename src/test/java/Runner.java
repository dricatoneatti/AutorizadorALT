import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith (Cucumber.class)
@CucumberOptions(
        //Inserção de caracteres especiais que ajudam na formatação
        plugin = "pretty",
        //Para organizar a formatação
        monochrome = true,
        //o Método apresenta letras maiúsculas na criação dos métodos
        snippets = SnippetType.CAMELCASE,
        //Valida se o mapeamento DOS TESTES está correto (true)
        dryRun = false,
        //Valida os passos
        strict = false,
        tags = {"@CT009"}
        )


public class Runner {

}
