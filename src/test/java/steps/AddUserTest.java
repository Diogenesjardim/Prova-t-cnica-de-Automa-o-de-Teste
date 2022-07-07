package steps;

import elementos.Elementos;
import io.cucumber.java.es.Dado;
import io.cucumber.java.it.Quando;
import io.cucumber.java.pt.Entao;
import metodos.MetodosDeTestes;
import pages.AddUserPage;

public class AddUserTest  {
	
	AddUserPage page = new AddUserPage();
	MetodosDeTestes meto = new MetodosDeTestes();
	Elementos el = new Elementos();
	

	@Dado("que selecione o bootstrap v4")
	public void queSelecioneOBootstrapV4() {
		page.selectVersion("Bootstrap V4 Theme");

	}

	@Quando ("preeencho os dados")
	public void preeenchoOsDados() {
	  page.cadastrar("joao" );

      
	}
	
	@Quando("clicar em salvar")
	public void clicar_em_salvar() {
		meto.clicar(el.Save);
			    
	}
	@Entao("Validar a mensagem {string}")
	public void validar_a_mensagem(String textoEsperado) {
		meto.submit(el.mensagen);	 
		meto.validarTexto(textoEsperado, el.mensagen);
	    
}
	  
}	
		
		

	


