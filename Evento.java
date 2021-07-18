
//Cada evento deve ter um nome, um responsável, as datas de início e fim, uma 
//carga horária e lista de palestras. 

/*
		1. o valor gasto com o responsável; -- MÉTODO
		2. o valor total dos gastos com as palestras; -- METODO
		3. o valor total gasto por palestra;-- MÉTODO
		4. os dados do palestrante com o maior e menor valor gasto em sua palestra.
		*/
		


public class Evento {
	public String nome;
	public Responsavel responsavel;
	public String data_inicio;
	public String data_fim;
	public double carga_horaria;
	public Palestra[] lista_palestras;
	
	public double getGastoResponsavel() {
		return responsavel.valor_por_hora * carga_horaria; 
	}
	
	public double getGastoTotalPalestras() {
		double soma = 0;
		int n = lista_palestras.length;
		
		for(int i = 0; i < n; i++) {
			soma += lista_palestras[i].getCusto();
		}
		
		return soma;
	}
	
	public double[] getGastoPorPalestra() {
		int n = lista_palestras.length;
		double[] gastos = new double[n];
		
		for(int i = 0; i < n; i++) {
			gastos[i] = lista_palestras[i].getCusto();
		}
		return gastos;
	}
	

	private int findMaxIndex(double[] array) {
		double max = array[0];
		int index = 0;
		int n = array.length;
		
		for(int i = 0; i < n; i++) {
			if(array[i] > max) {
				max = array[i];
				index = i;
			}
		}
		
		return index;
	}
	
	private int findMinIndex(double[] array) {
		double min = array[0];
		int index = 0;
		int n = array.length;
		
		for(int i = 0; i < n; i++) {
			if(array[i] < min) {
				min = array[i];
				index = i;
			}
		}
		
		return index;
	}
	
	
	private Palestra getPalestraMaiorGasto() {
		int index = findMaxIndex(getGastoPorPalestra());
		return lista_palestras[index];
	}
	
	private Palestra getPalestraMenorGasto() {
		int index = findMinIndex(getGastoPorPalestra());
		return lista_palestras[index];
	}
	
	
	public void getDadosPalestranteMax() {
		// Retorna os dados do palestrante com maior valor gasto em sua palestra
		getPalestraMaiorGasto().palestrante.imprimirDados(); 
	}
	
	public void getDadosPalestranteMin() {
		// Retorna os dados do palestrante com menor valor gasto em sua palestra
		getPalestraMenorGasto().palestrante.imprimirDados(); 
	}
	
	
	public Evento(String nome, Responsavel responsavel, String data_inicio, String data_fim, double carga_horaria,
			Palestra[] lista_palestras) {
		super();
		this.nome = nome;
		this.responsavel = responsavel;
		this.data_inicio = data_inicio;
		this.data_fim = data_fim;
		this.carga_horaria = carga_horaria;
		this.lista_palestras = lista_palestras;
	}
		
	
	
	
}
