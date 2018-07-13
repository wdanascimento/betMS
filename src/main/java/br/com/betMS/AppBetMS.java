package br.com.betMS;

import java.io.IOException;
import java.io.InputStream;
import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.CookiePolicy;
import java.net.URL;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;

//import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppBetMS {

	public static void main(String[] args) throws IOException {
		//SpringApplication.run(AppBetMS.class, args);
		
		int numeroConcurso = 2;
		
		URL url = new URL("http://loterias.caixa.gov.br/wps/portal/loterias/landing/megasena/"
		                 +"!ut/p/a1/04_Sj9CPykssy0xPLMnMz0vMAfGjzOLNDH0MPAzcDbwMPI0sDBxNXAOMwrzCjA0sjIEKIoEKnN0dPUzMfQwMDEwsjAw8XZw8XMwtfQ0MPM2I02-AAzgaENIfrh-FqsQ9wNnUwNHfxcnSwBgIDUyhCvA5EawAjxsKckMjDDI9FQE-F4ca"
		                 +"/dl5/d5/L2dBISEvZ0FBIS9nQSEh/pw/Z7_HGK818G0KO6H80AU71KG7J0072"
		                 +"/res/id=buscaResultado/c=cacheLevelPage/=/?timestampAjax=1531479334511&concurso=" + numeroConcurso);
        
        CookieHandler.setDefault(new CookieManager(null,CookiePolicy.ACCEPT_ALL));
        
        InputStream is = url.openStream();
        JsonReader jr = Json.createReader(is);
        JsonObject concursoMegaSena = jr.readObject();
        
        String resultado   = concursoMegaSena.get("resultadoOrdenado").toString().replace("\"", "");;
		String dataSorteio = concursoMegaSena.get("dataStr").toString().replace("\"", "");
        String dezenas[] = resultado.split("-");
        String dataSeparada[] = dataSorteio.split("/");
        
        System.out.println(concursoMegaSena.get("concurso"));
        System.out.println(resultado); //imprime resultado ordenado

        System.out.println(dezenas[0]); //imprime dezena 1
        System.out.println(dezenas[1]); //imprime dezena 2
        System.out.println(dezenas[2]); //imprime dezena 3
        System.out.println(dezenas[3]); //imprime dezena 4
        System.out.println(dezenas[4]); //imprime dezena 5
        System.out.println(dezenas[5]); //imprime dezena 6
        
        System.out.println(dataSorteio);     //Data Completa
        System.out.println(dataSeparada[0]); //dia
        System.out.println(dataSeparada[1]); //mes
        System.out.println(dataSeparada[2]); //ano
        
        System.out.println(concursoMegaSena.get("de_local_sorteio").toString().replace("\"", ""));
        System.out.println(concursoMegaSena.get("no_cidade").toString().replace("\"", ""));
        System.out.println(concursoMegaSena.get("sg_uf").toString().replace("\"", ""));

	}
}
