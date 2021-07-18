
public class Programa_Evento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		
		
		*/
		
		Responsavel julio = new Responsavel("julio", "1234-5678", 100);
		Palestrante theo = new Palestrante("theo", "5555-3333", 10);
		Palestra catracas = new Palestra("catracas", "00h", theo, "sobre catracas na USP", 2);
		Palestra genero = new Palestra("genero", "02h", theo, "sobre genero", 5);
		Palestra[] lista_palestras = {catracas, genero};
		Evento evento = new Evento("tiago_mito", julio, "01/01/2021", "02/01/2021", 10, lista_palestras);
		
		// 1. o valor gasto com o responsável;
		
		System.out.println(evento.getGastoResponsavel()); // >>1000
		
		// 2. o valor total dos gastos com as palestras;
		
		System.out.println(evento.getGastoTotalPalestras()); // >>70
		
		// 3. o valor total gasto por palestra;
		double[] gasto_palestras = evento.getGastoPorPalestra();
		for(int i = 0; i < lista_palestras.length; i++) {
			
			System.out.println(gasto_palestras[i]);
		}
		 // >> [20, 50]
		
		// 4. os dados do palestrante com o maior e menor valor gasto em sua palestra.

		evento.getDadosPalestranteMax(); // >> [theo, "5555-3333"]
		evento.getDadosPalestranteMin(); // >> [theo, "5555-3333"]
		
		
	}

}




