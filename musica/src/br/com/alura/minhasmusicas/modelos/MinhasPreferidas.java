package br.com.alura.minhasmusicas.modelos;

public class MinhasPreferidas {
	
	public void inclui (Audio audio) {
		if (audio.getClassificacao() >= 9)
			System.out.println(audio.getTitulo() + " é sucesso e preferido por todos.");
		else
			System.out.println(audio.getTitulo() + " tbm é um dos q estao curtindo.");
	}
}
