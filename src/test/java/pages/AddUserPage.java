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
		metodos.escrever(el.Name, "joao" );
		metodos.escrever(el.LastName, "sousa");
		metodos.escrever(el.ContactFirsName, "joao sousa ");
		metodos.escrever(el.Phone, "113243345");
		metodos.escrever(el.AddressLine1, "Rua guerreiro");
	 	metodos.escrever(el.AddressLine2,"190");
		metodos.escrever(el.City, "itapevi");
		metodos.escrever(el.State, "SP");
		metodos.escrever(el.PostalCode, "06246-879");	
		metodos.escrever(el.Country, "Brasil");
	    metodos.clicar(el.from);
	   // metodos.escrever(el.from,"Hernandez");
	    //metodos.clicar(el.Bondur);
		metodos.escrever(el.CreditLimit, "4.000");
		metodos.escrever(el.Deleted, "sim");
		metodos.clicar(el.Save);
		metodos.esperarElemento(el.mensagen);
		
		
	}
	
	public void salvar() {
		metodos.clicar(el.Save);
	}
	
	
}

