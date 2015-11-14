package entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the familiar_paciente database table.
 * 
 */
@Entity
@Table(name="familiar_paciente")
@NamedQuery(name="FamiliarPaciente.findAll", query="SELECT f FROM FamiliarPaciente f")
public class FamiliarPaciente implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_FAMILIAR_PACIENTE")
	private int idFamiliarPaciente;

	@Column(name="PARENTEZCO_PACIENTE")
	private String parentezcoPaciente;

	//bi-directional many-to-one association to DatosMedico
	@ManyToOne
	@JoinColumn(name="ID_DATOS_MEDICOS")
	private DatosMedico datosMedico;

	//bi-directional many-to-one association to PatologiasAsociada
	@ManyToOne
	@JoinColumn(name="ID_PATOLOGIAS_ASOCIADAS")
	private PatologiasAsociada patologiasAsociada;

	//bi-directional many-to-one association to PatologiasAsociada
	@OneToMany(mappedBy="familiarPaciente")
	private List<PatologiasAsociada> patologiasAsociadas;

	public FamiliarPaciente() {
	}

	public int getIdFamiliarPaciente() {
		return this.idFamiliarPaciente;
	}

	public void setIdFamiliarPaciente(int idFamiliarPaciente) {
		this.idFamiliarPaciente = idFamiliarPaciente;
	}

	public String getParentezcoPaciente() {
		return this.parentezcoPaciente;
	}

	public void setParentezcoPaciente(String parentezcoPaciente) {
		this.parentezcoPaciente = parentezcoPaciente;
	}

	public DatosMedico getDatosMedico() {
		return this.datosMedico;
	}

	public void setDatosMedico(DatosMedico datosMedico) {
		this.datosMedico = datosMedico;
	}

	public PatologiasAsociada getPatologiasAsociada() {
		return this.patologiasAsociada;
	}

	public void setPatologiasAsociada(PatologiasAsociada patologiasAsociada) {
		this.patologiasAsociada = patologiasAsociada;
	}

	public List<PatologiasAsociada> getPatologiasAsociadas() {
		return this.patologiasAsociadas;
	}

	public void setPatologiasAsociadas(List<PatologiasAsociada> patologiasAsociadas) {
		this.patologiasAsociadas = patologiasAsociadas;
	}

	public PatologiasAsociada addPatologiasAsociada(PatologiasAsociada patologiasAsociada) {
		getPatologiasAsociadas().add(patologiasAsociada);
		patologiasAsociada.setFamiliarPaciente(this);

		return patologiasAsociada;
	}

	public PatologiasAsociada removePatologiasAsociada(PatologiasAsociada patologiasAsociada) {
		getPatologiasAsociadas().remove(patologiasAsociada);
		patologiasAsociada.setFamiliarPaciente(null);

		return patologiasAsociada;
	}

}