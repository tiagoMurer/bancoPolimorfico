package or.tiago.bancopoli.banco3;

import java.util.Collection;

public class ContaPoupanca extends Conta{
	
	private static Collection<Conta> poupancas;
	
	public ContaPoupanca(User poupador){
		this.titular = poupador;
		this.numero = Gen.generateAccNum();
		poupancas.add(this);
		this.tipo = AccTipo.POUPANCA;
		poupador.setContaP(this.numero);
	}
	
	@Override
	public void depositar(float deposito) {
		this.setSaldo(this.getSaldo() + deposito*1.05f);
	}

}
