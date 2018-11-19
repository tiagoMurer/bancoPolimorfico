//LISTA DE SOBRENOMES PARA O GERADOR DE NOMES
package or.tiago.bancopoli.banco3;

public enum Lname {
	A(" Murer"),
	B(" Contrera"),
	C(" Gracie"),
	D(" Nakamura"),
	E(" da Silva"),
	F(" Freixeda"),
	G(" Peixoto"),
	H(" Mendes"),
	I(" Crudo"),
	J(" Gordo"),
	K(" Presley"),
	L(" Senna"),
	M(" Bonaparte"),
	N(" Gorlami"),
	O(" of Rivia"),
	P(" Decocco"),
	Q(" JoÃ£o");
	
	public String lastname;
	
	Lname(String sn){
		this.lastname = sn;
	}
	
	@Override
	public String toString() {
		return lastname;
	}
	
}
