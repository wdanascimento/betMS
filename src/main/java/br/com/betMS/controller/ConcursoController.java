package br.com.betMS.controller;

import java.io.IOException;
import java.io.InputStream;
import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.CookiePolicy;
import java.net.URL;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.betMS.dto.ConcursoDTO;
import br.com.betMS.dto.ConcursoRespostaDTO;
import br.com.betMS.model.Concurso;
import br.com.betMS.services.ConcursoService;

@RequestMapping("/concurso")
@RestController
public class ConcursoController {

    private final ConcursoService concursoService;

    @Autowired
    public ConcursoController(ConcursoService concursoService) {
        this.concursoService = concursoService;
    }

    @PostMapping
    public ResponseEntity<ConcursoRespostaDTO> salvar(@RequestBody ConcursoDTO dto) throws IOException {
    	
    	 //2059 
		for (int numeroConcurso = 3; numeroConcurso <= 2059; numeroConcurso++) {
		
		   URL url = new URL("http://loterias.caixa.gov.br/wps/portal/loterias/landing/megasena/"
	                 +"!ut/p/a1/04_Sj9CPykssy0xPLMnMz0vMAfGjzOLNDH0MPAzcDbwMPI0sDBxNXAOMwrzCjA0sjIEKIoEKnN0dPUzMfQwMDEwsjAw8XZw8XMwtfQ0MPM2I02-AAzgaENIfrh-FqsQ9wNnUwNHfxcnSwBgIDUyhCvA5EawAjxsKckMjDDI9FQE-F4ca"
	                 +"/dl5/d5/L2dBISEvZ0FBIS9nQSEh/pw/Z7_HGK818G0KO6H80AU71KG7J0072"
	                 +"/res/id=buscaResultado/c=cacheLevelPage/=/?timestampAjax=1531479334511&concurso=" + numeroConcurso);
   
		   CookieHandler.setDefault(new CookieManager(null,CookiePolicy.ACCEPT_ALL));
		   
		   InputStream is = url.openStream();
		   JsonReader jr = Json.createReader(is);
		   JsonObject concursoMegaSena = jr.readObject();
		   
		   ConcursoDTO concursoDTO = new ConcursoDTO();
		   
		   concursoDTO.setConcurso(Integer.valueOf(concursoMegaSena.get("concurso").toString().replace("\"", "")));
		   concursoDTO.setConcursoAnterior(Integer.valueOf(concursoMegaSena.get("concursoAnterior").toString().replace("\"", "")));
		   concursoDTO.setProximoConcurso(Integer.valueOf(concursoMegaSena.get("proximoConcurso").toString().replace("\"", "")));
		   concursoDTO.setResultadoOrdenado(concursoMegaSena.get("resultadoOrdenado").toString().replace("\"", ""));
		   concursoDTO.setDataSorteio(concursoMegaSena.get("dataStr").toString().replace("\"", ""));
		   concursoDTO.setDeLocalSorteio(concursoMegaSena.get("de_local_sorteio").toString().replace("\"", "").toUpperCase());
		   concursoDTO.setNoCidade(concursoMegaSena.get("no_cidade").toString().replace("\"", "").toUpperCase());
		   concursoDTO.setSgUf(concursoMegaSena.get("sg_uf").toString().replace("\"", "").toUpperCase());
		   
		   concursoService.salvar(concursoDTO.transformaParaObjeto());
		
		   System.out.println(concursoDTO.toString());

		}
    	
        Concurso concurso = concursoService.salvar(dto.transformaParaObjeto());
        return new ResponseEntity<>(ConcursoRespostaDTO.transformaEmDTO(concurso), HttpStatus.CREATED);
    }

}