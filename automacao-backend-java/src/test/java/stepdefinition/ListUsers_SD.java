package stepdefinition;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import pojos.login.ListUsers;
import report.ExtentCucumberFormatter;
 
public class ListUsers_SD {
	
	public ListUsers users = new ListUsers();
	private String ListUsers;

	@Dado("^envio uma requisição GET para$")
	public void enterLoginData(String id, String first_name, String last_name) throws Throwable {
        
        Hooks.api.buildRequest(users);
        Hooks.api.getRequest(id, first_name);
    }
	
    @SuppressWarnings("static-access")
	@Então("^o código de resposta é$")
    public void o_codigo_de_resposta_e() 
    {
    	ListUsers = Hooks.api.response.then().extract().path("users").toString();

        System.out.println("Token de login criado com sucesso:" + " " + ListUsers);

        ExtentCucumberFormatter.insertInfoTextInStepReport(ListUsers);


    	
    }



}
