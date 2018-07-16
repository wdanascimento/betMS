package br.com.betMS.dto;

import br.com.betMS.model.Concurso;

public class ConcursoDTO {

	private Integer  concurso;
    private Integer  concursoAnterior;
    private Integer  proximoConcurso;    
    private String   resultadoOrdenado;
    private String   dataSorteio;
    private String   deLocalSorteio;
    private String   noCidade;
    private String   sgUf;
    
    public Concurso transformaParaObjeto(){
    	
    	Concurso concursoDAO = new Concurso();
    	
    	concursoDAO.setConcurso(concurso);
    	concursoDAO.setConcursoAnterior(concursoAnterior);
    	concursoDAO.setProximoConcurso(proximoConcurso);
    	//
 		String dezenas[] = resultadoOrdenado.split("-");
 		concursoDAO.setDezena1(Integer.valueOf(dezenas[0])); //imprime dezena 1
 		concursoDAO.setDezena2(Integer.valueOf(dezenas[1])); //imprime dezena 2
 		concursoDAO.setDezena3(Integer.valueOf(dezenas[2])); //imprime dezena 3
 		concursoDAO.setDezena4(Integer.valueOf(dezenas[3])); //imprime dezena 4
 		concursoDAO.setDezena5(Integer.valueOf(dezenas[4])); //imprime dezena 5
 		concursoDAO.setDezena6(Integer.valueOf(dezenas[5])); //imprime dezena 6
        //
        String dataSeparada[] = dataSorteio.split("/");
        concursoDAO.setDiaSorteio(Integer.valueOf(dataSeparada[0])); //Dia do Sorteio
        concursoDAO.setMesSorteio(Integer.valueOf(dataSeparada[1])); //Mês do Sorteio
        concursoDAO.setAnoSorteio(Integer.valueOf(dataSeparada[2])); //Ano do Sorteio
 		//
    	concursoDAO.setDeLocalSorteio(deLocalSorteio);
    	concursoDAO.setNoCidade(noCidade);
    	concursoDAO.setSgUf(sgUf);
    	
        return concursoDAO;
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
	public String getResultadoOrdenado() {
		return resultadoOrdenado;
	}
	public void setResultadoOrdenado(String resultadoOrdenado) {
		this.resultadoOrdenado = resultadoOrdenado;
	}
	public String getDataSorteio() {
		return dataSorteio;
	}
	public void setDataSorteio(String dataSorteio) {
		this.dataSorteio = dataSorteio;
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
	
	@Override
	public String toString() {
		return "ConcursoDTO [concurso=" + concurso + ", concursoAnterior=" + concursoAnterior + ", proximoConcurso="
				+ proximoConcurso + ", resultadoOrdenado=" + resultadoOrdenado + ", dataSorteio=" + dataSorteio
				+ ", deLocalSorteio=" + deLocalSorteio + ", noCidade=" + noCidade + ", sgUf=" + sgUf + "]";
	}
}
