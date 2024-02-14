package br.com.alura.minhasmusicas.modelos;

public class Podcast extends Audio {
	private String apresentador;
	private String descricao;
	
	public String getApresentador() {
		return this.apresentador;
	}
	public void setApresentador(String host) {
		this.apresentador = host;
	}
	
	public String getDescricao() {
		return this.descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	@Override
	public int getClassificacao() {
		if (this.getTotalcurtidas() > 500)
			return 10;
		else
			return 8;
	}
}
