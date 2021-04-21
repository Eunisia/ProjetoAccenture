package pages;

import elementos.Elementos;

public class Formulario {

	Metodos metodos = new Metodos();
	Elementos elemento = new Elementos();

	public void preencherFormulario(String make, String model, String cylindercapacity, String engineperformance,String firstname, String lastname) {

		metodos.escrever(elemento.getMake(), make);
		metodos.escrever(elemento.getModel(), model);
		metodos.escrever(elemento.getCylindercapacity(), cylindercapacity);
		metodos.escrever(elemento.getEngineperformance(), engineperformance);
		metodos.clicar(elemento.getNextenterinsurantdata());
		metodos.escrever(elemento.getFirstname(), firstname);
		metodos.escrever(elemento.getLastname(), lastname);
		metodos.clicar(elemento.getNextenterproductdata());
		metodos.clicar(elemento.getNextselectpriceoption());
		
	}


		
	}


