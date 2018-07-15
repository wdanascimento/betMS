package br.com.betMS.dto;

import br.com.betMS.model.Concurso;

public class ConcursoRespostaDTO {

	private Integer  concurso; 
	private String   resultadoOrdenado;
	private String   dataSorteio;
	private String   deLocalSorteio;
	private String   noCidade;
	private String   sgUf;

	public static ConcursoRespostaDTO transformaEmDTO(Concurso concurso) {
        
		String resultadoOrdenado = concurso.getDezena1().toString()+"-"+
				                   concurso.getDezena2().toString()+"-"+
				                   concurso.getDezena3().toString()+"-"+
				                   concurso.getDezena4().toString()+"-"+
				                   concurso.getDezena5().toString()+"-"+
				                   concurso.getDezena6().toString();
		
		String dataSorteio = concurso.getDiaSorteio().toString()+"/"+
                             concurso.getMesSorteio().toString()+"/"+
                             concurso.getAnoSorteio().toString();
		
		return new ConcursoRespostaDTO(concurso.getConcurso(), 
				                       resultadoOrdenado, 
				                       dataSorteio,
        		                       concurso.getDeLocalSorteio(), 
        		                       concurso.getNoCidade(),
        		                       concurso.getSgUf());
    }
	
	
	public ConcursoRespostaDTO( Integer concurso
			                  , String resultadoOrdenado
			                  , String dataSorteio
			                  , String deLocalSorteio
			                  , String noCidade
			                  , String sgUf) {
		super();
		this.concurso = concurso;
		this.resultadoOrdenado = resultadoOrdenado;
		this.dataSorteio = dataSorteio;
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
}