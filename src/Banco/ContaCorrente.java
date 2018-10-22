package Banco;

public class ContaCorrente extends Conta {
	@Override
	public void depositar(float deposito) {
		this.setSaldo(this.getSaldo() + deposito);
	}
	@Override
	public void retirar(float valor){
		this.setSaldo(this.getSaldo() - valor);
	}
	
}
