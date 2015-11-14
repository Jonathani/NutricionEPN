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

	//bi-directional many-to-one association to IntoleranciasAlergica
	@OneToMany(mappedBy="antecedentesAlimentario")
	private List<IntoleranciasAlergica> intoleranciasAlergicas;

	//bi-directional many-to-one association to ProblemasGastrointestinale
	@OneToMany(mappedBy="antecedentesAlimentario")
	private List<ProblemasGastrointestinale> problemasGastrointestinales;

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

	public List<IntoleranciasAlergica> getIntoleranciasAlergicas() {
		return this.intoleranciasAlergicas;
	}

	public void setIntoleranciasAlergicas(List<IntoleranciasAlergica> intoleranciasAlergicas) {
		this.intoleranciasAlergicas = intoleranciasAlergicas;
	}

	public IntoleranciasAlergica addIntoleranciasAlergica(IntoleranciasAlergica intoleranciasAlergica) {
		getIntoleranciasAlergicas().add(intoleranciasAlergica);
		intoleranciasAlergica.setAntecedentesAlimentario(this);

		return intoleranciasAlergica;
	}

	public IntoleranciasAlergica removeIntoleranciasAlergica(IntoleranciasAlergica intoleranciasAlergica) {
		getIntoleranciasAlergicas().remove(intoleranciasAlergica);
		intoleranciasAlergica.setAntecedentesAlimentario(null);

		return intoleranciasAlergica;
	}

	public List<ProblemasGastrointestinale> getProblemasGastrointestinales() {
		return this.problemasGastrointestinales;
	}

	public void setProblemasGastrointestinales(List<ProblemasGastrointestinale> problemasGastrointestinales) {
		this.problemasGastrointestinales = problemasGastrointestinales;
	}

	public ProblemasGastrointestinale addProblemasGastrointestinale(ProblemasGastrointestinale problemasGastrointestinale) {
		getProblemasGastrointestinales().add(problemasGastrointestinale);
		problemasGastrointestinale.setAntecedentesAlimentario(this);

		return problemasGastrointestinale;
	}

	public ProblemasGastrointestinale removeProblemasGastrointestinale(ProblemasGastrointestinale problemasGastrointestinale) {
		getProblemasGastrointestinales().remove(problemasGastrointestinale);
		problemasGastrointestinale.setAntecedentesAlimentario(null);

		return problemasGastrointestinale;
	}

}