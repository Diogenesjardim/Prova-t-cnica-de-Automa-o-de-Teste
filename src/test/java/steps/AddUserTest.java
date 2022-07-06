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

	@Dado("preeencho os dados")
	public void preeenchoOsDados() {
	  page.cadastrar("joao" );
	  page.cadastrar("sousa");
      page.cadastrar("joao sousa ");
      page.cadastrar("113243345");
      page.cadastrar("Rua guerreiro");
      page.cadastrar("190");
      page.cadastrar("itapevi");
      page.cadastrar("SP");
      page.cadastrar("06246-879");
      page.cadastrar("Brasil");
      page.cadastrar("Hernandez");
      page.cadastrar("4.000");
      page.cadastrar("sim");
      
	}

	@Quando("clicar em salvar")
	public void clicarEmSalvar() {
		page.salvar();
		

	}

	@Entao("validamos a mensagem {string}")
	public void validamos_a_mensagem(String textoEsperado) {
		meto.validarTexto(el.mensagen, "Your data has been successfully stored into the database.");
	   
	}
	  
		
		
		

	}


