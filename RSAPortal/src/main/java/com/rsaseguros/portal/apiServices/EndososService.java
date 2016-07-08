package com.rsaseguros.portal.apiServices;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.rsaseguros.portal.model.Endoso;

@Path("/endosos")
public class EndososService {
	
	@GET
	@Path("pendientes")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Endoso> getEndososPendientes() {		
		List<Endoso> pendientes = obtenerEndososPendientes();
		
		return pendientes;
	}
	
	@GET
	@Path("recientes")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Endoso> getEndososRecientes() {		
		List<Endoso> pendientes = obtenerEndososRecientes();		
		return pendientes;
	}
	
	private List<Endoso> obtenerEndososPendientes(){
List<Endoso> lista = new ArrayList<>();
		
		Date hoy = new Date();
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		String strHoy = df.format(hoy);
		
		Endoso e = new Endoso(1,1,420,"8000047591","JUAN CARLOS CASTRO NAVA","Bonificaci�n de la comisi�n o cesi�n de la comisi�n",strHoy,
				"pendiente",1,"DA�OS");
		lista.add(e);
		
		e = new Endoso(2,1,420,"7600084572","ENRIQUE ANTONIO AUTRIQUE","Cancelaci�n de p�lizasS",strHoy,
				"pendiente",1,"DA�OS");
		lista.add(e);
		
		e = new Endoso(3,1,420,"0018390004","ANGELICA MARTINEZ NEQUIZ","Alta de cobertura",strHoy,
				"pendiente",1,"MOTOR");
		lista.add(e);
		
		e = new Endoso(4,1,420,"8000047592","MANUEL ANTONIO GUILL�N G�MEZ","Alta de Beneficiario Preferente",strHoy,
				"pendiente",1,"PERSONAS");
		lista.add(e);
		
		e = new Endoso(5,1,420,"8000047593","FELIPE JACOB GALINDO","Cambios de forma de pago",strHoy,
				"pendiente",1,"MOTOR");
		lista.add(e);
		
		e = new Endoso(6,1,420,"8000047594","ERNESTO GUTI�RREZ DEGOLLADO","Cambios de forma de pago",strHoy,
				"pendiente",1,"DA�OS");
		lista.add(e);
		
		e = new Endoso(7,1,420,"8000047595","ANDR�S SANTILL�N C�RDENAS","Alta de situaci�n de riesgo, Alta de asegurado",strHoy,
				"pendiente",1,"PERSONAS");
		lista.add(e);
		
		e = new Endoso(8,1,420,"8000047596","JUAN FERN�NDEZ ISLAS","Baja de situaci�n de riesgo, Baja de asegurado",strHoy,
				"pendiente",1,"PERSONAS");
		lista.add(e);
		
		e = new Endoso(9,1,420,"8000047597","DAFNE SOLIS","Cancelaci�n de p�lizas",strHoy,
				"pendiente",1,"MOTOR");
		lista.add(e);
		
		e = new Endoso(10,1,420,"8000047598","LUIS FERNANDO MAQUEDA","Cambios de forma de pago",strHoy,
				"pendiente",1,"DA�OS");
		lista.add(e);
		
		e = new Endoso(11,1,420,"8000047599","FRANCISCO AYALA MART�NEZ","Alta de Beneficiario Preferente",strHoy,
				"pendiente",1,"DA�OS");
		lista.add(e);
		
		e = new Endoso(12,1,420,"8000047100","HAZIEL ISA� GUILL�N L�PEZ","Alta de Beneficiario Preferente",strHoy,
				"pendiente",1,"MOTOR");
		lista.add(e);
		
		e = new Endoso(13,1,420,"8000047101","EDY AVENDA�O RAM�REZ","Alta de Beneficiario Preferente",strHoy,
				"pendiente",1,"PERSONAS");
		lista.add(e);
		
		e = new Endoso(14,1,420,"8000047102","JOS� LUIS GONZ�LEZ GALVEZ","Alta de Beneficiario Preferente",strHoy,
				"pendiente",1,"DA�OS");
		lista.add(e);
		
		e = new Endoso(15,1,420,"8000047103","JORGE ALBERTO LASTRA P�REZ","Alta de Beneficiario Preferente",strHoy,
				"pendiente",1,"MOTOR");
		lista.add(e);
		
		return lista;
	}
	
