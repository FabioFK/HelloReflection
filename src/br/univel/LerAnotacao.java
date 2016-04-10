package br.univel;

import br.univel.anotacoes.Tabela;
import br.univel.enums.EstadoCivil;
import br.univel.enums.Uf;

public class LerAnotacao {

	public LerAnotacao(Object obj) {
		Class<?> cl = obj.getClass();
		if (cl.isAnnotationPresent(Tabela.class)) {
		 Tabela t = cl.getAnnotation(Tabela.class);
		 System.out.println(t.value());
			}
	}

	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		p.setId(1);
		p.setName("Fabio");
		p.setEstadoCivil(EstadoCivil.SOLTEIRO);
		p.setUf(Uf.PR);
		
		System.out.println(p.getUf().getNome());

		new LerAnotacao(p);

	}

}
