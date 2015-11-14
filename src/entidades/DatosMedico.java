package entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the datos_medicos database table.
 * 
 */
@Entity
@Table(name="datos_medicos")
@NamedQuery(name="DatosMedico.findAll", query="SELECT d FROM DatosMedico d")
public class DatosMedico implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_DATOS_MEDICOS")
	private int idDatosMedicos;

	@Column(name="EJERCICIO_TIPO")
	private String ejercicioTipo;

	@Column(name="EJERCICIO_VECES")
	private int ejercicioVeces;

	@Column(name="EJERICICIO_DURACION")
	private float ejericicioDuracion;

	@Column(name="REALIZA_EJERCICIO")
	private byte realizaEjercicio;

	//bi-directional many-to-one association to AntecedenteSalud
	@OneToMany(mappedBy="datosMedico")
	private List<AntecedenteSalud> antecedenteSaluds;

	//bi-directional many-to-one association to Antropometria
	@OneToMany(mappedBy="datosMedico")
	private List<Antropometria> antropometrias;

	//bi-directional many-to-one association to Cirugia
	@OneToMany(mappedBy="datosMedico")
	private List<Cirugia> cirugias;

	//bi-directional many-to-one association to PatologiasAsociada
	@ManyToOne
	@JoinColumn(name="ID_PATOLOGIAS_ASOCIADAS")
	private PatologiasAsociada patologiasAsociada;

	//bi-directional many-to-one association to Antropometria
	@ManyToOne
	@JoinColumn(name="ID_ANTROPOMETRIA")
	private Antropometria antropometria;

	//bi-directional many-to-one association to FamiliarPaciente
	@OneToMany(mappedBy="datosMedico")
	private List<FamiliarPaciente> familiarPacientes;

	//bi-directional many-to-one association to HistoriaClinica
	@OneToMany(mappedBy="datosMedico")
	private List<HistoriaClinica> historiaClinicas;

	//bi-directional many-to-one association to Medicamento
	@OneToMany(mappedBy="datosMedico")
	private List<Medicamento> medicamentos;

	//bi-directional many-to-one association to PatologiasAsociada
	@OneToMany(mappedBy="datosMedico")
	private List<PatologiasAsociada> patologiasAsociadas;

	//bi-directional many-to-one association to SuplementoNutricional
	@OneToMany(mappedBy="datosMedico")
	private List<SuplementoNutricional> suplementoNutricionals;

	public DatosMedico() {
	}

	public int getIdDatosMedicos() {
		return this.idDatosMedicos;
	}

	public void setIdDatosMedicos(int idDatosMedicos) {
		this.idDatosMedicos = idDatosMedicos;
	}

	public String getEjercicioTipo() {
		return this.ejercicioTipo;
	}

	public void setEjercicioTipo(String ejercicioTipo) {
		this.ejercicioTipo = ejercicioTipo;
	}

	public int getEjercicioVeces() {
		return this.ejercicioVeces;
	}

	public void setEjercicioVeces(int ejercicioVeces) {
		this.ejercicioVeces = ejercicioVeces;
	}

	public float getEjericicioDuracion() {
		return this.ejericicioDuracion;
	}

	public void setEjericicioDuracion(float ejericicioDuracion) {
		this.ejericicioDuracion = ejericicioDuracion;
	}

	public byte getRealizaEjercicio() {
		return this.realizaEjercicio;
	}

	public void setRealizaEjercicio(byte realizaEjercicio) {
		this.realizaEjercicio = realizaEjercicio;
	}

	public List<AntecedenteSalud> getAntecedenteSaluds() {
		return this.antecedenteSaluds;
	}

	public void setAntecedenteSaluds(List<AntecedenteSalud> antecedenteSaluds) {
		this.antecedenteSaluds = antecedenteSaluds;
	}

	public AntecedenteSalud addAntecedenteSalud(AntecedenteSalud antecedenteSalud) {
		getAntecedenteSaluds().add(antecedenteSalud);
		antecedenteSalud.setDatosMedico(this);

		return antecedenteSalud;
	}

	public AntecedenteSalud removeAntecedenteSalud(AntecedenteSalud antecedenteSalud) {
		getAntecedenteSaluds().remove(antecedenteSalud);
		antecedenteSalud.setDatosMedico(null);

		return antecedenteSalud;
	}

	public List<Antropometria> getAntropometrias() {
		return this.antropometrias;
	}

	public void setAntropometrias(List<Antropometria> antropometrias) {
		this.antropometrias = antropometrias;
	}

	public Antropometria addAntropometria(Antropometria antropometria) {
		getAntropometrias().add(antropometria);
		antropometria.setDatosMedico(this);

		return antropometria;
	}

	public Antropometria removeAntropometria(Antropometria antropometria) {
		getAntropometrias().remove(antropometria);
		antropometria.setDatosMedico(null);

		return antropometria;
	}

	public List<Cirugia> getCirugias() {
		return this.cirugias;
	}

	public void setCirugias(List<Cirugia> cirugias) {
		this.cirugias = cirugias;
	}

	public Cirugia addCirugia(Cirugia cirugia) {
		getCirugias().add(cirugia);
		cirugia.setDatosMedico(this);

		return cirugia;
	}

	public Cirugia removeCirugia(Cirugia cirugia) {
		getCirugias().remove(cirugia);
		cirugia.setDatosMedico(null);

		return cirugia;
	}

	public PatologiasAsociada getPatologiasAsociada() {
		return this.patologiasAsociada;
	}

	public void setPatologiasAsociada(PatologiasAsociada patologiasAsociada) {
		this.patologiasAsociada = patologiasAsociada;
	}

	public Antropometria getAntropometria() {
		return this.antropometria;
	}

	public void setAntropometria(Antropometria antropometria) {
		this.antropometria = antropometria;
	}

	public List<FamiliarPaciente> getFamiliarPacientes() {
		return this.familiarPacientes;
	}

	public void setFamiliarPacientes(List<FamiliarPaciente> familiarPacientes) {
		this.familiarPacientes = familiarPacientes;
	}

	public FamiliarPaciente addFamiliarPaciente(FamiliarPaciente familiarPaciente) {
		getFamiliarPacientes().add(familiarPaciente);
		familiarPaciente.setDatosMedico(this);

		return familiarPaciente;
	}

	public FamiliarPaciente removeFamiliarPaciente(FamiliarPaciente familiarPaciente) {
		getFamiliarPacientes().remove(familiarPaciente);
		familiarPaciente.setDatosMedico(null);

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
		historiaClinica.setDatosMedico(this);

		return historiaClinica;
	}

	public HistoriaClinica removeHistoriaClinica(HistoriaClinica historiaClinica) {
		getHistoriaClinicas().remove(historiaClinica);
		historiaClinica.setDatosMedico(null);

		return historiaClinica;
	}

	public List<Medicamento> getMedicamentos() {
		return this.medicamentos;
	}

	public void setMedicamentos(List<Medicamento> medicamentos) {
		this.medicamentos = medicamentos;
	}

	public Medicamento addMedicamento(Medicamento medicamento) {
		getMedicamentos().add(medicamento);
		medicamento.setDatosMedico(this);

		return medicamento;
	}

	public Medicamento removeMedicamento(Medicamento medicamento) {
		getMedicamentos().remove(medicamento);
		medicamento.setDatosMedico(null);

		return medicamento;
	}

	public List<PatologiasAsociada> getPatologiasAsociadas() {
		return this.patologiasAsociadas;
	}

	public void setPatologiasAsociadas(List<PatologiasAsociada> patologiasAsociadas) {
		this.patologiasAsociadas = patologiasAsociadas;
	}

	public PatologiasAsociada addPatologiasAsociada(PatologiasAsociada patologiasAsociada) {
		getPatologiasAsociadas().add(patologiasAsociada);
		patologiasAsociada.setDatosMedico(this);

		return patologiasAsociada;
	}

	public PatologiasAsociada removePatologiasAsociada(PatologiasAsociada patologiasAsociada) {
		getPatologiasAsociadas().remove(patologiasAsociada);
		patologiasAsociada.setDatosMedico(null);

		return patologiasAsociada;
	}

	public List<SuplementoNutricional> getSuplementoNutricionals() {
		return this.suplementoNutricionals;
	}

	public void setSuplementoNutricionals(List<SuplementoNutricional> suplementoNutricionals) {
		this.suplementoNutricionals = suplementoNutricionals;
	}

	public SuplementoNutricional addSuplementoNutricional(SuplementoNutricional suplementoNutricional) {
		getSuplementoNutricionals().add(suplementoNutricional);
		suplementoNutricional.setDatosMedico(this);

		return suplementoNutricional;
	}

	public SuplementoNutricional removeSuplementoNutricional(SuplementoNutricional suplementoNutricional) {
		getSuplementoNutricionals().remove(suplementoNutricional);
		suplementoNutricional.setDatosMedico(null);

		return suplementoNutricional;
	}

}