	private List<Endoso> obtenerEndososRecientes(){
		Date hoy = new Date();
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		String strHoy = df.format(hoy);
		
		List<Endoso> lista = new ArrayList<>();
		
		Endoso e = new Endoso(16,1,420,"8000047933","JOSE MANUEL ESCOBAR","Correcci�n de RFC",strHoy,
				"reciente",1,"DA�OS");
		lista.add(e);
		
		e = new Endoso(17,1,420,"8100485006","OMAR ACEVES CORTEZ","Cambio de Forma de Pago",strHoy,
				"reciente",1,"DA�OS");
		lista.add(e);
		
		e = new Endoso(18,1,420,"8100004857","ANDRE CASTILLO BARR�N","Correcci�n de RFC",strHoy,
				"reciente",1,"MOTOR");
		lista.add(e);
		
		e = new Endoso(19,1,420,"9999999999","ALEJANDRA CHAVEZ MARTI","Cancelaci�n de P�liza",strHoy,
				"reciente",1,"PERSONAS");
		lista.add(e);
		
		e = new Endoso(20,1,420,"8000047933","JOSE TERRERO FENDER","Cesi�n de la Comisi�n",strHoy,
				"reciente",1,"MOTOR");
		lista.add(e);
		
		e = new Endoso(21,1,420,"5560005892","ANTONIO CASTRO NERI","Bonificaci�n de la Comisi�n",strHoy,
				"reciente",1,"DA�OS");
		lista.add(e);
		
		e = new Endoso(22,1,420,"5560005893","FREDY M�NDEZ JU�REZ","Bonificaci�n de la Comisi�n",strHoy,
				"reciente",1,"PERSONAS");
		lista.add(e);
		
		e = new Endoso(23,1,420,"7003004924","NORMA CASTELLAN TRIVEDI","Correcci�n de Asegurado",strHoy,
				"reciente",1,"PERSONAS");
		lista.add(e);
		
		e = new Endoso(24,1,420,"8000047800","MIGUEL �NGEL HERN�NDEZ HERN�NDEZ","Correcci�n de RFC",strHoy,
				"reciente",1,"DA�OS");
		lista.add(e);
		
		e = new Endoso(25,1,420,"8000047801","V�CTOR ITURBE LARA","Cambio, modificaci�n o correcci�n de placas",strHoy,
				"reciente",1,"MOTOR");
		lista.add(e);
		
		e = new Endoso(26,1,420,"8000047802","ALFONSO VELA JARA","Cambio, modificaci�n o correcci�n de n�mero de motor",strHoy,
				"reciente",1,"MOTOR");
		lista.add(e);
		
		e = new Endoso(27,1,420,"8000047803","ERIKA FUENTES CASTRO","Correcci�n de RFC",strHoy,
				"reciente",1,"PERSONAS");
		lista.add(e);
		
		e = new Endoso(28,1,420,"8000047804","MARGARITA ARRAZOLA DE LA CRUZ","Correcci�n de RFC",strHoy,
				"reciente",1,"DA�OS");
		lista.add(e);
		
		e = new Endoso(29,1,420,"8000047805","JORGE ENRIQUE PACHECO MATA","Cambio, modificaci�n o correcci�n de n�mero de serie",strHoy,
				"reciente",1,"MOTOR");
		lista.add(e);
		
		e = new Endoso(30,1,420,"8000047806","ADELA ALVARADO ALVES","Correcci�n de RFC",strHoy,
				"reciente",1,"PERSONAS");
		lista.add(e);
		
		return lista;			
	}
}
