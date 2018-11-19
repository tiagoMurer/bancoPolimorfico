package or.tiago.bancopoli.banco3;

import java.util.Collection;

public class ContaInvestimento extends Conta {
	
	private static Collection<Conta> investimentos;

	public void render() {
		this.setSaldo(this.getSaldo()*1.1f);
	}
	
	public ContaInvestimento(User investidor){
		this.titular = investidor;
		this.numero = Gen.generateAccNum();
		investimentos.add(this);
		this.tipo = AccTipo.INVESTIMENTO;
		investidor.setContaI(this.numero);
	}
	
	@Override
	public void depositar(float deposito) {
		this.setSaldo(this.getSaldo() + deposito);
	}
}
