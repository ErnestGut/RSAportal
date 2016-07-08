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
		
		Endoso e = new Endoso(1,1,420,"8000047591","JUAN CARLOS CASTRO NAVA","Bonificación de la comisión o cesión de la comisión",strHoy,
				"pendiente",1,"DAÑOS");
		lista.add(e);
		
		e = new Endoso(2,1,420,"7600084572","ENRIQUE ANTONIO AUTRIQUE","Cancelación de pólizasS",strHoy,
				"pendiente",1,"DAÑOS");
		lista.add(e);
		
		e = new Endoso(3,1,420,"0018390004","ANGELICA MARTINEZ NEQUIZ","Alta de cobertura",strHoy,
				"pendiente",1,"MOTOR");
		lista.add(e);
		
		e = new Endoso(4,1,420,"8000047592","MANUEL ANTONIO GUILLÉN GÓMEZ","Alta de Beneficiario Preferente",strHoy,
				"pendiente",1,"PERSONAS");
		lista.add(e);
		
		e = new Endoso(5,1,420,"8000047593","FELIPE JACOB GALINDO","Cambios de forma de pago",strHoy,
				"pendiente",1,"MOTOR");
		lista.add(e);
		
		e = new Endoso(6,1,420,"8000047594","ERNESTO GUTIÉRREZ DEGOLLADO","Cambios de forma de pago",strHoy,
				"pendiente",1,"DAÑOS");
		lista.add(e);
		
		e = new Endoso(7,1,420,"8000047595","ANDRÉS SANTILLÁN CÁRDENAS","Alta de situación de riesgo, Alta de asegurado",strHoy,
				"pendiente",1,"PERSONAS");
		lista.add(e);
		
		e = new Endoso(8,1,420,"8000047596","JUAN FERNÁNDEZ ISLAS","Baja de situación de riesgo, Baja de asegurado",strHoy,
				"pendiente",1,"PERSONAS");
		lista.add(e);
		
		e = new Endoso(9,1,420,"8000047597","DAFNE SOLIS","Cancelación de pólizas",strHoy,
				"pendiente",1,"MOTOR");
		lista.add(e);
		
		e = new Endoso(10,1,420,"8000047598","LUIS FERNANDO MAQUEDA","Cambios de forma de pago",strHoy,
				"pendiente",1,"DAÑOS");
		lista.add(e);
		
		e = new Endoso(11,1,420,"8000047599","FRANCISCO AYALA MARTÍNEZ","Alta de Beneficiario Preferente",strHoy,
				"pendiente",1,"DAÑOS");
		lista.add(e);
		
		e = new Endoso(12,1,420,"8000047100","HAZIEL ISAÍ GUILLÉN LÓPEZ","Alta de Beneficiario Preferente",strHoy,
				"pendiente",1,"MOTOR");
		lista.add(e);
		
		e = new Endoso(13,1,420,"8000047101","EDY AVENDAÑO RAMÍREZ","Alta de Beneficiario Preferente",strHoy,
				"pendiente",1,"PERSONAS");
		lista.add(e);
		
		e = new Endoso(14,1,420,"8000047102","JOSÉ LUIS GONZÁLEZ GALVEZ","Alta de Beneficiario Preferente",strHoy,
				"pendiente",1,"DAÑOS");
		lista.add(e);
		
		e = new Endoso(15,1,420,"8000047103","JORGE ALBERTO LASTRA PÉREZ","Alta de Beneficiario Preferente",strHoy,
				"pendiente",1,"MOTOR");
		lista.add(e);
		
		return lista;
	}
	
	private List<Endoso> obtenerEndososRecientes(){
		Date hoy = new Date();
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		String strHoy = df.format(hoy);
		
		List<Endoso> lista = new ArrayList<>();
		
		Endoso e = new Endoso(16,1,420,"8000047933","JOSE MANUEL ESCOBAR","Corrección de RFC",strHoy,
				"reciente",1,"DAÑOS");
		lista.add(e);
		
		e = new Endoso(17,1,420,"8100485006","OMAR ACEVES CORTEZ","Cambio de Forma de Pago",strHoy,
				"reciente",1,"DAÑOS");
		lista.add(e);
		
		e = new Endoso(18,1,420,"8100004857","ANDRE CASTILLO BARRÓN","Corrección de RFC",strHoy,
				"reciente",1,"MOTOR");
		lista.add(e);
		
		e = new Endoso(19,1,420,"9999999999","ALEJANDRA CHAVEZ MARTI","Cancelación de Póliza",strHoy,
				"reciente",1,"PERSONAS");
		lista.add(e);
		
		e = new Endoso(20,1,420,"8000047933","JOSE TERRERO FENDER","Cesión de la Comisión",strHoy,
				"reciente",1,"MOTOR");
		lista.add(e);
		
		e = new Endoso(21,1,420,"5560005892","ANTONIO CASTRO NERI","Bonificación de la Comisión",strHoy,
				"reciente",1,"DAÑOS");
		lista.add(e);
		
		e = new Endoso(22,1,420,"5560005893","FREDY MÉNDEZ JUÁREZ","Bonificación de la Comisión",strHoy,
				"reciente",1,"PERSONAS");
		lista.add(e);
		
		e = new Endoso(23,1,420,"7003004924","NORMA CASTELLAN TRIVEDI","Corrección de Asegurado",strHoy,
				"reciente",1,"PERSONAS");
		lista.add(e);
		
		e = new Endoso(24,1,420,"8000047800","MIGUEL ÁNGEL HERNÁNDEZ HERNÁNDEZ","Corrección de RFC",strHoy,
				"reciente",1,"DAÑOS");
		lista.add(e);
		
		e = new Endoso(25,1,420,"8000047801","VÍCTOR ITURBE LARA","Cambio, modificación o corrección de placas",strHoy,
				"reciente",1,"MOTOR");
		lista.add(e);
		
		e = new Endoso(26,1,420,"8000047802","ALFONSO VELA JARA","Cambio, modificación o corrección de número de motor",strHoy,
				"reciente",1,"MOTOR");
		lista.add(e);
		
		e = new Endoso(27,1,420,"8000047803","ERIKA FUENTES CASTRO","Corrección de RFC",strHoy,
				"reciente",1,"PERSONAS");
		lista.add(e);
		
		e = new Endoso(28,1,420,"8000047804","MARGARITA ARRAZOLA DE LA CRUZ","Corrección de RFC",strHoy,
				"reciente",1,"DAÑOS");
		lista.add(e);
		
		e = new Endoso(29,1,420,"8000047805","JORGE ENRIQUE PACHECO MATA","Cambio, modificación o corrección de número de serie",strHoy,
				"reciente",1,"MOTOR");
		lista.add(e);
		
		e = new Endoso(30,1,420,"8000047806","ADELA ALVARADO ALVES","Corrección de RFC",strHoy,
				"reciente",1,"PERSONAS");
		lista.add(e);
		
		return lista;			
	}
}
