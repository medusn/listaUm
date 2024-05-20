public class Cliente {
	private String nome;
	private String CPF;
	private Data dataNascimento;
	
	public Cliente(String novoNome, String CPF, Data novaDataNascimento) {
		this.nome = novoNome;
		this.CPF = CPF;
		this.dataNascimento = novaDataNascimento;
	}
	public String getNome() {
		return nome;
	}
	public String getCPF() {
		return CPF;
	}
	public Data getDataNascimento() {
		return dataNascimento;
	}
	public void setNome(String novoNome) {
		this.nome = novoNome;
	}
	public void setDataNascimento(Data novaDataNascimento) {
		this.dataNascimento = novaDataNascimento;
	}
}
