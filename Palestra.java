
//Cada palestra deve ter um título, horário de início, palestrante, uma descrição e carga horária.

public class Palestra {
	public String titulo;
	public String horario_inicio;
	public Palestrante palestrante;
	public String descricao;
	public double carga_horaria;
	
	public double getCusto() { 
		return palestrante.valor_por_hora_palestra * carga_horaria;
	}
	
	public Palestra(String titulo, String horario_inicio, Palestrante palestrante, String descricao,
			double carga_horaria) {
		super();
		this.titulo = titulo;
		this.horario_inicio = horario_inicio;
		this.palestrante = palestrante;
		this.descricao = descricao;
		this.carga_horaria = carga_horaria;
	}
}
