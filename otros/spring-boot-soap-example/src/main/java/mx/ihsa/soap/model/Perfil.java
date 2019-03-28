package mx.ihsa.soap.model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "perfil", schema = "public")
public class Perfil implements java.io.Serializable{
	private int idPerfil;
	private String descPerfil;
	private String observaciones;
	
	public Perfil() {
	}

	public Perfil(int idPerfil, String descPerfil) {
		this.idPerfil = idPerfil;
		this.descPerfil = descPerfil;
	}

	public Perfil(int idPerfil, String descPerfil, String observaciones) {
		this.idPerfil = idPerfil;
		this.descPerfil = descPerfil;
		this.observaciones = observaciones;
	}

	@Id
	@Column(name = "id_perfil", unique = true, nullable = false)
	public int getIdPerfil() {
		return this.idPerfil;
	}

	public void setIdPerfil(int idPerfil) {
		this.idPerfil = idPerfil;
	}

	@Column(name = "desc_perfil", nullable = false, length = 50)
	public String getDescPerfil() {
		return this.descPerfil;
	}

	public void setDescPerfil(String descPerfil) {
		this.descPerfil = descPerfil;
	}

	@Column(name = "observaciones", length = 50)
	public String getObservaciones() {
		return this.observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
}
