package entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the paciente database table.
 * 
 */
@Entity
@NamedQuery(name="Paciente.findAll", query="SELECT p FROM Paciente p")
public class Paciente implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_PACIENTE")
	private int idPaciente;

	@Column(name="APELLIDO_PACIENTE")
	private String apellidoPaciente;

	@Column(name="CORREO_PACIENTE")
	private String correoPaciente;

	@Temporal(TemporalType.DATE)
	@Column(name="FECHA_PACIENTE")
	private Date fechaPaciente;

	@Column(name="NOMBRE_PACIENTE")
	private String nombrePaciente;

	@Column(name="ROL_PACIENTE")
	private String rolPaciente;

	@Column(name="SEXO_PACIENTE")
	private String sexoPaciente;

	@Column(name="TELEFONO_PACIENTE")
	private String telefonoPaciente;

	//bi-directional many-to-one association to HistoriaClinica
	@OneToMany(mappedBy="paciente")
	private List<HistoriaClinica> historiaClinicas;

	public Paciente() {
	}

	public int getIdPaciente() {
		return this.idPaciente;
	}

	public void setIdPaciente(int idPaciente) {
		this.idPaciente = idPaciente;
	}

	public String getApellidoPaciente() {
		return this.apellidoPaciente;
	}

	public void setApellidoPaciente(String apellidoPaciente) {
		this.apellidoPaciente = apellidoPaciente;
	}

	public String getCorreoPaciente() {
		return this.correoPaciente;
	}

	public void setCorreoPaciente(String correoPaciente) {
		this.correoPaciente = correoPaciente;
	}

	public Date getFechaPaciente() {
		return this.fechaPaciente;
	}

	public void setFechaPaciente(Date fechaPaciente) {
		this.fechaPaciente = fechaPaciente;
	}

	public String getNombrePaciente() {
		return this.nombrePaciente;
	}

	public void setNombrePaciente(String nombrePaciente) {
		this.nombrePaciente = nombrePaciente;
	}

	public String getRolPaciente() {
		return this.rolPaciente;
	}

	public void setRolPaciente(String rolPaciente) {
		this.rolPaciente = rolPaciente;
	}

	public String getSexoPaciente() {
		return this.sexoPaciente;
	}

	public void setSexoPaciente(String sexoPaciente) {
		this.sexoPaciente = sexoPaciente;
	}

	public String getTelefonoPaciente() {
		return this.telefonoPaciente;
	}

	public void setTelefonoPaciente(String telefonoPaciente) {
		this.telefonoPaciente = telefonoPaciente;
	}

	public List<HistoriaClinica> getHistoriaClinicas() {
		return this.historiaClinicas;
	}

	public void setHistoriaClinicas(List<HistoriaClinica> historiaClinicas) {
		this.historiaClinicas = historiaClinicas;
	}

	public HistoriaClinica addHistoriaClinica(HistoriaClinica historiaClinica) {
		getHistoriaClinicas().add(historiaClinica);
		historiaClinica.setPaciente(this);

		return historiaClinica;
	}

	public HistoriaClinica removeHistoriaClinica(HistoriaClinica historiaClinica) {
		getHistoriaClinicas().remove(historiaClinica);
		historiaClinica.setPaciente(null);

		return historiaClinica;
	}

}