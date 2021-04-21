package testes;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.Formulario;
import pages.Metodos;

public class Steps {
	
	Metodos metodos = new Metodos();
	Formulario form = new Formulario();
	
	

	@Dado("que eu esteja no site {string}")
	public void que_eu_esteja_no_site(String string) {
		
		metodos.abrirBrowser("http://sampleapp.tricentis.com/101/app.php");

	}

	@Quando("eu preencher o formulario")
	public void eu_preencher_o_formulario() {
		form.preencherFormulario("BMW", "MOPED", "3", "100", "Eunisia", "Freitas");

	}

	@Entao("seguirei para a proxima etapa")
	public void seguirei_para_a_proxima_etapa() {
	

	}

}
