package br.com.alura.minhasmusicas.principal;


import br.com.alura.minhasmusicas.modelos.MinhasPreferidas;
import br.com.alura.minhasmusicas.modelos.Musica;
import br.com.alura.minhasmusicas.modelos.Podcast;

public class main {

	public static void main(String[] args) {
		Musica minhaMusica = new Musica();
		minhaMusica.setTitulo("Forever");
		minhaMusica.setCantor("Kiss");
		
		for (int i = 0; i < 1000; i++)
			minhaMusica.reproduz();
		
		for (int i = 0; i < 50; i++)
			minhaMusica.reproduz();
		
		
		Podcast meuPodcast = new Podcast();
		meuPodcast.setTitulo("BolhaDev");
		meuPodcast.setApresentador("Marcos");
		
		for (int i = 0; i < 5000; i++)
			meuPodcast.reproduz();
		
		for (int i = 0; i < 1000; i++)
			meuPodcast.curte();
		
		MinhasPreferidas mp = new MinhasPreferidas();
		mp.inclui(meuPodcast);
		mp.inclui(minhaMusica);
		
	}

}
