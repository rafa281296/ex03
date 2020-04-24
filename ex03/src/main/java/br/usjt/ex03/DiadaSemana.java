package br.usjt.ex03;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name = "tb_dsemana")
public class DiadaSemana {

	@Id
	@GeneratedValue
	private Long id;
	@Column(nullable = false, length = 200)
	private String diad;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDiad() {
		return diad;
	}
	public void setDiad(String diad) {
		this.diad = diad;
	}
	
	@OneToOne
	private Previsao previ;

	public Previsao getPerfil() {
		return previ;

	}

	public void setPrevisao(Previsao previ) {
		this.previ = previ;

	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DiadaSemana other = (DiadaSemana) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
}
