package entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the antecedentes_alimentarios database table.
 * 
 */
@Entity
@Table(name="antecedentes_alimentarios")
@NamedQuery(name="AntecedentesAlimentario.findAll", query="SELECT a FROM AntecedentesAlimentario a")
public class AntecedentesAlimentario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_ANTECEDENTES_ALIMENTARIOS")
	private int idAntecedentesAlimentarios;

	@Column(name="AGUA_SOLA")
	private int aguaSola;

	@Column(name="ALIMENTOS_PREFERIDOS")
	private String alimentosPreferidos;

	private String apetito;

	@Column(name="CON_QUIEN_VIVE")
	private String conQuienVive;

	@Column(name="DIFICULTAD_MASTICAR_TRAGAR")
	private byte dificultadMasticarTragar;

	@Column(name="DONDE_ALIMENTA")
	private String dondeAlimenta;

	private String habitos;

	private int liquidos;

	@Column(name="QUIEN_PREPARA_ALIMENTO")
	private String quienPreparaAlimento;

	@Column(name="VECES_ALIMENTA")
	private int vecesAlimenta;

	//bi-directional many-to-one association to Alimento
	@OneToMany(mappedBy="antecedentesAlimentario")
	private List<Alimento> alimentos;

	//bi-directional many-to-one association to Paciente
	@ManyToOne
	@JoinColumn(name="ID_PACIENTE")
	private Paciente paciente;

	//bi-directional many-to-one association to IntoleranciaAlergica
	@OneToMany(mappedBy="antecedentesAlimentario")
	private List<IntoleranciaAlergica> intoleranciaAlergicas;

	//bi-directional many-to-one association to Paciente
	@OneToMany(mappedBy="antecedentesAlimentario")
	private List<Paciente> pacientes;

	//bi-directional many-to-one association to ProblemaGastrointestinal
	@OneToMany(mappedBy="antecedentesAlimentario")
	private List<ProblemaGastrointestinal> problemaGastrointestinals;

	public AntecedentesAlimentario() {
	}

	public int getIdAntecedentesAlimentarios() {
		return this.idAntecedentesAlimentarios;
	}

	public void setIdAntecedentesAlimentarios(int idAntecedentesAlimentarios) {
		this.idAntecedentesAlimentarios = idAntecedentesAlimentarios;
	}

	public int getAguaSola() {
		return this.aguaSola;
	}

	public void setAguaSola(int aguaSola) {
		this.aguaSola = aguaSola;
	}

	public String getAlimentosPreferidos() {
		return this.alimentosPreferidos;
	}

	public void setAlimentosPreferidos(String alimentosPreferidos) {
		this.alimentosPreferidos = alimentosPreferidos;
	}

	public String getApetito() {
		return this.apetito;
	}

	public void setApetito(String apetito) {
		this.apetito = apetito;
	}

	public String getConQuienVive() {
		return this.conQuienVive;
	}

	public void setConQuienVive(String conQuienVive) {
		this.conQuienVive = conQuienVive;
	}

	public byte getDificultadMasticarTragar() {
		return this.dificultadMasticarTragar;
	}

	public void setDificultadMasticarTragar(byte dificultadMasticarTragar) {
		this.dificultadMasticarTragar = dificultadMasticarTragar;
	}

	public String getDondeAlimenta() {
		return this.dondeAlimenta;
	}

	public void setDondeAlimenta(String dondeAlimenta) {
		this.dondeAlimenta = dondeAlimenta;
	}

	public String getHabitos() {
		return this.habitos;
	}

	public void setHabitos(String habitos) {
		this.habitos = habitos;
	}

	public int getLiquidos() {
		return this.liquidos;
	}

	public void setLiquidos(int liquidos) {
		this.liquidos = liquidos;
	}

	public String getQuienPreparaAlimento() {
		return this.quienPreparaAlimento;
	}

	public void setQuienPreparaAlimento(String quienPreparaAlimento) {
		this.quienPreparaAlimento = quienPreparaAlimento;
	}

	public int getVecesAlimenta() {
		return this.vecesAlimenta;
	}

	public void setVecesAlimenta(int vecesAlimenta) {
		this.vecesAlimenta = vecesAlimenta;
	}

	public List<Alimento> getAlimentos() {
		return this.alimentos;
	}

	public void setAlimentos(List<Alimento> alimentos) {
		this.alimentos = alimentos;
	}

	public Alimento addAlimento(Alimento alimento) {
		getAlimentos().add(alimento);
		alimento.setAntecedentesAlimentario(this);

		return alimento;
	}

	public Alimento removeAlimento(Alimento alimento) {
		getAlimentos().remove(alimento);
		alimento.setAntecedentesAlimentario(null);

		return alimento;
	}

	public Paciente getPaciente() {
		return this.paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public List<IntoleranciaAlergica> getIntoleranciaAlergicas() {
		return this.intoleranciaAlergicas;
	}

	public void setIntoleranciaAlergicas(List<IntoleranciaAlergica> intoleranciaAlergicas) {
		this.intoleranciaAlergicas = intoleranciaAlergicas;
	}

	public IntoleranciaAlergica addIntoleranciaAlergica(IntoleranciaAlergica intoleranciaAlergica) {
		getIntoleranciaAlergicas().add(intoleranciaAlergica);
		intoleranciaAlergica.setAntecedentesAlimentario(this);

		return intoleranciaAlergica;
	}

	public IntoleranciaAlergica removeIntoleranciaAlergica(IntoleranciaAlergica intoleranciaAlergica) {
		getIntoleranciaAlergicas().remove(intoleranciaAlergica);
		intoleranciaAlergica.setAntecedentesAlimentario(null);

		return intoleranciaAlergica;
	}

	public List<Paciente> getPacientes() {
		return this.pacientes;
	}

	public void setPacientes(List<Paciente> pacientes) {
		this.pacientes = pacientes;
	}

	public Paciente addPaciente(Paciente paciente) {
		getPacientes().add(paciente);
		paciente.setAntecedentesAlimentario(this);

		return paciente;
	}

	public Paciente removePaciente(Paciente paciente) {
		getPacientes().remove(paciente);
		paciente.setAntecedentesAlimentario(null);

		return paciente;
	}

	public List<ProblemaGastrointestinal> getProblemaGastrointestinals() {
		return this.problemaGastrointestinals;
	}

	public void setProblemaGastrointestinals(List<ProblemaGastrointestinal> problemaGastrointestinals) {
		this.problemaGastrointestinals = problemaGastrointestinals;
	}

	public ProblemaGastrointestinal addProblemaGastrointestinal(ProblemaGastrointestinal problemaGastrointestinal) {
		getProblemaGastrointestinals().add(problemaGastrointestinal);
		problemaGastrointestinal.setAntecedentesAlimentario(this);

		return problemaGastrointestinal;
	}

	public ProblemaGastrointestinal removeProblemaGastrointestinal(ProblemaGastrointestinal problemaGastrointestinal) {
		getProblemaGastrointestinals().remove(problemaGastrointestinal);
		problemaGastrointestinal.setAntecedentesAlimentario(null);

		return problemaGastrointestinal;
	}

}