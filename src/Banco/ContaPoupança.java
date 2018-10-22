package Banco;

public class ContaPoupança extends Conta {
	@Override
	public void depositar(float deposito) {
		this.setSaldo(this.getSaldo() + deposito*1.05f);
	}
	@Override
	public void retirar(float valor){
		this.setSaldo(this.getSaldo() - valor);
	}
}
