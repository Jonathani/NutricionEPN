package ec.edu.epn.nutricion.controller;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import ec.edu.epn.nutricion.model.servicio.ServicioGenerico;
import entidades.Alimento;
import entidades.AntecedenteAlimentario;
import entidades.Antropometria;
import entidades.Cirugia;
import entidades.DatosMedico;
import entidades.FamiliarPaciente;
import entidades.HistoriaClinica;
import entidades.IntoleranciaAlergica;
import entidades.Medicamento;
import entidades.Paciente;
import entidades.PatologiaAsociada;
import entidades.ProblemaGastrointestinal;
import entidades.SuplementoNutricional;

@ManagedBean
@SessionScoped
public class PacienteBean {
	private static final long serialVersionUID = 1L;

	@EJB
	private ServicioGenerico<Paciente> servicioPaciente;
	@EJB
	private ServicioGenerico<Alimento> servicioAlimento;
	@EJB
	private ServicioGenerico<AntecedenteAlimentario> servicioAntecedenteAlimentario;
	@EJB
	private ServicioGenerico<Antropometria> servicioAntropometria;
	@EJB
	private ServicioGenerico<Cirugia> servicioCirugia;
	@EJB
	private ServicioGenerico<DatosMedico> servicioDatosMedico;
	@EJB
	private ServicioGenerico<FamiliarPaciente> servicioFamiliarPaciente;
	@EJB
	private ServicioGenerico<HistoriaClinica> servicioHistoriaClinica;
	@EJB
	private ServicioGenerico<IntoleranciaAlergica> servicioIntoleranciaAlergia;
	@EJB
	private ServicioGenerico<Medicamento> servicioMedicamento;
	@EJB
	private ServicioGenerico<PatologiaAsociada> servicioPatologiaAsociada;
	@EJB
	private ServicioGenerico<ProblemaGastrointestinal> servicioProblemaGastrointestinal;
	@EJB
	private ServicioGenerico<SuplementoNutricional> servicioSuplementoNutricional;
	private Paciente paciente;
	private Alimento alimento;
	private AntecedenteAlimentario antecedenteAlimentario;
	private Antropometria antropometria;
	private Cirugia cirugia;
	private DatosMedico datosMedicos;
	private FamiliarPaciente familiarPaciente;
	private HistoriaClinica historiaClinica;
	private IntoleranciaAlergica intoleranciaAlergia;
	private Medicamento medicamento;
	private PatologiaAsociada patologiaAsociada;
	private ProblemaGastrointestinal problemaGastrointestinal;
	private SuplementoNutricional suplementoNutricional;

	private List<Paciente> listaPaciente;
	private List<Alimento> listaAlimento;
	private List<AntecedenteAlimentario> listaAntecedenteAlimentario;
	private List<Antropometria> listaAntropometria;
	private List<Cirugia> listaCirugia;
	private List<DatosMedico> listaDatosMedicos;
	private List<FamiliarPaciente> listaFamiliarPaciente;
	private List<HistoriaClinica> listaHistoriaClinica;
	private List<IntoleranciaAlergica> listaIntoleranciaAlergia;
	private List<Medicamento> listaMedicamento;
	private List<PatologiaAsociada> listaPatologiaAsociada;
	private List<ProblemaGastrointestinal> listaProblemaGastrointestinal;
	private List<SuplementoNutricional> listaSuplementoNutricional;

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public Alimento getAlimento() {
		return alimento;
	}

	public void setAlimento(Alimento alimento) {
		this.alimento = alimento;
	}

	public AntecedenteAlimentario getAntecedenteAlimentario() {
		return antecedenteAlimentario;
	}

	public void setAntecedenteAlimentario(
			AntecedenteAlimentario antecedenteAlimentario) {
		this.antecedenteAlimentario = antecedenteAlimentario;
	}

	public Antropometria getAntropometria() {
		return antropometria;
	}

	public void setAntropometria(Antropometria antropometria) {
		this.antropometria = antropometria;
	}

	public Cirugia getCirugia() {
		return cirugia;
	}

	public void setCirugia(Cirugia cirugia) {
		this.cirugia = cirugia;
	}

	public DatosMedico getDatosMedicos() {
		return datosMedicos;
	}

	public void setDatosMedicos(DatosMedico datosMedicos) {
		this.datosMedicos = datosMedicos;
	}

	public FamiliarPaciente getFamiliarPaciente() {
		return familiarPaciente;
	}

	public void setFamiliarPaciente(FamiliarPaciente familiarPaciente) {
		this.familiarPaciente = familiarPaciente;
	}

	public HistoriaClinica getHistoriaClinica() {
		return historiaClinica;
	}

	public void setHistoriaClinica(HistoriaClinica historiaClinica) {
		this.historiaClinica = historiaClinica;
	}

