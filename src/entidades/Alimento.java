package entidades;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the alimentos database table.
 * 
 */
@Entity
@Table(name="alimentos")
@NamedQuery(name="Alimento.findAll", query="SELECT a FROM Alimento a")
public class Alimento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_ALIMENTOS")
	private int idAlimentos;

	@Column(name="DESCRIPCION_ALIMENTO")
	private String descripcionAlimento;

	@Column(name="NOMBRE_ALIMENTO")
	private String nombreAlimento;

	//bi-directional many-to-one association to AntecedentesAlimentario
	@ManyToOne
	@JoinColumn(name="ID_ANTECEDENTES_ALIMENTARIOS")
	private AntecedentesAlimentario antecedentesAlimentario;

	public Alimento() {
	}

	public int getIdAlimentos() {
		return this.idAlimentos;
	}

	public void setIdAlimentos(int idAlimentos) {
		this.idAlimentos = idAlimentos;
	}

	public String getDescripcionAlimento() {
		return this.descripcionAlimento;
	}

	public void setDescripcionAlimento(String descripcionAlimento) {
		this.descripcionAlimento = descripcionAlimento;
	}

	public String getNombreAlimento() {
		return this.nombreAlimento;
	}

	public void setNombreAlimento(String nombreAlimento) {
		this.nombreAlimento = nombreAlimento;
	}

	public AntecedentesAlimentario getAntecedentesAlimentario() {
		return this.antecedentesAlimentario;
	}

	public void setAntecedentesAlimentario(AntecedentesAlimentario antecedentesAlimentario) {
		this.antecedentesAlimentario = antecedentesAlimentario;
	}

}