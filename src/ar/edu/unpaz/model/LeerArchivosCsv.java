package ar.edu.unpaz.model;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import ar.edu.unpaz.repository.Vial;

public class LeerArchivosCsv{


	public static ArrayList<Vial> leer() {
		String path = "F:\\Ale\\Programas\\Made in Derqui\\LecturaDeArchivoCsv\\vial.csv"; // ruta del archivo CSV
		List <Vial> vial = new ArrayList<>();
		
	    try (BufferedReader archive = new BufferedReader(new FileReader(path))) {
	        String line;

	        while ((line = archive.readLine()) != null) {
	            String[] data = line.split(","); // separar los datos por comas
	            Vial aux = new Vial (data[0],data[1],data[2],data[3],data[4]);
	            vial.add(aux);
	        }
	    } catch (IOException e) {
	        System.out.println("Error al leer el archivo CSV: " + e.getMessage());
	    }
		return (ArrayList<Vial>) vial;
		
	}
}
