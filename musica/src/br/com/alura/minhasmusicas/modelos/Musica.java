package br.com.alura.minhasmusicas.modelos;

public class Musica extends Audio {
	private String album;
	private String cantor;
	private String genero;
	
	public String getAlbum() {
		return this.album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public String getCantor() {
		return this.cantor;
	}
	public void setCantor(String artista) {
		this.cantor = artista;
	}
	public String getGenero() {
		return this.genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	@Override
	public int getClassificacao() {
		if (this.getTotalDeReproducao() > 2000)
			return 10;
		else
			return 7;
	}
}
