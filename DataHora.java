	public DataHora(int novoDia, int novoMes, int novoAno, String novaHora) {
		this.dia = novoDia;
		this.mes = novoMes;
		this.ano = novoAno;
		this.hora = novaHora;
	}
	public int getDia() {
		return dia;
	}
	public int getMes() {
		return mes;
	}
	public int getAno() {
		return ano;
	}
	public String getHora() {
		return hora;
	}
	public void setDia(int novoDia) {
		this.dia = novoDia;
	}
	public void setMes(int novoMes) {
		this.mes = novoMes;
	}
	public void setAno(int novoAno) {
		this.ano = novoAno;
	}
	public void setHora(String novaHora) {
		this.hora = novaHora;
	}
}
