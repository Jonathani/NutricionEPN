package entidades;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the problema_gastrointestinal database table.
 * 
 */
@Entity
@Table(name="problema_gastrointestinal")
@NamedQuery(name="ProblemaGastrointestinal.findAll", query="SELECT p FROM ProblemaGastrointestinal p")
public class ProblemaGastrointestinal implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_PROBLEMAS_GASTROINTESTINALES")
	private int idProblemasGastrointestinales;

	private String descripcion;

	//bi-directional many-to-one association to AntecedentesAlimentario
	@ManyToOne
	@JoinColumn(name="ID_ANTECEDENTES_ALIMENTARIOS")
	private AntecedentesAlimentario antecedentesAlimentario;

	public ProblemaGastrointestinal() {
	}

	public int getIdProblemasGastrointestinales() {
		return this.idProblemasGastrointestinales;
	}

	public void setIdProblemasGastrointestinales(int idProblemasGastrointestinales) {
		this.idProblemasGastrointestinales = idProblemasGastrointestinales;
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