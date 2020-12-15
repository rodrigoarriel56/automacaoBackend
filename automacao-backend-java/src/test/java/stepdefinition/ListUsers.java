package stepdefinition;

import cucumber.api.PendingException;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import report.ExtentCucumberFormatter;
 
public class ListUsers {
	
	   public ListUsers users = new ListUsers();

	@Dado("^envio uma requisição GET para$")
	public void envio_uma_requisicao_GET_para() throws Throwable
	{
		throw new PendingException();
	}
	
    @Então("^o código de resposta é$")
    public void o_codigo_de_resposta_e() 
    {
    	ExtentCucumberFormatter.insertInfoTextInStepReport(":" + " ");
    	

    	
    }



}
