package exemplo_enum;

//Criando o enum EstadoBrasileiro para ser usado em toda a aplicação.
public enum EstadoBrasileiro {
	SAO_PAULO ("SP","São Paulo", 1),
	RIO_JANEIRO ("RJ", "Rio de Janeiro", 3),
	PIAUI ("PI", "Piauí", 23),
	MARANHAO ("MA","Maranhão", 24),
	MINAS_GERAIS ("MG", "Minas Gerais", 2),
	BAHIA ("BA", "Bahia", 15),
	GOIAS ("GO", "Goiás", 6),
	RIO_GRANDE_DO_SUL ("RS", "Rio Grande do Sul", 6),
	PARANA ("PR", "Paraná", 4),
	SANTA_CATARINA ("SC", "Santa Catarina", 5),
	ESPIRITO_SANTO ("ES", "Espírito Santo", 8),
	AMAZONAS ("AM", "Amazonas", 13),
	ACRE ("AC", "Acre", 14),
	PERNAMBUCO ("PE", "Pernambuco", 9),
	CEARA ("CE", "Ceará", 10),
	BRASILIA ("DF", "Brasília", 10);
	
	private String nome;
	private String sigla;
	private int ibge;
	
	private EstadoBrasileiro(String sigla, String nome, int ibge) {
		this.sigla = sigla;
		this.nome = nome;
		this.ibge = ibge;
	}
	public int getIbge() {
		return ibge;
	}
	public String getSigla() {
		return sigla;
	}
	public String getNome() {
		return nome;
	}
	public String getNomeMaiusculo() {
		return nome.toUpperCase();
	}
	
	
}
