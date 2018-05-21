
public class Cliente {
	Cliente() { 
		System.out.println("Construtor sem params");
	}
	
	Cliente(String numeroRG) {
		this();
		System.out.println("Construtor com param numeroRG");
	}
	
	Cliente(String numeroRG, String numeroCPF, String endereco, String nome) {
		this(numeroRG);
		System.out.println("Construtor com params numeroRG/numeroCPF/endereco/nome");
	}

	private String numeroCPF;
	private String endereco;
	private String nome;
	private String numeroRG;
	
	public String getNumeroRG() {
		return numeroRG;
	}

	public void setNumeroRG(String numeroRG) {
		this.numeroRG = numeroRG;
	}

	public String getNumeroCPF() {
		return numeroCPF;
	}

	public void setNumeroCPF(String numeroCPF) {
		this.numeroCPF = numeroCPF;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
