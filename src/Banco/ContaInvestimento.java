package Banco;

public class ContaInvestimento extends Conta {
	
	@Override
	public void depositar(float deposito) {
		this.setSaldo(this.getSaldo() + deposito);
	}
	@Override
	public void retirar(float valor){
		this.setSaldo(this.getSaldo() - valor);
	}
	
	private void render() {
		this.setSaldo(this.getSaldo()*1.1f);
	}
	
	
}
