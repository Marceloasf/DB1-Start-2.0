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
	private String regiao;
	
	public String getEstados() {
		return estados;
	}
	
	public String getRegiao() {
		return regiao;
	}
	
	
	
	EstadosDoBrasil(String estados, String regiao){
		this.estados = estados;
		this.regiao = regiao;
	}
	
	public static List<EstadosDoBrasil> retornaEstadosDoSul(){
		List<EstadosDoBrasil> sul = new ArrayList<EstadosDoBrasil>();
		sul.add(EstadosDoBrasil.PARANA);
		sul.add(EstadosDoBrasil.SANTA_CATARINA);
		sul.add(EstadosDoBrasil.RIO_GRANDE_DO_SUL);
		Collections.sort(sul);
		System.out.println(sul);
		return sul;
	}
	
	public static List<EstadosDoBrasil> retornaEstadosDoSudeste(){
		List<EstadosDoBrasil> sudeste = new ArrayList<EstadosDoBrasil>();
		sudeste.add(EstadosDoBrasil.ESPIRITO_SANTO);
		sudeste.add(EstadosDoBrasil.MINAS_GERAIS);
		sudeste.add(EstadosDoBrasil.RIO_DE_JANEIRO);
		sudeste.add(EstadosDoBrasil.SAO_PAULO);
		Collections.sort(sudeste);
		System.out.println(sudeste);
		return sudeste;
	}
	
	public static List<EstadosDoBrasil> retornaEstadosDoCentroOeste(){
		List<EstadosDoBrasil> centroOeste = new ArrayList<EstadosDoBrasil>();
		centroOeste.add(EstadosDoBrasil.DISTRITO_FEDERAL);
		centroOeste.add(EstadosDoBrasil.GOIAS);
		centroOeste.add(EstadosDoBrasil.MATO_GROSSO);
		centroOeste.add(EstadosDoBrasil.MATO_GROSSO_DO_SUL);
		Collections.sort(centroOeste);
		System.out.println(centroOeste);
		return centroOeste;
	}
	
	public static List<EstadosDoBrasil> retornaEstadosDoNorte(){
		List<EstadosDoBrasil> norte = new ArrayList<EstadosDoBrasil>();
		norte.add(EstadosDoBrasil.AMAPA);
		norte.add(EstadosDoBrasil.AMAZONAS);
		norte.add(EstadosDoBrasil.ACRE);
		norte.add(EstadosDoBrasil.PARA);
		norte.add(EstadosDoBrasil.RONDONIA);
		norte.add(EstadosDoBrasil.TOCANTINS);
		norte.add(EstadosDoBrasil.RORAIMA);
		Collections.sort(norte);
		System.out.println(norte);
		return norte;
	}
	
	public static List<EstadosDoBrasil> retornaEstadosDoNordeste(){
		List<EstadosDoBrasil> nordeste = new ArrayList<EstadosDoBrasil>();
		nordeste.add(EstadosDoBrasil.BAHIA);
		nordeste.add(EstadosDoBrasil.MARANHAO);
		nordeste.add(EstadosDoBrasil.ALAGOAS);
		nordeste.add(EstadosDoBrasil.SERGIPE);
		nordeste.add(EstadosDoBrasil.PIAUI);
		nordeste.add(EstadosDoBrasil.PERNAMBUCO);
		nordeste.add(EstadosDoBrasil.RIO_GRANDE_DO_NORTE);
		nordeste.add(EstadosDoBrasil.PARAIBA);
		nordeste.add(EstadosDoBrasil.CEARA);
		Collections.sort(nordeste);
		System.out.println(nordeste);
		return nordeste;
	}
	
	
	
	
    
    

	
}
