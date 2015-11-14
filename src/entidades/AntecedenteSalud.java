package entidades;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the antecedente_salud database table.
 * 
 */
@Entity
@Table(name="antecedente_salud")
@NamedQuery(name="AntecedenteSalud.findAll", query="SELECT a FROM AntecedenteSalud a")
public class AntecedenteSalud implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_ANTECEDENTE")
	private int idAntecedente;

	private String descripcion;

	//bi-directional many-to-one association to DatosMedico
	@ManyToOne
	@JoinColumn(name="ID_DATOS_MEDICOS")
	private DatosMedico datosMedico;

	public AntecedenteSalud() {
	}

	public int getIdAntecedente() {
		return this.idAntecedente;
	}

	public void setIdAntecedente(int idAntecedente) {
		this.idAntecedente = idAntecedente;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public DatosMedico getDatosMedico() {
		return this.datosMedico;
	}

	public void setDatosMedico(DatosMedico datosMedico) {
		this.datosMedico = datosMedico;
	}

}