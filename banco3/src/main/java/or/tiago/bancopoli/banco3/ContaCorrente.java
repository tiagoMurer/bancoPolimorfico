package or.tiago.bancopoli.banco3;

import java.util.Collection;

public class ContaCorrente extends Conta {
	
	private static Collection<Conta> correntes;
	
	public ContaCorrente(User correntista){
		this.titular = correntista;
		this.numero = Gen.generateAccNum();
		this.tipo = AccTipo.CORRENTE;
		correntes.add(this);
		correntista.setContaC(this.numero);
		
	}
	
	@Override
	public void depositar(float deposito) {
		this.setSaldo(this.getSaldo() + deposito);
	}
}
