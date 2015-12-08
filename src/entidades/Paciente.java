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

	@Column(name="CEDULA_PACIENTE")
	private String cedulaPaciente;

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

	//bi-directional many-to-one association to AntecedenteSalud
	@OneToMany(mappedBy="paciente")
	private List<AntecedenteSalud> antecedenteSaluds;

	//bi-directional many-to-one association to AntecedentesAlimentario
	@OneToMany(mappedBy="paciente")
	private List<AntecedentesAlimentario> antecedentesAlimentarios;

	//bi-directional many-to-one association to Cirugia
	@OneToMany(mappedBy="paciente")
	private List<Cirugia> cirugias;

	//bi-directional many-to-one association to FamiliarPaciente
	@OneToMany(mappedBy="paciente")
	private List<FamiliarPaciente> familiarPacientes;

	//bi-directional many-to-one association to HistoriaClinica
	@OneToMany(mappedBy="paciente")
	private List<HistoriaClinica> historiaClinicas;

	//bi-directional many-to-one association to AntecedentesAlimentario
	@ManyToOne
	@JoinColumn(name="ID_ANTECEDENTES_ALIMENTARIOS")
	private AntecedentesAlimentario antecedentesAlimentario;

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

	public String getCedulaPaciente() {
		return this.cedulaPaciente;
	}

	public void setCedulaPaciente(String cedulaPaciente) {
		this.cedulaPaciente = cedulaPaciente;
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

	public List<AntecedenteSalud> getAntecedenteSaluds() {
		return this.antecedenteSaluds;
	}

	public void setAntecedenteSaluds(List<AntecedenteSalud> antecedenteSaluds) {
		this.antecedenteSaluds = antecedenteSaluds;
	}

	public AntecedenteSalud addAntecedenteSalud(AntecedenteSalud antecedenteSalud) {
		getAntecedenteSaluds().add(antecedenteSalud);
		antecedenteSalud.setPaciente(this);

		return antecedenteSalud;
	}

	public AntecedenteSalud removeAntecedenteSalud(AntecedenteSalud antecedenteSalud) {
		getAntecedenteSaluds().remove(antecedenteSalud);
		antecedenteSalud.setPaciente(null);

		return antecedenteSalud;
	}

	public List<AntecedentesAlimentario> getAntecedentesAlimentarios() {
		return this.antecedentesAlimentarios;
	}

	public void setAntecedentesAlimentarios(List<AntecedentesAlimentario> antecedentesAlimentarios) {
		this.antecedentesAlimentarios = antecedentesAlimentarios;
	}

	public AntecedentesAlimentario addAntecedentesAlimentario(AntecedentesAlimentario antecedentesAlimentario) {
		getAntecedentesAlimentarios().add(antecedentesAlimentario);
		antecedentesAlimentario.setPaciente(this);

		return antecedentesAlimentario;
	}

	public AntecedentesAlimentario removeAntecedentesAlimentario(AntecedentesAlimentario antecedentesAlimentario) {
		getAntecedentesAlimentarios().remove(antecedentesAlimentario);
		antecedentesAlimentario.setPaciente(null);

		return antecedentesAlimentario;
	}

	public List<Cirugia> getCirugias() {
		return this.cirugias;
	}

	public void setCirugias(List<Cirugia> cirugias) {
		this.cirugias = cirugias;
	}

	public Cirugia addCirugia(Cirugia cirugia) {
		getCirugias().add(cirugia);
		cirugia.setPaciente(this);

		return cirugia;
	}

	public Cirugia removeCirugia(Cirugia cirugia) {
		getCirugias().remove(cirugia);
		cirugia.setPaciente(null);

		return cirugia;
	}

	public List<FamiliarPaciente> getFamiliarPacientes() {
		return this.familiarPacientes;
	}

	public void setFamiliarPacientes(List<FamiliarPaciente> familiarPacientes) {
		this.familiarPacientes = familiarPacientes;
	}

	public FamiliarPaciente addFamiliarPaciente(FamiliarPaciente familiarPaciente) {
		getFamiliarPacientes().add(familiarPaciente);
		familiarPaciente.setPaciente(this);

		return familiarPaciente;
	}

	public FamiliarPaciente removeFamiliarPaciente(FamiliarPaciente familiarPaciente) {
		getFamiliarPacientes().remove(familiarPaciente);
		familiarPaciente.setPaciente(null);

		return familiarPaciente;
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

	public AntecedentesAlimentario getAntecedentesAlimentario() {
		return this.antecedentesAlimentario;
	}

	public void setAntecedentesAlimentario(AntecedentesAlimentario antecedentesAlimentario) {
		this.antecedentesAlimentario = antecedentesAlimentario;
	}

}