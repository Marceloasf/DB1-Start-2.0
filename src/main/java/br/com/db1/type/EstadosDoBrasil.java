package br.com.db1.type;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public enum EstadosDoBrasil {
	ACRE("Acre","Norte"),
    ALAGOAS("Alagoas","Nordeste"),
    AMAPA("Amapá", "Norte"),
    AMAZONAS("Amazonas", "Norte"),
    BAHIA("Bahia", "Nordeste"),
    CEARA("Ceara","Nordeste") ,
    DISTRITO_FEDERAL("Distrito Federal", "Centro Oeste"),
    ESPIRITO_SANTO("Espirito Santo", "Sudeste"),
    GOIAS("Goiás","Centro Oeste") ,
    MARANHAO("Maranhão", "Nordeste"),
    MATO_GROSSO("Mato Grosso", "Centro Oeste") ,
    MATO_GROSSO_DO_SUL("Mato Grosso do Sul", "Centro Oeste") ,
    MINAS_GERAIS("Minas Gerais", "Sudeste") ,
    PARA("Pará","Norte") ,
    PARAIBA("Paraíba","Nordeste") ,
    PARANA("Paraná","Sul"),
    PERNAMBUCO("Pernambuco","Nordeste"),
    PIAUI("Piauí", "Nordeste"),
    RIO_DE_JANEIRO("Rio de Janeiro", "Sudeste") ,
    RIO_GRANDE_DO_NORTE("Rio Grande do Norte", "Nordeste"),
    RIO_GRANDE_DO_SUL("Rio Grande do Sul","Sul") ,
    RONDONIA("Rondônia", "Norte"),
    RORAIMA("Roraima", "Norte"),
    SANTA_CATARINA("Santa Catarina","Sul"),
    SAO_PAULO("São Paulo", "Sudeste"),
    SERGIPE("Sergipe","Nordeste"),
    TOCANTINS("Tocantins", "Norte");
	
	
	
	private String estados;
	EstadosDoBrasil(String estados, String regiao){
		this.estados = estados;
	}
	
	public String getEstados() {
		return estados;
	}
	
	public List<EstadosDoBrasil> retornaEstadosDoSul(){
		List<EstadosDoBrasil> sul = new ArrayList<EstadosDoBrasil>();
		sul.add(PARANA);
		sul.add(SANTA_CATARINA);
		sul.add(RIO_GRANDE_DO_SUL);
		Collections.sort(sul);
		System.out.println(sul);
		return sul;
	}
	
	public List<EstadosDoBrasil> retornaEstadosDoSudeste(){
		List<EstadosDoBrasil> sudeste = new ArrayList<EstadosDoBrasil>();
		sudeste.add(ESPIRITO_SANTO);
		sudeste.add(MINAS_GERAIS);
		sudeste.add(RIO_DE_JANEIRO);
		sudeste.add(SAO_PAULO);
		Collections.sort(sudeste);
		System.out.println(sudeste);
		return sudeste;
	}
	
	public List<EstadosDoBrasil> retornaEstadosDoCentroOeste(){
		List<EstadosDoBrasil> centroOeste = new ArrayList<EstadosDoBrasil>();
		centroOeste.add(DISTRITO_FEDERAL);
		centroOeste.add(GOIAS);
		centroOeste.add(MATO_GROSSO);
		centroOeste.add(MATO_GROSSO_DO_SUL);
		Collections.sort(centroOeste);
		System.out.println(centroOeste);
		return centroOeste;
	}
	
	public List<EstadosDoBrasil> retornaEstadosDoNorte(){
		List<EstadosDoBrasil> norte = new ArrayList<EstadosDoBrasil>();
		norte.add(AMAPA);
		norte.add(AMAZONAS);
		norte.add(ACRE);
		norte.add(PARA);
		norte.add(RONDONIA);
		norte.add(TOCANTINS);
		norte.add(RORAIMA);
		Collections.sort(norte);
		System.out.println(norte);
		return norte;
	}
	
	public List<EstadosDoBrasil> retornaEstadosDoNordeste(){
		List<EstadosDoBrasil> nordeste = new ArrayList<EstadosDoBrasil>();
		nordeste.add(BAHIA);
		nordeste.add(MARANHAO);
		nordeste.add(ALAGOAS);
		nordeste.add(SERGIPE);
		nordeste.add(PIAUI);
		nordeste.add(PERNAMBUCO);
		nordeste.add(RIO_GRANDE_DO_NORTE);
		nordeste.add(PARAIBA);
		nordeste.add(CEARA);
		Collections.sort(nordeste);
		System.out.println(nordeste);
		return nordeste;
	}
	
	
	
	
    
    

	
}
