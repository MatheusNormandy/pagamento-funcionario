package entities;

public class Funcionario {

	private String name;
	private Integer horas;
	private Double valorPorHora;
	
	
	
	public Funcionario(){
	}

	public Funcionario(String name, Integer horas, Double valorPorHora) {
		this.name = name;
		this.horas = horas;
		this.valorPorHora = valorPorHora;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getHoras() {
		return horas;
	}

	public void setHoras(Integer horas) {
		this.horas = horas;
	}

	public Double getValorPorHora() {
		return valorPorHora;
	}

	public void setValorPorHora(Double valorPorHora) {
		this.valorPorHora = valorPorHora;
	}
	
	public double pagamento() {
		return horas * valorPorHora;
	}
	
}
