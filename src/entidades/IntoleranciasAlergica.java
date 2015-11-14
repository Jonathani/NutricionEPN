package entidades;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the intolerancias_alergicas database table.
 * 
 */
@Entity
@Table(name="intolerancias_alergicas")
@NamedQuery(name="IntoleranciasAlergica.findAll", query="SELECT i FROM IntoleranciasAlergica i")
public class IntoleranciasAlergica implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_INTOLERANCIAS_ALERGICAS")
	private int idIntoleranciasAlergicas;

	private String descripcion;

	//bi-directional many-to-one association to AntecedentesAlimentario
	@ManyToOne
	@JoinColumn(name="ID_ANTECEDENTES_ALIMENTARIOS")
	private AntecedentesAlimentario antecedentesAlimentario;

	public IntoleranciasAlergica() {
	}

	public int getIdIntoleranciasAlergicas() {
		return this.idIntoleranciasAlergicas;
	}

	public void setIdIntoleranciasAlergicas(int idIntoleranciasAlergicas) {
		this.idIntoleranciasAlergicas = idIntoleranciasAlergicas;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public AntecedentesAlimentario getAntecedentesAlimentario() {
		return this.antecedentesAlimentario;
	}

	public void setAntecedentesAlimentario(AntecedentesAlimentario antecedentesAlimentario) {
		this.antecedentesAlimentario = antecedentesAlimentario;
	}

}