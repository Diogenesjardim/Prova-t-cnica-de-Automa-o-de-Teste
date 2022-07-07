package pages;

import org.openqa.selenium.By;

import elementos.Elementos;
import metodos.MetodosDeTestes;

public class AddUserPage {
	
	MetodosDeTestes metodos = new MetodosDeTestes();
	Elementos el = new Elementos();
	


	
	public void selectVersion(String versao) {
		metodos.escrever(el.Version, versao);
		
	}
		

	public void cadastrar(String ContactFirstName) {
		metodos.clicar(el.addUsuario);
		metodos.escrever(el.Name, "Teste Sicredi" );
		metodos.escrever(el.LastName, "Teste");
		metodos.escrever(el.ContactFirsName, "Diógenes Jardim");
		metodos.escrever(el.Phone, "51 9999-9999");
		metodos.escrever(el.AddressLine1, "Av Assis Brasil, 3970");
	 	metodos.escrever(el.AddressLine2,"Torre D");
		metodos.escrever(el.City, "Porto Alegre");
		metodos.escrever(el.State, "RS");
		metodos.escrever(el.PostalCode, "91000-000");	
		metodos.escrever(el.Country, "Brasil");
	    metodos.clicar(el.fromEmployeer);
	    metodos.clicar(el.Fixter);
		metodos.escrever(el.CreditLimit, "200");
		metodos.escrever(el.Deleted, "sim");
		metodos.clicar(el.Save);
	    metodos.esperarElemento(el.mensagen);
	
		
		
	}
	
	public void salvar() {
		metodos.clicar(el.Save);
		
	}
	
	
	
}

