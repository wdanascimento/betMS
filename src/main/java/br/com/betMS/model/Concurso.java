package br.com.betMS.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Concurso {

	@Id
    private Integer  concurso;
    private Integer  concursoAnterior;
    private Integer  proximoConcurso;    
    private Integer  dezena1;
    private Integer  dezena2;
    private Integer  dezena3;
    private Integer  dezena4;
    private Integer  dezena5;
	private Integer  dezena6;
    private Integer  diaSorteio;
    private Integer  mesSorteio;
    private Integer  anoSorteio;
    private String   deLocalSorteio;
    private String   noCidade;
    private String   sgUf;
    
    public Concurso() {}
    
    public Concurso(Integer concurso, Integer concursoAnterior, Integer proximoConcurso, Integer dezena1,
			        Integer dezena2, Integer dezena3, Integer dezena4, Integer dezena5, Integer dezena6, Integer diaSorteio,
			        Integer mesSorteio, Integer anoSorteio, String deLocalSorteio, String noCidade, String sgUf) {
		super();
		this.concurso = concurso;
		this.concursoAnterior = concursoAnterior;
		this.proximoConcurso = proximoConcurso;
		this.dezena1 = dezena1;
		this.dezena2 = dezena2;
		this.dezena3 = dezena3;
		this.dezena4 = dezena4;
		this.dezena5 = dezena5;
		this.dezena6 = dezena6;
		this.diaSorteio = diaSorteio;
		this.mesSorteio = mesSorteio;
		this.anoSorteio = anoSorteio;
		this.deLocalSorteio = deLocalSorteio;
		this.noCidade = noCidade;
		this.sgUf = sgUf;
	}
    
    
	public Integer getConcurso() {
		return concurso;
	}
	public void setConcurso(Integer concurso) {
		this.concurso = concurso;
	}
	public Integer getConcursoAnterior() {
		return concursoAnterior;
	}
	public void setConcursoAnterior(Integer concursoAnterior) {
		this.concursoAnterior = concursoAnterior;
	}
	public Integer getProximoConcurso() {
		return proximoConcurso;
	}
	public void setProximoConcurso(Integer proximoConcurso) {
		this.proximoConcurso = proximoConcurso;
	}
	public Integer getDezena1() {
		return dezena1;
	}
	public void setDezena1(Integer dezena1) {
		this.dezena1 = dezena1;
	}
	public Integer getDezena2() {
		return dezena2;
	}
	public void setDezena2(Integer dezena2) {
		this.dezena2 = dezena2;
	}
	public Integer getDezena3() {
		return dezena3;
	}
	public void setDezena3(Integer dezena3) {
		this.dezena3 = dezena3;
	}
	public Integer getDezena4() {
		return dezena4;
	}
	public void setDezena4(Integer dezena4) {
		this.dezena4 = dezena4;
	}
	public Integer getDezena5() {
		return dezena5;
	}
	public void setDezena5(Integer dezena5) {
		this.dezena5 = dezena5;
	}
	public Integer getDezena6() {
		return dezena6;
	}
	public void setDezena6(Integer dezena6) {
		this.dezena6 = dezena6;
	}
	public Integer getDiaSorteio() {
		return diaSorteio;
	}
	public void setDiaSorteio(Integer diaSorteio) {
		this.diaSorteio = diaSorteio;
	}
	public Integer getMesSorteio() {
		return mesSorteio;
	}
	public void setMesSorteio(Integer mesSorteio) {
		this.mesSorteio = mesSorteio;
	}
	public Integer getAnoSorteio() {
		return anoSorteio;
	}
	public void setAnoSorteio(Integer anoSorteio) {
		this.anoSorteio = anoSorteio;
	}
	public String getDeLocalSorteio() {
		return deLocalSorteio;
	}
	public void setDeLocalSorteio(String deLocalSorteio) {
		this.deLocalSorteio = deLocalSorteio;
	}
	public String getNoCidade() {
		return noCidade;
	}
	public void setNoCidade(String noCidade) {
		this.noCidade = noCidade;
	}
	public String getSgUf() {
		return sgUf;
	}
	public void setSgUf(String sgUf) {
		this.sgUf = sgUf;
	}

}
