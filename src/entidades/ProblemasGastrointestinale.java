package entidades;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the problemas_gastrointestinales database table.
 * 
 */
@Entity
@Table(name="problemas_gastrointestinales")
@NamedQuery(name="ProblemasGastrointestinale.findAll", query="SELECT p FROM ProblemasGastrointestinale p")
public class ProblemasGastrointestinale implements Serializable {
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

	public ProblemasGastrointestinale() {
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