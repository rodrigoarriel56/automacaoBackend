package stepdefinition;

import cucumber.api.PendingException;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import report.ExtentCucumberFormatter;
 
public class ListUsers {

	@Dado("^que eu esteja na tela de busca de usuário$")
	public void que_eu_esteja_na_tela_de_busca_de_usuário() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
	
    @Então("^o código de resposta é$")
    public void tokenLogin() {
    	ExtentCucumberFormatter.insertInfoTextInStepReport(":" + " ");

    	
    }



}