	public IntoleranciaAlergica getIntoleranciaAlergia() {
		return intoleranciaAlergia;
	}

	public void setIntoleranciaAlergia(IntoleranciaAlergica intoleranciaAlergia) {
		this.intoleranciaAlergia = intoleranciaAlergia;
	}

	public Medicamento getMedicamento() {
		return medicamento;
	}

	public void setMedicamento(Medicamento medicamento) {
		this.medicamento = medicamento;
	}

	public PatologiaAsociada getPatologiaAsociada() {
		return patologiaAsociada;
	}

	public void setPatologiaAsociada(PatologiaAsociada patologiaAsociada) {
		this.patologiaAsociada = patologiaAsociada;
	}

	public ProblemaGastrointestinal getProblemaGastrointestinal() {
		return problemaGastrointestinal;
	}

	public void setProblemaGastrointestinal(
			ProblemaGastrointestinal problemaGastrointestinal) {
		this.problemaGastrointestinal = problemaGastrointestinal;
	}

	public SuplementoNutricional getSuplementoNutricional() {
		return suplementoNutricional;
	}

	public void setSuplementoNutricional(
			SuplementoNutricional suplementoNutricional) {
		this.suplementoNutricional = suplementoNutricional;
	}

	public List<Paciente> getListaPaciente() {
		return listaPaciente;
	}

	public void setListaPaciente(List<Paciente> listaPaciente) {
		this.listaPaciente = listaPaciente;
	}

	public List<Alimento> getListaAlimento() {
		return listaAlimento;
	}

	public void setListaAlimento(List<Alimento> listaAlimento) {
		this.listaAlimento = listaAlimento;
	}

	public List<AntecedenteAlimentario> getListaAntecedenteAlimentario() {
		return listaAntecedenteAlimentario;
	}

	public void setListaAntecedenteAlimentario(
			List<AntecedenteAlimentario> listaAntecedenteAlimentario) {
		this.listaAntecedenteAlimentario = listaAntecedenteAlimentario;
	}

	public List<Antropometria> getListaAntropometria() {
		return listaAntropometria;
	}

	public void setListaAntropometria(List<Antropometria> listaAntropometria) {
		this.listaAntropometria = listaAntropometria;
	}

	public List<Cirugia> getListaCirugia() {
		return listaCirugia;
	}

	public void setListaCirugia(List<Cirugia> listaCirugia) {
		this.listaCirugia = listaCirugia;
	}

	public List<DatosMedico> getListaDatosMedicos() {
		return listaDatosMedicos;
	}

	public void setListaDatosMedicos(List<DatosMedico> listaDatosMedicos) {
		this.listaDatosMedicos = listaDatosMedicos;
	}

	public List<FamiliarPaciente> getListaFamiliarPaciente() {
		return listaFamiliarPaciente;
	}

	public void setListaFamiliarPaciente(
			List<FamiliarPaciente> listaFamiliarPaciente) {
		this.listaFamiliarPaciente = listaFamiliarPaciente;
	}

	public List<HistoriaClinica> getListaHistoriaClinica() {
		return listaHistoriaClinica;
	}

	public void setListaHistoriaClinica(
			List<HistoriaClinica> listaHistoriaClinica) {
		this.listaHistoriaClinica = listaHistoriaClinica;
	}

	public List<IntoleranciaAlergica> getListaIntoleranciaAlergia() {
		return listaIntoleranciaAlergia;
	}

	public void setListaIntoleranciaAlergia(
			List<IntoleranciaAlergica> listaIntoleranciaAlergia) {
		this.listaIntoleranciaAlergia = listaIntoleranciaAlergia;
	}

	public List<Medicamento> getListaMedicamento() {
		return listaMedicamento;
	}

	public void setListaMedicamento(List<Medicamento> listaMedicamento) {
		this.listaMedicamento = listaMedicamento;
	}

	public List<PatologiaAsociada> getListaPatologiaAsociada() {
		return listaPatologiaAsociada;
	}

	public void setListaPatologiaAsociada(
			List<PatologiaAsociada> listaPatologiaAsociada) {
		this.listaPatologiaAsociada = listaPatologiaAsociada;
	}

	public List<ProblemaGastrointestinal> getListaProblemaGastrointestinal() {
		return listaProblemaGastrointestinal;
	}

	public void setListaProblemaGastrointestinal(
			List<ProblemaGastrointestinal> listaProblemaGastrointestinal) {
		this.listaProblemaGastrointestinal = listaProblemaGastrointestinal;
	}

	public List<SuplementoNutricional> getListaSuplementoNutricional() {
		return listaSuplementoNutricional;
	}

	public void setListaSuplementoNutricional(
			List<SuplementoNutricional> listaSuplementoNutricional) {
		this.listaSuplementoNutricional = listaSuplementoNutricional;
	}
}
