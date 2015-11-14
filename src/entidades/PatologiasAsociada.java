package entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the patologias_asociadas database table.
 * 
 */
@Entity
@Table(name="patologias_asociadas")
@NamedQuery(name="PatologiasAsociada.findAll", query="SELECT p FROM PatologiasAsociada p")
public class PatologiasAsociada implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_PATOLOGIAS_ASOCIADAS")
	private int idPatologiasAsociadas;

	@Column(name="DESCRIPCION_PATOLOGIA")
	private String descripcionPatologia;

	@Column(name="NOMBRE_PATOLOGIA")
	private String nombrePatologia;

	//bi-directional many-to-one association to DatosMedico
	@OneToMany(mappedBy="patologiasAsociada")
	private List<DatosMedico> datosMedicos;

	//bi-directional many-to-one association to FamiliarPaciente
	@OneToMany(mappedBy="patologiasAsociada")
	private List<FamiliarPaciente> familiarPacientes;

	//bi-directional many-to-one association to FamiliarPaciente
	@ManyToOne
	@JoinColumn(name="ID_FAMILIAR_PACIENTE")
	private FamiliarPaciente familiarPaciente;

	//bi-directional many-to-one association to DatosMedico
	@ManyToOne
	@JoinColumn(name="ID_DATOS_MEDICOS")
	private DatosMedico datosMedico;

	public PatologiasAsociada() {
	}

	public int getIdPatologiasAsociadas() {
		return this.idPatologiasAsociadas;
	}

	public void setIdPatologiasAsociadas(int idPatologiasAsociadas) {
		this.idPatologiasAsociadas = idPatologiasAsociadas;
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

	public List<DatosMedico> getDatosMedicos() {
		return this.datosMedicos;
	}

	public void setDatosMedicos(List<DatosMedico> datosMedicos) {
		this.datosMedicos = datosMedicos;
	}

	public DatosMedico addDatosMedico(DatosMedico datosMedico) {
		getDatosMedicos().add(datosMedico);
		datosMedico.setPatologiasAsociada(this);

		return datosMedico;
	}

	public DatosMedico removeDatosMedico(DatosMedico datosMedico) {
		getDatosMedicos().remove(datosMedico);
		datosMedico.setPatologiasAsociada(null);

		return datosMedico;
	}

	public List<FamiliarPaciente> getFamiliarPacientes() {
		return this.familiarPacientes;
	}

	public void setFamiliarPacientes(List<FamiliarPaciente> familiarPacientes) {
		this.familiarPacientes = familiarPacientes;
	}

	public FamiliarPaciente addFamiliarPaciente(FamiliarPaciente familiarPaciente) {
		getFamiliarPacientes().add(familiarPaciente);
		familiarPaciente.setPatologiasAsociada(this);

		return familiarPaciente;
	}

	public FamiliarPaciente removeFamiliarPaciente(FamiliarPaciente familiarPaciente) {
		getFamiliarPacientes().remove(familiarPaciente);
		familiarPaciente.setPatologiasAsociada(null);

		return familiarPaciente;
	}

	public FamiliarPaciente getFamiliarPaciente() {
		return this.familiarPaciente;
	}

	public void setFamiliarPaciente(FamiliarPaciente familiarPaciente) {
		this.familiarPaciente = familiarPaciente;
	}

	public DatosMedico getDatosMedico() {
		return this.datosMedico;
	}

	public void setDatosMedico(DatosMedico datosMedico) {
		this.datosMedico = datosMedico;
	}

}