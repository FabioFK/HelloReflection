package br.univel;

import br.univel.anotacoes.Tabela;
import br.univel.enums.EstadoCivil;
import br.univel.enums.Uf; 

@Tabela ("cad_pessoa")
public class Pessoa {
    private int id;
    private String name;
    private EstadoCivil estadoCivil;
    private Uf uf;
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

	public EstadoCivil getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(EstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public Uf getUf() {
		return uf;
	}

	public void setUf(Uf uf) {
		this.uf = uf;
	}
}
