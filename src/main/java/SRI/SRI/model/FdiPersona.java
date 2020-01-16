package SRI.SRI.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the fdi_persona database table.
 * 
 */
@Entity
@Table(name="fdi_persona")
@NamedQuery(name="FdiPersona.findAll", query="SELECT f FROM FdiPersona f")
public class FdiPersona implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="FDI_PERSONA_PRSID_GENERATOR", sequenceName="FDI_PERSONA_PRS_ID_SEQ",allocationSize=1,initialValue=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="FDI_PERSONA_PRSID_GENERATOR")
	@Column(name="prs_id")
	private Integer prsId;

	@Column(name="prs_apellido")
	private String prsApellido;

	@Column(name="prs_canton")
	private String prsCanton;

	@Column(name="prs_cedula")
	private String prsCedula;

	@Column(name="prs_correo")
	private String prsCorreo;

	@Column(name="prs_dir_recidencia")
	private String prsDirRecidencia;

	@Column(name="prs_discapacidad")
	private Boolean prsDiscapacidad;

	@Column(name="prs_estado")
	private Boolean prsEstado;

	@Column(name="prs_estado_civil")
	private String prsEstadoCivil;

	@Column(name="prs_etnia")
	private String prsEtnia;

	@Temporal(TemporalType.DATE)
	@Column(name="prs_fecha_nacimiento")
	private Date prsFechaNacimiento;

	@Column(name="prs_grupo_sanguineo")
	private String prsGrupoSanguineo;

	@Column(name="prs_nacionalidad")
	private String prsNacionalidad;

	@Column(name="prs_nombre")
	private String prsNombre;

	@Column(name="prs_nommadre")
	private String prsNommadre;

	@Column(name="prs_nompadre")
	private String prsNompadre;

	@Column(name="prs_ocupacion")
	private String prsOcupacion;

	@Column(name="prs_parroquia")
	private String prsParroquia;

	@Column(name="prs_provincia")
	private String prsProvincia;

	@Column(name="prs_sexo")
	private String prsSexo;

	@Column(name="prs_telefono")
	private String prsTelefono;

	@Column(name="prs_telpadres")
	private String prsTelpadres;

	@Column(name="prs_tipodiscapacidad")
	private String prsTipodiscapacidad;

	public FdiPersona() {
	}

	public Integer getPrsId() {
		return this.prsId;
	}

	public void setPrsId(Integer prsId) {
		this.prsId = prsId;
	}

	public String getPrsApellido() {
		return this.prsApellido;
	}

	public void setPrsApellido(String prsApellido) {
		this.prsApellido = prsApellido;
	}

	public String getPrsCanton() {
		return this.prsCanton;
	}

	public void setPrsCanton(String prsCanton) {
		this.prsCanton = prsCanton;
	}

	public String getPrsCedula() {
		return this.prsCedula;
	}

	public void setPrsCedula(String prsCedula) {
		this.prsCedula = prsCedula;
	}

	public String getPrsCorreo() {
		return this.prsCorreo;
	}

	public void setPrsCorreo(String prsCorreo) {
		this.prsCorreo = prsCorreo;
	}

	public String getPrsDirRecidencia() {
		return this.prsDirRecidencia;
	}

	public void setPrsDirRecidencia(String prsDirRecidencia) {
		this.prsDirRecidencia = prsDirRecidencia;
	}

	public Boolean getPrsDiscapacidad() {
		return this.prsDiscapacidad;
	}

	public void setPrsDiscapacidad(Boolean prsDiscapacidad) {
		this.prsDiscapacidad = prsDiscapacidad;
	}

	public Boolean getPrsEstado() {
		return this.prsEstado;
	}

	public void setPrsEstado(Boolean prsEstado) {
		this.prsEstado = prsEstado;
	}

	public String getPrsEstadoCivil() {
		return this.prsEstadoCivil;
	}

	public void setPrsEstadoCivil(String prsEstadoCivil) {
		this.prsEstadoCivil = prsEstadoCivil;
	}

	public String getPrsEtnia() {
		return this.prsEtnia;
	}

	public void setPrsEtnia(String prsEtnia) {
		this.prsEtnia = prsEtnia;
	}

	public Date getPrsFechaNacimiento() {
		return this.prsFechaNacimiento;
	}

	public void setPrsFechaNacimiento(Date prsFechaNacimiento) {
		this.prsFechaNacimiento = prsFechaNacimiento;
	}

	public String getPrsGrupoSanguineo() {
		return this.prsGrupoSanguineo;
	}

	public void setPrsGrupoSanguineo(String prsGrupoSanguineo) {
		this.prsGrupoSanguineo = prsGrupoSanguineo;
	}

	public String getPrsNacionalidad() {
		return this.prsNacionalidad;
	}

	public void setPrsNacionalidad(String prsNacionalidad) {
		this.prsNacionalidad = prsNacionalidad;
	}

	public String getPrsNombre() {
		return this.prsNombre;
	}

	public void setPrsNombre(String prsNombre) {
		this.prsNombre = prsNombre;
	}

	public String getPrsNommadre() {
		return this.prsNommadre;
	}

	public void setPrsNommadre(String prsNommadre) {
		this.prsNommadre = prsNommadre;
	}

	public String getPrsNompadre() {
		return this.prsNompadre;
	}

	public void setPrsNompadre(String prsNompadre) {
		this.prsNompadre = prsNompadre;
	}

	public String getPrsOcupacion() {
		return this.prsOcupacion;
	}

	public void setPrsOcupacion(String prsOcupacion) {
		this.prsOcupacion = prsOcupacion;
	}

	public String getPrsParroquia() {
		return this.prsParroquia;
	}

	public void setPrsParroquia(String prsParroquia) {
		this.prsParroquia = prsParroquia;
	}

	public String getPrsProvincia() {
		return this.prsProvincia;
	}

	public void setPrsProvincia(String prsProvincia) {
		this.prsProvincia = prsProvincia;
	}

	public String getPrsSexo() {
		return this.prsSexo;
	}

	public void setPrsSexo(String prsSexo) {
		this.prsSexo = prsSexo;
	}

	public String getPrsTelefono() {
		return this.prsTelefono;
	}

	public void setPrsTelefono(String prsTelefono) {
		this.prsTelefono = prsTelefono;
	}

	public String getPrsTelpadres() {
		return this.prsTelpadres;
	}

	public void setPrsTelpadres(String prsTelpadres) {
		this.prsTelpadres = prsTelpadres;
	}

	public String getPrsTipodiscapacidad() {
		return this.prsTipodiscapacidad;
	}

	public void setPrsTipodiscapacidad(String prsTipodiscapacidad) {
		this.prsTipodiscapacidad = prsTipodiscapacidad;
	}

}