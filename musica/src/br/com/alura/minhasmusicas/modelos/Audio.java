package br.com.alura.minhasmusicas.modelos;

public class Audio {
	private String titulo;
	private int totalDeReproducao;
	private int totalcurtidas;
	private int classificacao;
	
	public void curte() {
		this.totalcurtidas++;
	}
	
	public void reproduz() {
		this.totalDeReproducao++;
	}

	public String getTitulo() {
		return this.titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getTotalDeReproducao() {
		return this.totalDeReproducao;
	}

	public int getTotalcurtidas() {
		return this.totalcurtidas;
	}

	public int getClassificacao() {
		return this.classificacao;
	}	
	
	
	
}
