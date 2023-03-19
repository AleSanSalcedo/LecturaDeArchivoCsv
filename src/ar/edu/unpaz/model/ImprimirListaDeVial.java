package ar.edu.unpaz.model;

import java.util.*;
import ar.edu.unpaz.repository.Vial;

public class ImprimirListaDeVial {

	public static void printVial(){
		List<Vial> vial= (List<Vial>) LeerArchivosCsv.leer();
		for(int i =0; i<vial.size();i++) {
			System.out.println(vial.get(i).getNúmeroDeHoja()+","+vial.get(i).getTipoObjeto()+","+vial.get(i).getIdentificadorTramo()
					+","+vial.get(i).getTipoCamino()+","+vial.get(i).getLongitud());
		}
	}
}
