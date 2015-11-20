package entidades;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the patologia_asociada database table.
 * 
 */
@Entity
@Table(name="patologia_asociada")
@NamedQuery(name="PatologiaAsociada.findAll", query="SELECT p FROM PatologiaAsociada p")
public class PatologiaAsociada implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_PATOLOGIA_ASOCIADA")
	private int idPatologiaAsociada;

	@Column(name="DESCRIPCION_PATOLOGIA")
	private String descripcionPatologia;

	@Column(name="NOMBRE_PATOLOGIA")
	private String nombrePatologia;

	//bi-directional many-to-one association to DatosMedico
	@ManyToOne
	@JoinColumn(name="ID_DATOS_MEDICOS")
	private DatosMedico datosMedico;

	//bi-directional many-to-one association to FamiliarPaciente
	@ManyToOne
	@JoinColumn(name="ID_FAMILIAR_PACIENTE")
	private FamiliarPaciente familiarPaciente;

	public PatologiaAsociada() {
	}

	public int getIdPatologiasAsociadas() {
		return this.idPatologiaAsociada;
	}

	public void setIdPatologiasAsociadas(int idPatologiasAsociadas) {
		this.idPatologiaAsociada = idPatologiasAsociadas;
	}

	public String getDescripcionPatologia() {
		return this.descripcionPatologia;
	}

	public void setDescripcionPatologia(String descripcionPatologia) {
		this.descripcionPatologia = descripcionPatologia;
	}

	public String getNombrePatologia() {
		return this.nombrePatologia;
	}

	public void setNombrePatologia(String nombrePatologia) {
		this.nombrePatologia = nombrePatologia;
	}

	public DatosMedico getDatosMedico() {
		return this.datosMedico;
	}

	public void setDatosMedico(DatosMedico datosMedico) {
		this.datosMedico = datosMedico;
	}

	public FamiliarPaciente getFamiliarPaciente() {
		return this.familiarPaciente;
	}

	public void setFamiliarPaciente(FamiliarPaciente familiarPaciente) {
		this.familiarPaciente = familiarPaciente;
	}

}