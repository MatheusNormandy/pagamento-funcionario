package entities;

public class FuncionarioTerceirizado extends Funcionario{

	private Double cobrancaAdicional;

	public FuncionarioTerceirizado() {
		
	}
	
	public FuncionarioTerceirizado(String name, Integer horas, Double valorPorHora, Double cobrancaAdicional) {
		super(name, horas, valorPorHora);
		this.cobrancaAdicional = cobrancaAdicional;
	}

	public Double getCobrançaAdicional() {
		return cobrancaAdicional;
	}

	public void setCobrançaAdicional(Double cobrançaAdicional) {
		this.cobrancaAdicional = cobrançaAdicional;
	}
	
	@Override
	public double pagamento() {
		return super.pagamento() + cobrancaAdicional * 1.1;	
	}
	
}

	
	