
//Por fim, um palestrante terá o seu nome, contato e valor de uma hora de sua palestra.

public class Palestrante {
	public String nome;
	public String contato;
	double valor_por_hora_palestra;
	
	public void imprimirDados() {
		System.out.println(nome);
		System.out.println(contato);
	}
	
	public Palestrante(String nome, String contato, double valor_por_hora_palestra) {
		this.nome = nome;
		this.contato = contato;
		this.valor_por_hora_palestra = valor_por_hora_palestra;
	}
		
	
	
}
