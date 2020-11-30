package entities;

public class FuncionarioTerceirizado extends Funcionario{

	private Double cobrancaAdicional;

	public FuncionarioTerceirizado() {
		
	}
	
	public FuncionarioTerceirizado(String name, Integer horas, Double valorPorHora, Double cobrancaAdicional) {
		super(name, horas, valorPorHora);
		this.cobrancaAdicional = cobrancaAdicional;
	}

	public Double getCobran�aAdicional() {
		return cobrancaAdicional;
	}

	public void setCobran�aAdicional(Double cobran�aAdicional) {
		this.cobrancaAdicional = cobran�aAdicional;
	}
	
	@Override
	public double pagamento() {
		return super.pagamento() + cobrancaAdicional * 1.1;	
	}
	
}

	
	